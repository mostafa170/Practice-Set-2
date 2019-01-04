package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import static com.example.android.practiceset2.R.id.oneA;
import static com.example.android.practiceset2.R.id.oneB;
import static com.example.android.practiceset2.R.id.threeA;
import static com.example.android.practiceset2.R.id.threeB;
import static com.example.android.practiceset2.R.id.twoA;
import static com.example.android.practiceset2.R.id.twoB;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int sixA = 0;
    int threeA = 0;
    int twoA = 0  ;
    int oneA = 0 ;
    int resA = 0;
    int sixB = 0;
    int threeB = 0;
    int twoB = 0;
    int oneB = 0;
    int resB = 0;

    public void SixA(View view) {
        sixA = 6;
        resA = resA + sixA;
        displayForTeamA(resA);
    }

    public void ThreeA(View view) {
        threeA = 3;
        resA = resA + threeA;
        displayForTeamA(resA);
    }

    public void TwoA(View view) {
        twoA = 2;
        resA = resA + twoA;
        displayForTeamA(resA);
    }

    public void OneA(View view) {
        oneA = 1;
        resA = resA + oneA;
        displayForTeamA(resA);
    }

    public void SixB(View view) {
        sixB = 6;
        resB = resB + sixB;
        displayForTeamB(resB);
    }

    public void ThreeB(View view) {
        threeB = 3;
        resB = resB + threeB;
        displayForTeamB(resB);
    }

    public void TwoB(View view) {
        twoB = 2;
        resB = resB + twoB;
        displayForTeamB(resB);
    }

    public void OneB(View view) {
        oneB = 1;
        resB = resB + oneB;
        displayForTeamB(resB);
    }

    public void resetscore(View view) {
        resA =0;
        resB = 0;
        displayForTeamA(resA);
        displayForTeamB(resB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.resultA);
        scoreView.setText("" + score);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.resultB);
        scoreView.setText("" + score);
    }

}