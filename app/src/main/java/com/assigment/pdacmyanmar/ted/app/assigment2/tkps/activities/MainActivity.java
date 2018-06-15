package com.assigment.pdacmyanmar.ted.app.assigment2.tkps.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.assigment.pdacmyanmar.ted.app.assigment2.tkps.R;
import com.assigment.pdacmyanmar.ted.app.assigment2.tkps.adapters.NewsAdapter;
import com.assigment.pdacmyanmar.ted.app.assigment2.tkps.data.models.TedTalksModel;
import com.assigment.pdacmyanmar.ted.app.assigment2.tkps.delegates.TedTalksDelegate;

public class MainActivity extends AppCompatActivity implements TedTalksDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        RecyclerView rvNews = findViewById(R.id.rv_news);

        NewsAdapter newsAdapter = new NewsAdapter(this);
        rvNews.setAdapter(newsAdapter);
        rvNews.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TedTalksModel.getObjInstance().loadTedTalkList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTapViewItem() {
        Intent intent = new Intent(getApplicationContext(), TedTalkDetailsActivity.class);
        startActivity(intent);
    }

}
