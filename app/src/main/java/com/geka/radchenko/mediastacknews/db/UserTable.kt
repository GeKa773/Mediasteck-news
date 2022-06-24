package com.geka.radchenko.mediastacknews.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = USER_TABLE, indices = [Index(USER_TABLE_ID)])
class UserTable(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = USER_TABLE_ID)
    val id: Int,
    @ColumnInfo(name = USER_ID)
    val userId: Int,
    @ColumnInfo(name = USER_PHONE)
    val phone: String,
    @ColumnInfo(name = USER_NAME)
    val name: String,
    @ColumnInfo(name = USER_LAST_NAME)
    val lastName: String,
    @ColumnInfo(name = USER_IMAGE)
    val image: String?,
    @ColumnInfo(name = USER_JOB)
    val job: String,
    @ColumnInfo(name = USER_GENDER)
    val gender: String,
    @ColumnInfo(name = USER_ABOUT)
    val about: String,
    @ColumnInfo(name = USER_EMAIL)
    val email: String
)

const val USER_TABLE = "user_table"
const val USER_TABLE_ID = "id"
const val USER_ID = "user_id"
const val USER_IS_REGISTERED = "is_registered"
const val USER_PHONE = "phone"
const val USER_NAME = "name"
const val USER_LAST_NAME = "last_name"
const val USER_EMAIL = "email"
const val USER_IMAGE = "image"
const val USER_JOB = "job"
const val USER_GENDER = "gender"
const val USER_ABOUT = "about"