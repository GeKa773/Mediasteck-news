package com.geka.radchenko.mediastacknews.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.geka.radchenko.mediastacknews.db.dao.UserDao

@Database(version = VERSION, exportSchema = false, entities = [UserTable::class])
abstract class DataBase : RoomDatabase() {
    abstract fun userDao(): UserDao
}

const val VERSION = 0
const val DATABASE_NAME = "appDb"