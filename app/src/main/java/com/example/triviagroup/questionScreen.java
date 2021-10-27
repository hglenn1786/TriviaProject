package com.example.triviagroup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class questionScreen extends AppCompatActivity {
    int pointsEarned = 0;
    String[] tst = {"What is life", "george", "god", "death"};
    Question[] askQ = {new Question(tst),new Question(tst),new Question(tst),new Question(tst),new Question(tst)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);

        Intent intent = getIntent();

        String category = intent.getStringExtra("trivia name");
        TextView ThemeTextMAIN = findViewById(R.id.ThemeText);
        ThemeTextMAIN.setText(category);
        System.out.println(category);

        int index = -1;
        if(category.equals("Marvel")){
            System.out.println("INNNNNNNNNNNNNNNNN");
            index = 0;
        }
//        String[][] correctA = {{"Tony Stark", "6","The ten rings","25","Wakanda", "Loki","Clint Barton","God of Mischief"}};
        String[][] marvel = {{"What is Iron Man’s real name?", "Tony Stark", "Peter Parker", "Steve Rogers"}, {"How many infinity stones does Thanos need?", "3", "4", "6"}, {"What is the main weapon used by Shang Chi and his father?", "The ten rings", "Infinity Gauntlet", "Mjollnir"}, {"How many Marvel movies have been made?", "23", "18", "25"},{"What is the setting of Black Panther?", "Australia", "Wakanda", "China", "Asgard"}, {"What is the name of Thor’s brother?", "Deadpool", "Loki", "Odin"}, {"What is Hawkeye's real name?", "Bart CLinton", "Clint Barton", "Cole Philson"}, {"What is Loki's title?", "God of Mischief", "God of Evil", "God of Tricks"}};
        //String[][][] Questions = {{{"What is Iron Man’s real name?", "Peter Parker", "Tony Stark", "Steve Rogers"}, {"How many infinity stones does Thanos need?", "3", "4", "6"}, {"What is the main weapon used by Shang Chi and his father?", "The ten rings", "Infinity Gauntlet", "Mjollnir"}, {"How many Marvel movies have been made?", "23", "18", "25"},{"What is the setting of Black Panther?", "Australia", "Wakanda", "China", "Asgard"}, {"What is the name of Thor’s brother?", "Deadpool", "Loki", "Odin"}, {"What is Hawkeye's real name?", "Bart CLinton", "Clint Barton", "Cole Philson"}, {"What is Loki's title?", "God of Mischief", "God of Evil", "God of Tricks"}}};
        Question[][] Questions = {{new Question(marvel[0]), new Question(marvel[1]), new Question(marvel[2]), new Question(marvel[3]),new Question(marvel[4]),new Question(marvel[5]),new Question(marvel[6]), new Question(marvel[7])}};
        int len = Questions[index].length;
        System.out.println(len);
//        System.out.println(index);
//        System.out.println(len);
        int count = 5;


        int[] useQ = {-1,-1,-1,-1,-1};

//        while(count > 0){
//            System.out.println(count+" "+"COUNTTTT");
//            boolean found = true;
//            int chosen = (int)(Math.random()*len);
//            while(found){
//                System.out.println(chosen+" CHOSENNNNNN");
//                found = false;
//                for(int i = 0; i < useQ.length; i++){
//                    if(useQ[i] == chosen){
//                        found = true;
//                    }
//                }
//                if(!found){
//                    askQ[5-count] = Questions[index][chosen];
//                    useQ[5-count] = chosen;
//                }else{
//                    chosen = (int)(Math.random()*len);
//                }
//
//            }
//            count--;
//        }
//        for(int i = 0; i < askQ.length; i++){
//            System.out.print(askQ[i] + " : " + useQ[i]);
//        }
//        System.out.println();
        //get the spinner from the xml.
//        String[] test = {"What is Iron Man’s real name?", "Peter Parker", "Tony Stark", "Steve Rogers"};
        //Question lol = new Question(test);

        Spinner dropdown = findViewById(R.id.qspinner);
        //create a list of items for the spinner.
//        String[] items = new String[]{Questions[index][useQ[0]][1],Questions[index][useQ[0]][2], Questions[index][useQ[0]][3], Questions[index][useQ[0]][4]};
        TextView ThemeText = findViewById(R.id.themeText);

//        for(int i = 0; i < 5; i++){
//            ThemeText.setText(askQ[0].getQuestion());
//            String[] items = new String[]{askQ[0].getAnswer()[0], askQ[0].getAnswer()[1], askQ[0].getAnswer()[2]};
//            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//            dropdown.setAdapter(adapter);
//            try {
//                Thread.sleep(2000); //1000 milliseconds is one second.
//            }
//            catch (InterruptedException e)
//            {
//                e.printStackTrace();
//            }
//        }
        ThemeText.setText(askQ[0].getQuestion());
        String[] items = new String[]{askQ[0].getAnswer()[0], askQ[0].getAnswer()[1], askQ[0].getAnswer()[2]};
        System.out.println(askQ.getCorrectAnswer());
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
//        ThemeText.setText(askQ[0].getQuestion());
//        String[] items = new String[]{askQ[0].getAnswer()[0], askQ[0].getAnswer()[1], askQ[0].getAnswer()[2]};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.

        //set the spinners adapter to the previously created one.
//        dropdown.setAdapter(adapter);
    }


    public void submitQuestion(View v){

    }
}