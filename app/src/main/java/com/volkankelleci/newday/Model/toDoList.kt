package com.volkankelleci.newday.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class toDoList(
    @ColumnInfo
    val yapilacaklar:String?,
    @ColumnInfo
    val alinacakResim:String?,

){
    @PrimaryKey(autoGenerate = true)
    var uuid:Int =0
}
