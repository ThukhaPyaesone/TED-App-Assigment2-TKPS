package com.assigment.pdacmyanmar.ted.app.assigment2.tkps.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.assigment.pdacmyanmar.ted.app.assigment2.tkps.R;
import com.assigment.pdacmyanmar.ted.app.assigment2.tkps.adapters.WatchNextAdapter;


public class TedTalkDetailsActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tedtalk_details);

        RecyclerView rvNews = findViewById(R.id.rv_watch_next);

        WatchNextAdapter watchNextAdapter = new WatchNextAdapter();
        rvNews.setAdapter(watchNextAdapter);
        rvNews.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));
    }
}
