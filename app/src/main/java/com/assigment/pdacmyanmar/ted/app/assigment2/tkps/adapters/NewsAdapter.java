package com.assigment.pdacmyanmar.ted.app.assigment2.tkps.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.assigment.pdacmyanmar.ted.app.assigment2.tkps.R;
import com.assigment.pdacmyanmar.ted.app.assigment2.tkps.delegates.NewsDelegate;
import com.assigment.pdacmyanmar.ted.app.assigment2.tkps.viewholders.NewsViewHolder;


public class NewsAdapter extends RecyclerView.Adapter {

    private NewsDelegate mNewsDelegate;

    public NewsAdapter(NewsDelegate newsDelegate) {
        mNewsDelegate = newsDelegate;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.view_holder_ted_talk, parent, false);

        return new NewsViewHolder(view, mNewsDelegate);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }
}
