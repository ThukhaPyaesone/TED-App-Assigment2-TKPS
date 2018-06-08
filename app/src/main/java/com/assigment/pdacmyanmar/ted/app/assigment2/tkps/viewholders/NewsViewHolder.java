package com.assigment.pdacmyanmar.ted.app.assigment2.tkps.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.assigment.pdacmyanmar.ted.app.assigment2.tkps.delegates.NewsDelegate;

public class NewsViewHolder extends RecyclerView.ViewHolder {

    private NewsDelegate mNewsDelegate;

    public NewsViewHolder(View itemView, NewsDelegate newsDelegate) {
        super(itemView);
        mNewsDelegate = newsDelegate;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNewsDelegate.onTapNews();
            }
        });
    }
}


