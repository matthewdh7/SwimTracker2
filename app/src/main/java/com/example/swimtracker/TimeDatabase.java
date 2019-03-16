package com.example.swimtracker;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Time.class}, version = 1)
public abstract class TimeDatabase extends RoomDatabase {

    private static TimeDatabase instance;

    public abstract TimeDao timeDao();

    public static synchronized TimeDatabase getInstance(Context context) {
        if(instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    TimeDatabase.class, "Time_Database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }
        return instance;
    }

    private static Callback roomCallback = new Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private TimeDao timeDao;

        private PopulateDbAsyncTask(TimeDatabase db) {
            timeDao = db.timeDao();
        }
        @Override
        protected Void doInBackground(Void... voids) {
            timeDao.insert(new Time("50 Free", "0:00.00", 1));
            timeDao.insert(new Time("100 Free", "0:00.00", 2));
            timeDao.insert(new Time("200 Free", "0:00.00", 3));
            return null;
        }
    }
}
