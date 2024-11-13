package com.example.smartmeterapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.smartmeterapp.model.User

@Dao
interface UserDao {
    @Query("SELECT * FROM User WHERE id = :userId")
    fun getUserById(userId: Int): User?

    @Insert
    fun insertUser(user: User)
}
