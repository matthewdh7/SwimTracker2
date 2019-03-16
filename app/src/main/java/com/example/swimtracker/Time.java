package com.example.swimtracker;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "time_table") //Tells room to create a data table
public class Time {

    @PrimaryKey(autoGenerate = true) //Auto increments id each new data
    private int id;

    private String name;
    private String bestTime;
    private int listNum;

    public Time(String name, String bestTime, int listNum) {
        this.name = name;
        this.bestTime = bestTime;
        this.listNum = listNum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBestTime() { return bestTime; }

    public int getListNum() {
        return listNum;
    }
}
