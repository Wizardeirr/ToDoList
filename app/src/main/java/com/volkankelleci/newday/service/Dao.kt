package com.volkankelleci.newday.service

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.volkankelleci.newday.Model.toDoList

@androidx.room.Dao
interface Dao {

    @Insert
    suspend fun insertAll(vararg yapilacaklar:toDoList):List<Long>

    @Query("SELECT * FROM toDoList")
    suspend fun getAll():List<toDoList>

    @Query("DELETE FROM toDoList")
    suspend fun deleteAlltoDoList()
}