package com.geka.radchenko.mediastacknews.repository

import com.geka.radchenko.mediastacknews.api.Api
import com.geka.radchenko.mediastacknews.db.DataBase
import com.geka.radchenko.mediastacknews.db.UserTable
import com.geka.radchenko.mediastacknews.prefs.PreferencesManager
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository
@Inject constructor(
    private val api: Api,
    private val dataBase: DataBase,
    private val prefs: PreferencesManager
) {

    /*----------------------------------- API ---------------------------------------------*/

    /*----------------------------------- DB ----------------------------------------------*/

    suspend fun getUser() = dataBase.userDao().getUser()
    fun getUserFlow() = dataBase.userDao().getUserFlow()
    suspend fun addUser(user: UserTable) {
        dataBase.userDao().update(user)
    }

    suspend fun deleteUser(user: UserTable) {
        dataBase.userDao().delete(user)
    }

    /*----------------------------------- PREFS -------------------------------------------*/

    var firstStart: Boolean
        set(value) {
            prefs.firstStart = value
        }
        get() = prefs.firstStart
}