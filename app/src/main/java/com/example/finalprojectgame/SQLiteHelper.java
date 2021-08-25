package com.example.finalprojectgame;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLiteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "finalProjectGame_db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_QUESTIONS = "questions";
    public static final String COLUMN_ID = "id";
    public static  final String COLUMN_QUESTION_TEXT = "question_text";
    public static  final String COLUMN_ANSWER_A = "answer_a";
    public static final String COLUMN_ANSWER_B = "answer_b";
    public static final String COLUMN_ANSWER_C = "answer_c";
    public static final String COLUMN_ANSWER_D = "answer_d";
    public static final String COLUMN_CORRECT = "correct";
    public static final String COLUMN_SCORE =  "score";


    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_QUESTIONS+" ("+COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+COLUMN_QUESTION_TEXT+" TEXT NOT NULL, "+COLUMN_ANSWER_A+" TEXT NOT NULL, "+COLUMN_ANSWER_B+" TEXT NOT NULL, "+COLUMN_ANSWER_C+" TEXT NOT NULL, "+COLUMN_ANSWER_D+" TEXT NOT NULL, "+COLUMN_CORRECT+" TEXT NOT NULL, "+COLUMN_SCORE+" INTEGER NOT NULL)");

        ContentValues values = new ContentValues();

        values.put(COLUMN_QUESTION_TEXT, "When the World War I ended?");
        values.put(COLUMN_ANSWER_A, "11 Noemvriou 1918");
        values.put(COLUMN_ANSWER_B, "15 Noemvriou 1911");
        values.put(COLUMN_ANSWER_C, "20 Noemvriou 1913");
        values.put(COLUMN_ANSWER_D, "30 Noemvriou 1914");
        values.put(COLUMN_CORRECT, "11 Noemvriou 1918");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "Where can you find the oldest ancient wonder of the world?");
        values.put(COLUMN_ANSWER_A, "The Great Pyramid of Giza is located in Egypt");
        values.put(COLUMN_ANSWER_B, "The Great Pyramid of Giza is located in greece");
        values.put(COLUMN_ANSWER_C, "The Great Pyramid of Giza is located in albania");
        values.put(COLUMN_ANSWER_D, "The Great Pyramid of Giza is located in pakistan");
        values.put(COLUMN_CORRECT, "The Great Pyramid of Giza is located in Egypt");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "Why is most surviving Classical Greek sculpture made of marble?");
        values.put(COLUMN_ANSWER_A, "The original bronze sculptures had intrinsic value and were melted");
        values.put(COLUMN_ANSWER_B, "The original bronze sculptures had intrinsic value and were stolen");
        values.put(COLUMN_ANSWER_C, "The original bronze sculptures had no value and were melted");
        values.put(COLUMN_ANSWER_D, "The original bronze sculptures had were stolen by Mpakos");
        values.put(COLUMN_CORRECT, "The original bronze sculptures had intrinsic value and were melted");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "Which actor starred in a total of seven James Bond movies?");
        values.put(COLUMN_ANSWER_A, "Roger Moore");
        values.put(COLUMN_ANSWER_B, "Mhtsos");
        values.put(COLUMN_ANSWER_C, "Mpakos");
        values.put(COLUMN_ANSWER_D, "Vilson");
        values.put(COLUMN_CORRECT, "Roger Moore");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "Who was the lead singer of Nirvana?");
        values.put(COLUMN_ANSWER_A, "Kurt Cobain");
        values.put(COLUMN_ANSWER_B, "kapoios");
        values.put(COLUMN_ANSWER_C, "Pakistanos");
        values.put(COLUMN_ANSWER_D, "Mpakos");
        values.put(COLUMN_CORRECT, "Kurt Cobain");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "Who sang with Ed Sheeran on the duet song “Perfect”?");
        values.put(COLUMN_ANSWER_A, "Beyoncé");
        values.put(COLUMN_ANSWER_B, "brand pit ");
        values.put(COLUMN_ANSWER_C, "Tom cruise");
        values.put(COLUMN_ANSWER_D, "dicaprio");
        values.put(COLUMN_CORRECT, "Beyoncé");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "According to legend, what item is most effective against werewolves?");
        values.put(COLUMN_ANSWER_A, "Silver");
        values.put(COLUMN_ANSWER_B, "Copper");
        values.put(COLUMN_ANSWER_C, "Diamond");
        values.put(COLUMN_ANSWER_D, "Gold");
        values.put(COLUMN_CORRECT, "Silver");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "If soccer is called football in England, what is American football called in England?");
        values.put(COLUMN_ANSWER_A, "American football");
        values.put(COLUMN_ANSWER_B, "Combball");
        values.put(COLUMN_ANSWER_C, "Handball");
        values.put(COLUMN_ANSWER_D, "Touchdown");
        values.put(COLUMN_CORRECT, "American football");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "How many legs does a spider have?");
        values.put(COLUMN_ANSWER_A, "8");
        values.put(COLUMN_ANSWER_B, "5");
        values.put(COLUMN_ANSWER_C, "4");
        values.put(COLUMN_ANSWER_D, "10");
        values.put(COLUMN_CORRECT, "8");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "What is the name of the toy cowboy in Toy Story?");
        values.put(COLUMN_ANSWER_A, "Woody");
        values.put(COLUMN_ANSWER_B, "patatas");
        values.put(COLUMN_ANSWER_C, "mpazlaikiar");
        values.put(COLUMN_ANSWER_D, "deinosauros");
        values.put(COLUMN_CORRECT, "Woody");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "What is the color of an emerald?");
        values.put(COLUMN_ANSWER_A, "Green");
        values.put(COLUMN_ANSWER_B, "red");
        values.put(COLUMN_ANSWER_C, "blue");
        values.put(COLUMN_ANSWER_D, "black");
        values.put(COLUMN_CORRECT, "Green");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "What is something you hit with a hammer?");
        values.put(COLUMN_ANSWER_A, "A nail");
        values.put(COLUMN_ANSWER_B, "Ton geitona");
        values.put(COLUMN_ANSWER_C, "thn gunaika sou");
        values.put(COLUMN_ANSWER_D, "thn pe8era sou");
        values.put(COLUMN_CORRECT, "A nail");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "What’s the name of a place you go to see lots of animals?");
        values.put(COLUMN_ANSWER_A, "The zoo");
        values.put(COLUMN_ANSWER_B, "sto spiti sou");
        values.put(COLUMN_ANSWER_C, "sthn pe8era sou");
        values.put(COLUMN_ANSWER_D, "stous uponomous");
        values.put(COLUMN_CORRECT, "The zoo");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "Whose nose grew longer every time he lied?");
        values.put(COLUMN_ANSWER_A, "Pinocchio");
        values.put(COLUMN_ANSWER_B, "Sora");
        values.put(COLUMN_ANSWER_C, "riku");
        values.put(COLUMN_ANSWER_D, "kairi");
        values.put(COLUMN_CORRECT, "Pinocchio");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "What is the name of the fairy in Peter Pan?");
        values.put(COLUMN_ANSWER_A, "Tinkerbell");
        values.put(COLUMN_ANSWER_B, "Peter pan");
        values.put(COLUMN_ANSWER_C, "Captain Hook");
        values.put(COLUMN_ANSWER_D, "Kamenos");
        values.put(COLUMN_CORRECT, "Tinkerbell");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "If you freeze water, what do you get?");
        values.put(COLUMN_ANSWER_A, "Ice");
        values.put(COLUMN_ANSWER_B, "Alati");
        values.put(COLUMN_ANSWER_C, "Papagalo");
        values.put(COLUMN_ANSWER_D, "ena pakistano");
        values.put(COLUMN_CORRECT, "Ice");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "What colors are the stars on the American flag?");
        values.put(COLUMN_ANSWER_A, "White");
        values.put(COLUMN_ANSWER_B, "Black");
        values.put(COLUMN_ANSWER_C, "Green");
        values.put(COLUMN_ANSWER_D, "Blue");
        values.put(COLUMN_CORRECT, "White");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "Where does the President of the United States live while in office?");
        values.put(COLUMN_ANSWER_A, "The White House");
        values.put(COLUMN_ANSWER_B, "Sto spiti tou");
        values.put(COLUMN_ANSWER_C, "Se ksenodoxeio");
        values.put(COLUMN_ANSWER_D, "Sthn pe8era tou");
        values.put(COLUMN_CORRECT, "The White House");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "How many planets are in our solar system?");
        values.put(COLUMN_ANSWER_A, "8");
        values.put(COLUMN_ANSWER_B, "12");
        values.put(COLUMN_ANSWER_C, "10");
        values.put(COLUMN_ANSWER_D, "7");
        values.put(COLUMN_CORRECT, "8");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "Which ocean is off the California coast?");
        values.put(COLUMN_ANSWER_A, "The Pacific");
        values.put(COLUMN_ANSWER_B, "Atlantic Ocean");
        values.put(COLUMN_ANSWER_C, "Arctic Ocean.");
        values.put(COLUMN_ANSWER_D, "the Indian Ocean");
        values.put(COLUMN_CORRECT, "The Pacific");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "Which Disney movie is Elsa in?");
        values.put(COLUMN_ANSWER_A, "Frozen");
        values.put(COLUMN_ANSWER_B, "Lion King");
        values.put(COLUMN_ANSWER_C, "Mulan");
        values.put(COLUMN_ANSWER_D, "Tarzan");
        values.put(COLUMN_CORRECT, "Frozen");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "Who is Mickey Mouse’s girlfriend?");
        values.put(COLUMN_ANSWER_A, "Minnie Mouse");
        values.put(COLUMN_ANSWER_B, "Daise");
        values.put(COLUMN_ANSWER_C, "Goofy");
        values.put(COLUMN_ANSWER_D, "Donald");
        values.put(COLUMN_CORRECT, "Minnie Mouse");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "Where does Santa Claus live?");
        values.put(COLUMN_ANSWER_A, "The North Pole");
        values.put(COLUMN_ANSWER_B, "The South Pole");
        values.put(COLUMN_ANSWER_C, "The East Pole");
        values.put(COLUMN_ANSWER_D, "The West Pole");
        values.put(COLUMN_CORRECT, "The North Pole");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "Which state is famous for Hollywood?");
        values.put(COLUMN_ANSWER_A, "California");
        values.put(COLUMN_ANSWER_B, "New York");
        values.put(COLUMN_ANSWER_C, "Las Vegas");
        values.put(COLUMN_ANSWER_D, "Texas");
        values.put(COLUMN_CORRECT, "California");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "What type of fish is Nemo?");
        values.put(COLUMN_ANSWER_A, "A clownfish");
        values.put(COLUMN_ANSWER_B, "tsipoura");
        values.put(COLUMN_ANSWER_C, "mpakaliaros");
        values.put(COLUMN_ANSWER_D, "karxarias");
        values.put(COLUMN_CORRECT, "A clownfish");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, " What do caterpillars turn into?");
        values.put(COLUMN_ANSWER_A, "Butterflies");
        values.put(COLUMN_ANSWER_B, "Pakistanoi");
        values.put(COLUMN_ANSWER_C, "Se pe8eres");
        values.put(COLUMN_ANSWER_D, "Se agrioxoiro");
        values.put(COLUMN_CORRECT, "Butterflies");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "What is the color of a school bus?");
        values.put(COLUMN_ANSWER_A, "Yellow");
        values.put(COLUMN_ANSWER_B, "Black");
        values.put(COLUMN_ANSWER_C, "White");
        values.put(COLUMN_ANSWER_D, "Green");
        values.put(COLUMN_CORRECT, "Yellow");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "What do you use to write on a blackboard?");
        values.put(COLUMN_ANSWER_A, "Chalk");
        values.put(COLUMN_ANSWER_B, "me xeria ");
        values.put(COLUMN_ANSWER_C, "me kurompogies");
        values.put(COLUMN_ANSWER_D, "me nero");
        values.put(COLUMN_CORRECT, "Chalk");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "On which holiday do you go trick-or-treating?");
        values.put(COLUMN_ANSWER_A, "Halloween");
        values.put(COLUMN_ANSWER_B, "Christmas");
        values.put(COLUMN_ANSWER_C, "Pasxa");
        values.put(COLUMN_ANSWER_D, "kalokairi");
        values.put(COLUMN_CORRECT, "Halloween");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "How many pairs of wings do bees have?");
        values.put(COLUMN_ANSWER_A, "2");
        values.put(COLUMN_ANSWER_B, "4");
        values.put(COLUMN_ANSWER_C, "5");
        values.put(COLUMN_ANSWER_D, "6");
        values.put(COLUMN_CORRECT, "2");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "What is a doe?");
        values.put(COLUMN_ANSWER_A, "A female deer");
        values.put(COLUMN_ANSWER_B, "den exw idea");
        values.put(COLUMN_ANSWER_C, "o mpakos");
        values.put(COLUMN_ANSWER_D, "geitonas");
        values.put(COLUMN_CORRECT, "A female deer");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, " What do bees make?");
        values.put(COLUMN_ANSWER_A, "Honey");
        values.put(COLUMN_ANSWER_B, "alati");
        values.put(COLUMN_ANSWER_C, "magioneza");
        values.put(COLUMN_ANSWER_D, "pitsa");
        values.put(COLUMN_CORRECT, "Honey");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "How many days are in a year?");
        values.put(COLUMN_ANSWER_A, "365");
        values.put(COLUMN_ANSWER_B, "400");
        values.put(COLUMN_ANSWER_C, "330");
        values.put(COLUMN_ANSWER_D, "320");
        values.put(COLUMN_CORRECT, "365");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "What is the name of the pirate in Peter Pan?");
        values.put(COLUMN_ANSWER_A, "Captain Hook");
        values.put(COLUMN_ANSWER_B, "peter");
        values.put(COLUMN_ANSWER_C, "pan");
        values.put(COLUMN_ANSWER_D, "neraida");
        values.put(COLUMN_CORRECT, "Captain Hook");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, " What is a brontosaurus?");
        values.put(COLUMN_ANSWER_A, "A dinosaur");
        values.put(COLUMN_ANSWER_B, "Papia");
        values.put(COLUMN_ANSWER_C, "aligatoras");
        values.put(COLUMN_ANSWER_D, "alepou");
        values.put(COLUMN_CORRECT, "A dinosaur");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "What is a group of lions called?");
        values.put(COLUMN_ANSWER_A, "A pride");
        values.put(COLUMN_ANSWER_B, "Mpakos");
        values.put(COLUMN_ANSWER_C, "pakistanos");
        values.put(COLUMN_ANSWER_D, "arxaioi ellhnes");
        values.put(COLUMN_CORRECT, "A pride");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "Which is the fastest land animal?");
        values.put(COLUMN_ANSWER_A, "The cheetah");
        values.put(COLUMN_ANSWER_B, "jaguar");
        values.put(COLUMN_ANSWER_C, "Dog");
        values.put(COLUMN_ANSWER_D, "lion");
        values.put(COLUMN_CORRECT, "The cheetah");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);
        values = new ContentValues();
        values.put(COLUMN_QUESTION_TEXT, "What kind of animal was Abu in Aladdin?");
        values.put(COLUMN_ANSWER_A, "A monkey");
        values.put(COLUMN_ANSWER_B, "Dog");
        values.put(COLUMN_ANSWER_C, "Cat");
        values.put(COLUMN_ANSWER_D, "rat");
        values.put(COLUMN_CORRECT, "A monkey");
        values.put(COLUMN_SCORE, 1);
        db.insert(TABLE_QUESTIONS, null, values);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
