package com.geka.radchenko.mediastacknews.di

import android.app.Application
import androidx.room.Room
import com.geka.radchenko.mediastacknews.api.Api
import com.geka.radchenko.mediastacknews.db.DATABASE_NAME
import com.geka.radchenko.mediastacknews.db.DataBase
import com.geka.radchenko.mediastacknews.prefs.PreferencesImpl
import com.geka.radchenko.mediastacknews.prefs.PreferencesManager
import com.geka.radchenko.mediastacknews.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoriesModule {

    @Provides
    @Singleton
    fun provideRepository(
        api: Api,
        dataBase: DataBase,
        preferencesManager: PreferencesManager
    ): Repository {
        return Repository(api, dataBase, preferencesManager)
    }

    @Provides
    @Singleton
    fun provideDatabase(application: Application): DataBase {
        return Room.databaseBuilder(application, DataBase::class.java, DATABASE_NAME)
            .fallbackToDestructiveMigration().build()
    }

    @Provides
    @Singleton
    fun providePrefs(application: Application): PreferencesManager {
        return PreferencesImpl(application)
    }

}