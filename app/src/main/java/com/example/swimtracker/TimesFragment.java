package com.example.swimtracker;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

/**
 * Created by hungmat20 on 3/6/2019.
 */

public class TimesFragment extends Fragment {
    private TimeViewModel timeViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_times, container, false);

        RecyclerView recyclerView= view.findViewById(R.id.recyclerViewTimes);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);

        final TimeAdapter adapter = new TimeAdapter();
        recyclerView.setAdapter(adapter);

        timeViewModel = ViewModelProviders.of(this).get(TimeViewModel.class);
        timeViewModel.getAllTimes().observe(this, new Observer<List<Time>>() {
            @Override
            public void onChanged(List<Time> times) {
                adapter.setTimes(times);
            }
        });

        return view;
    }
}
