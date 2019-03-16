package com.example.swimtracker;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TimeAdapter extends RecyclerView.Adapter<TimeAdapter.TimeHolder> {
    private List<Time> times = new ArrayList<>();

    @NonNull
    @Override
    public TimeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.time_item, parent, false);
        return new TimeHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TimeHolder holder, int position) {
        Time currentTime  = times.get(position);
        holder.textViewEvent.setText(((Time) currentTime).getName());
        holder.textViewBestTime.setText(currentTime.getBestTime());
    }

    @Override
    public int getItemCount() {
        return times.size();
    }

    public void setTimes(List<Time> times) {
        this.times = times;
        notifyDataSetChanged();
    }

    class TimeHolder extends RecyclerView.ViewHolder {
        private TextView textViewEvent;
        private TextView textViewBestTime;

        public TimeHolder(View itemView) {
            super(itemView);
            textViewEvent = itemView.findViewById(R.id.text_view_event);
            textViewBestTime = itemView.findViewById(R.id.text_view_bestTime);
        }
    }
}