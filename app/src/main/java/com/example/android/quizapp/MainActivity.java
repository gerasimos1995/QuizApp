package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score=0;
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9,checkBox10;
    CheckBox checkBox11,checkBox12,checkBox13,checkBox14,checkBox15,checkBox16,checkBox17,checkBox18,checkBox19,checkBox20;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4,radioButton5,radioButton6,radioButton7,radioButton8,radioButton9;
    RadioButton radioButton10,radioButton11,radioButton12,radioButton13,radioButton14,radioButton15,radioButton16,radioButton17,radioButton18,radioButton19,radioButton20;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox) findViewById(R.id.checkBox8);
        checkBox9 = (CheckBox) findViewById(R.id.checkBox9);
        checkBox10 = (CheckBox) findViewById(R.id.checkBox10);
        checkBox11 = (CheckBox) findViewById(R.id.checkBox11);
        checkBox12 = (CheckBox) findViewById(R.id.checkBox12);
        checkBox13 = (CheckBox) findViewById(R.id.checkBox13);
        checkBox14 = (CheckBox) findViewById(R.id.checkBox14);
        checkBox15 = (CheckBox) findViewById(R.id.checkBox15);
        checkBox16 = (CheckBox) findViewById(R.id.checkBox16);
        checkBox17 = (CheckBox) findViewById(R.id.checkBox17);
        checkBox18 = (CheckBox) findViewById(R.id.checkBox18);
        checkBox19 = (CheckBox) findViewById(R.id.checkBox19);
        checkBox20 = (CheckBox) findViewById(R.id.checkBox20);
        radioButton1 = (RadioButton) findViewById(R.id.radiobutton1);
        radioButton2 = (RadioButton) findViewById(R.id.radiobutton2);
        radioButton3 = (RadioButton) findViewById(R.id.radiobutton3);
        radioButton4 = (RadioButton) findViewById(R.id.radiobutton4);
        radioButton5 = (RadioButton) findViewById(R.id.radiobutton5);
        radioButton6 = (RadioButton) findViewById(R.id.radiobutton6);
        radioButton7 = (RadioButton) findViewById(R.id.radiobutton7);
        radioButton8 = (RadioButton) findViewById(R.id.radiobutton8);
        radioButton9 = (RadioButton) findViewById(R.id.radiobutton9);
        radioButton10 = (RadioButton) findViewById(R.id.radiobutton10);
        radioButton11 = (RadioButton) findViewById(R.id.radiobutton11);
        radioButton12 = (RadioButton) findViewById(R.id.radiobutton12);
        radioButton13 = (RadioButton) findViewById(R.id.radiobutton13);
        radioButton14 = (RadioButton) findViewById(R.id.radiobutton14);
        radioButton15 = (RadioButton) findViewById(R.id.radiobutton15);
        radioButton16 = (RadioButton) findViewById(R.id.radiobutton16);
        radioButton17 = (RadioButton) findViewById(R.id.radiobutton17);
        radioButton18 = (RadioButton) findViewById(R.id.radiobutton18);
        radioButton19 = (RadioButton) findViewById(R.id.radiobutton19);
        radioButton20 = (RadioButton) findViewById(R.id.radiobutton20);
        button = (Button) findViewById(R.id.button);
    }

    public void sumbitAnswers(View view){
        if (checkBox1.isChecked()){
            score = score + 10;
        }

        if (checkBox2.isChecked()){
            score = score + 8;
        }

        if (checkBox3.isChecked()){
            score = score + 5;
        }

        if (checkBox4.isChecked()){
            score = score + 15;
        }

        if (checkBox5.isChecked()){
            score = score + 2;
        }

        if (checkBox6.isChecked()){
            score = score + 2;
        }

        if (checkBox7.isChecked()){
            score = score + 2;
        }

        if (checkBox8.isChecked()){
            score = score + 2;
        }

        if (checkBox9.isChecked()){
            score = score + 2;
        }

        if (checkBox10.isChecked()){
            score = score + 2;
        }

        if (checkBox11.isChecked()){
            score = score + 2;
        }

        if (checkBox12.isChecked()){
            score = score + 2;
        }

        if (checkBox13.isChecked()){
            score = score + 2;
        }

        if (checkBox14.isChecked()){
            score = score + 2;
        }

        if (checkBox15.isChecked()){
            score = score + 2;
        }

        if (checkBox16.isChecked()){
            score = score + 2;
        }

        if (checkBox17.isChecked()){
            score = score + 2;
        }

        if (checkBox18.isChecked()){
            score = score + 2;
        }

        if (checkBox19.isChecked()){
            score = score + 2;
        }

        if (radioButton1.isChecked()){
            score = score + 7;
        }

        if (radioButton2.isChecked()){
            score = score + 4;
        }

        if (radioButton3.isChecked()){
            score = score + 2;
        }

        if (radioButton5.isChecked()){
            score = score + 7;
        }

        if (radioButton6.isChecked()){
            score = score + 4;
        }

        if (radioButton7.isChecked()){
            score = score + 2;
        }

        if (radioButton9.isChecked()){
            score = score + 7;
        }

        if (radioButton10.isChecked()){
            score = score + 4;
        }

        if (radioButton11.isChecked()){
            score = score + 2;
        }

        if (radioButton13.isChecked()){
            score = score + 7;
        }

        if (radioButton14.isChecked()){
            score = score + 4;
        }

        if (radioButton15.isChecked()){
            score = score + 2;
        }

        if (radioButton17.isChecked()){
            score = score + 7;
        }

        if (radioButton18.isChecked()){
            score = score + 4;
        }

        if (radioButton19.isChecked()){
            score = score + 2;
        }

        if (score >= 95){
            Toast.makeText(this, "Your score is:" + score + " all the companies want you.", Toast.LENGTH_LONG).show();
        }else if(score >= 80){
            Toast.makeText(this, "Your score is:" + score + " you have a bright future ahead of you.Keep improving", Toast.LENGTH_LONG).show();
        }else if (score >= 65){
            Toast.makeText(this, "Your score is:" + score + " you have great potential ahead of you but you have to keep trying to be among the best.", Toast.LENGTH_LONG).show();
        }else if (score >= 50){
            Toast.makeText(this, "Your score is:" + score + " that means many programmers are like you. You have to find your way to make a difference", Toast.LENGTH_LONG).show();
        }else if (score >= 35){
            Toast.makeText(this, "Your score is:" + score + " that means you have to keep practising as hard as you can. You have a long way ahead of you", Toast.LENGTH_LONG).show();
        }else if (score >=25){
            Toast.makeText(this, "Your score is:" + score + " that means you are either a beginner or you have to reconsider of your skills. Find a way to get better. Practise is the only way to the top", Toast.LENGTH_LONG).show();
        }else if (score >=10){
            Toast.makeText(this, "Your score is:" + score + ". It seems like you just started programming.", Toast.LENGTH_LONG).show();
        }else if (score >=0){
            Toast.makeText(this, "Your score is:" + score + ". Becoming a programmers requires many sacrifices. It seems you haven't sacrificed anyhting yet.", Toast.LENGTH_LONG).show();
        }
        score = 0;
    }

}
