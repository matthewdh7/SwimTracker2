package com.example.swimtracker;

import java.sql.Array;
import java.util.ArrayList;

public class TimeObject {

    private String userTime;
    private String bestTime;
    private int minutes;
    private int seconds;
    private ArrayList<String> pastTimes= new ArrayList<> ();

    public TimeObject(String bestTime, int minutes, int seconds) {
        this.userTime = userTime;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String getUserTime() {
        return userTime;
    }

    public void setUserTime(String userTime) {
        this.userTime = userTime;
    }

    public String getBestTime() {
        return bestTime;
    }

    public void setBestTime(String bestTime) {
        this.bestTime = bestTime;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
