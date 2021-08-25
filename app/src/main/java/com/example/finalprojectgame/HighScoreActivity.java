package com.example.finalprojectgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import java.util.HashSet;
import java.util.Set;

public class HighScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_score);

        SharedPreferences sharedPreferences = getSharedPreferences("HIGHSCORE", MODE_PRIVATE);
        Set<String> highScores = sharedPreferences.getStringSet("highScores", new HashSet<>());
        for (String score : highScores){
            Log.d("HIGHSCORE", score);
        }
    }
}