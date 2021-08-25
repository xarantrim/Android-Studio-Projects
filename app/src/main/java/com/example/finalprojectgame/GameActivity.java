package com.example.finalprojectgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity implements View.OnClickListener{
    ArrayList<Question> questions;
    TextView txtVw_questionText;
    TextView btn_answerA;
    TextView btn_answerB;
    TextView btn_answerC;
    TextView btn_answerD;
    int position = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        questions = Question.newGame(GameActivity.this);
       /* Log.d("question", questions.get(0).getQuestion_c()); */

        txtVw_questionText = findViewById(R.id.txtVw_questionText);
        txtVw_questionText.setText(questions.get(position).getQuestion_text());

        btn_answerA = findViewById(R.id.btn_answerA);
        btn_answerA.setText(questions.get(position).getQuestion_a());
        btn_answerA.setOnClickListener(this);

        btn_answerB = findViewById(R.id.btn_answerB);
        btn_answerB.setText(questions.get(position).getQuestion_b());
        btn_answerB.setOnClickListener(this);

        btn_answerC = findViewById(R.id.btn_answerC);
        btn_answerC.setText(questions.get(position).getQuestion_c());
        btn_answerC.setOnClickListener(this);

        btn_answerD = findViewById(R.id.btn_answerD);
        btn_answerD.setText(questions.get(position).getQuestion_d());
        btn_answerD.setOnClickListener(this);

        }

    @Override
    public void onClick(View v) {
       Button btn_press = (Button) v;
       if( btn_press.getText().toString().equals(questions.get(position).getCorrect())){
           this.score += questions.get(position).getScore();

       }
        position++;
        if(position==5){
            Intent intent = new Intent(GameActivity.this, GameScoreActivity.class);
            intent.putExtra("score", this.score);
            startActivity(intent);
            GameActivity.this.finish();
        }
        else {
            txtVw_questionText.setText(questions.get(position).getQuestion_text());
            btn_answerA.setText(questions.get(position).getQuestion_a());
            btn_answerB.setText(questions.get(position).getQuestion_b());
            btn_answerC.setText(questions.get(position).getQuestion_c());
            btn_answerD.setText(questions.get(position).getQuestion_d());
        }

    }
}


