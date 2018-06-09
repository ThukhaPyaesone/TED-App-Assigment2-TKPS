package com.assigment.pdacmyanmar.ted.app.assigment2.tkps.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.assigment.pdacmyanmar.ted.app.assigment2.tkps.R;
import com.assigment.pdacmyanmar.ted.app.assigment2.tkps.viewholders.WatchNextViewHolder;

public class WatchNextAdapter extends RecyclerView.Adapter {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view_holder_watch_next, parent, false);

        return new WatchNextViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
