package com.example.dbtest.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StudentDAO {


    //todo: add query to get all student records


    @Insert
    fun insert(vararg s:Student)

}