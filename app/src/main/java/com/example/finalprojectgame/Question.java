package com.example.finalprojectgame;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.Random;

import static com.example.finalprojectgame.SQLiteHelper.COLUMN_QUESTION_TEXT;

public class Question {
    private int id;
    private String question_text;
    private String question_a;
    private String question_b;
    private String question_c;
    private String question_d;
    private String correct;
    private int score;

    private static String[] all_columns = {SQLiteHelper.COLUMN_ID, COLUMN_QUESTION_TEXT, SQLiteHelper.COLUMN_ANSWER_A, SQLiteHelper.COLUMN_ANSWER_B, SQLiteHelper.COLUMN_ANSWER_C, SQLiteHelper.COLUMN_ANSWER_D, SQLiteHelper.COLUMN_CORRECT, SQLiteHelper.COLUMN_SCORE};

    public Question() {

    }

    public String getQuestion_text() {
        return this.question_text;
    }
    public void setQuestion_text(String question_text) {this.question_text = question_text;}

    public String getQuestion_a() {
        return  this.question_a;
    }
    public void setQuestion_a(String question_a) {this.question_a = question_a;}

    public String getQuestion_b() {
        return  this.question_b;
    }
    public void setQuestion_b(String question_b) {
        this.question_b = question_b;
    }

    public String getQuestion_c() {
        return this.question_c;
    }
    public void setQuestion_c(String question_c) {
        this.question_c = question_c;
    }

    public String getQuestion_d() {
        return this.question_d;
    }
    public void setQuestion_d(String question_d) {
        this.question_d = question_d;
    }

    public String getCorrect() {
        return this.correct;
    }
    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public int getScore() {
        return this.score;
    }
    public void setScore(int score) {
        this.score = score;
    }




    public static ArrayList<Question> newGame(Context context ){

        ArrayList<Question> questions = new ArrayList<>();
        ArrayList<Question> gamequestions = new ArrayList<>();

        SQLiteHelper helper = new SQLiteHelper(context);
        SQLiteDatabase database = helper.getWritableDatabase();

        Cursor cursor = database.query(SQLiteHelper.TABLE_QUESTIONS, all_columns, null, null, null, null, null, null);

        cursor.moveToFirst();

        while (!cursor.isAfterLast()) {

            Question question = new Question();
            question.id = cursor.getInt(0);
            question.question_text = cursor.getString(1);
            question.question_a = cursor.getString(2);
            question.question_b = cursor.getString(3);
            question.question_c = cursor.getString(4);
            question.question_d = cursor.getString(5);
            question.correct = cursor.getString(6);
            question.score = cursor.getInt(7);

            questions.add(question);
            cursor.moveToNext();
        }
        Random random = new Random();

        for(int i =0; i<5; i++){
            int question_number = random.nextInt(questions.size()-1);
            gamequestions.add(questions.get(question_number));
            questions.remove(question_number);
        }


        return gamequestions;
    }

}


