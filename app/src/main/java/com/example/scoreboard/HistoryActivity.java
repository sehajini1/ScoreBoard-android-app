package com.example.scoreboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        //data to populate the RecyclerView with
        ArrayList<String> scoreHistory = new ArrayList<>();
        scoreHistory.add("SL vs AUS - 58/9");
        scoreHistory.add("SL vs IND - 58/9");
        scoreHistory.add("SL vs PAK - 58/9");
        scoreHistory.add("SL vs AUS - 58/9");
        scoreHistory.add("SL vs AUS - 58/9");

        //set up the RecyclerView
        RecyclerView rvScoreHistory = findViewById(R.id.tv_score_history);
        rvScoreHistory.setLayoutManager(new LinearLayoutManager(this));
        HistoryViewAdapter adapter = new HistoryViewAdapter(this,scoreHistory);
        rvScoreHistory.setAdapter(adapter);
    }
}