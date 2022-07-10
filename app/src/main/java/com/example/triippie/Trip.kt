package com.example.triippie
import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName = "trips_table")
class Trip(@ColumnInfo(name="text")val text:String){
           @PrimaryKey(autoGenerate = true)var id=0

}