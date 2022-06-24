package com.geka.radchenko.mediastacknews.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.geka.radchenko.mediastacknews.db.USER_TABLE
import com.geka.radchenko.mediastacknews.db.UserTable
import kotlinx.coroutines.flow.Flow

@Dao
abstract class UserDao : BaseDao<UserTable>() {

    @Query("SELECT * FROM $USER_TABLE")
    abstract suspend fun getUser(): UserTable?

    @Query("SELECT * FROM $USER_TABLE")
    abstract fun getUserFlow(): Flow<UserTable?>
}