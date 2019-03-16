package com.example.swimtracker;

import android.app.Application;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class TimeViewModel extends AndroidViewModel {
    private TimeRepository repository;
    private LiveData<List<Time>> allTimes;

    public TimeViewModel(@NonNull Application application) {
        super(application);
        repository = new TimeRepository(application);
        allTimes = repository.getAllTimes();
    }

    public void insert(Time time) {
        repository.insert(time);
    }

    public void update(Time time) {
        repository.update(time);
    }

    public void delete(Time time) {
        repository.delete(time);
    }

    public LiveData<List<Time>> getAllTimes() {
        return allTimes;
    }
}
