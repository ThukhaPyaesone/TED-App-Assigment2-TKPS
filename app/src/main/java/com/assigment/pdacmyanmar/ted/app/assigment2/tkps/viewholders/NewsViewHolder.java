package com.assigment.pdacmyanmar.ted.app.assigment2.tkps.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.assigment.pdacmyanmar.ted.app.assigment2.tkps.delegates.TedTalksDelegate;

public class NewsViewHolder extends RecyclerView.ViewHolder {

    private TedTalksDelegate mTedTalkDelegate;

    public NewsViewHolder(View itemView, TedTalksDelegate newsDelegate) {
        super(itemView);
        mTedTalkDelegate = newsDelegate;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTedTalkDelegate.onTapNews();
            }
        });
    }
}


