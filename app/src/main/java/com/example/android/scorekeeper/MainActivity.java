package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int faultsTeamA=0;
    int faultsTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaultsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_faults);
        scoreView.setText(String.valueOf(score));

    }
    public void goal_A(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void minus_A(View view) {
        if (scoreTeamA >0) {
            scoreTeamA = scoreTeamA - 1;}
        displayForTeamA(scoreTeamA);
    }

    public void faults_A(View view) {
        faultsTeamA = faultsTeamA +1;
         displayFaultsForTeamA(faultsTeamA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFaultsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_faults);
        scoreView.setText(String.valueOf(score));}

    public void goal_B(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void minus_B(View view) {
        if (scoreTeamB >0) {
        scoreTeamB = scoreTeamB - 1;}
        displayForTeamB(scoreTeamB);
    }

    public void faults_B(View view) {
        faultsTeamB = faultsTeamB +1;
        displayFaultsForTeamB(faultsTeamB);
    }

    public void reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        faultsTeamA=0;
        faultsTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFaultsForTeamA(faultsTeamA);
        displayFaultsForTeamB(faultsTeamB);
    }
}
