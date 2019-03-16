package com.example.swimtracker;

public class TimeStandardObject extends TimeObject {

    private String silver;
    private int silverMinutes;
    private int silverSeconds;
    private String gold;
    private int goldMinutes;
    private int goldSeconds;
    private String champs;
    private int champsMinutes;
    private int champsSeconds;

    public TimeStandardObject(String userTime, int minutes, int seconds, String silver, int silverMinutes, int silverSeconds, String gold, int goldMinutes, int goldSeconds, String champs, int champsMinutes, int champsSeconds) {
        super(userTime, minutes, seconds);
        this.silver = silver;
        this.silverMinutes = silverMinutes;
        this.silverSeconds = silverSeconds;
        this.gold = gold;
        this.goldMinutes = goldMinutes;
        this.goldSeconds = goldSeconds;
        this.champs = champs;
        this.champsMinutes = champsMinutes;
        this.champsSeconds = champsSeconds;
    }

    public String getSilver() {
        return silver;
    }

    public int getSilverMinutes() {
        return silverMinutes;
    }

    public int getSilverSeconds() {
        return silverSeconds;
    }

    public String getGold() {
        return gold;
    }

    public int getGoldMinutes() {
        return goldMinutes;
    }

    public int getGoldSeconds() {
        return goldSeconds;
    }

    public String getChamps() {
        return champs;
    }

    public int getChampsMinutes() {
        return champsMinutes;
    }

    public int getChampsSeconds() {
        return champsSeconds;
    }
}
