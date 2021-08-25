package com.example.finalprojectgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class GameScoreActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_score);
        TextView txtVw_score = findViewById(R.id.txtVw_score);
        txtVw_score.setText(String.valueOf(getIntent().getExtras().getInt("score")));

        SharedPreferences sharedPreferences = getSharedPreferences("HIGHSCORE", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Set<String> highScores = sharedPreferences.getStringSet("highScores", new HashSet<>());
        Date now = Calendar.getInstance().getTime();
        highScores.add(now+": "+String.valueOf(getIntent().getExtras().getInt("score")));
        editor.putStringSet("highScores", highScores);
        editor.commit();

    }
}