package com.example.gavenport.scorekeeper;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int penaltyKickTeamA = 0;
    int penaltyKickTeamB = 0;
    int cornerTeamA = 0;
    int cornerTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayCornerForTeamA(0);
        displayCornerForTeamB(0);
        displayPenaltyKickForTeamA(0);
        displayPenaltyKickForTeamB(0);
    }




    /**
     * Increase penalty kicks for Team A by 1 point.
     */
    public void addPenaltyKickForTeamA(View v) {

        penaltyKickTeamA=penaltyKickTeamA+1;
        displayPenaltyKickForTeamA(penaltyKickTeamA);
    }

    /**
     * Increase corner kicks for Team A by 1 points.
     */
    public void addCornerForTeamA(View v) {

        cornerTeamA=cornerTeamA+1;
        displayCornerForTeamA(cornerTeamA);
    }

    /**
     * Increase the score for Team A by 1 points.
     */
    public void addGoalForTeamA(View v) {

        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    public void resetScore(View v) {
        scoreTeamA=0;
        scoreTeamB=0;
        penaltyKickTeamA=0;
        penaltyKickTeamB=0;
        cornerTeamA=0;
        cornerTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayCornerForTeamA(cornerTeamA);
        displayCornerForTeamB(cornerTeamB);
        displayPenaltyKickForTeamA(penaltyKickTeamA);
        displayPenaltyKickForTeamB(penaltyKickTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void displayCornerForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_corner);
        scoreView.setText("Eckbälle: " + String.valueOf(score));
    }


    public void displayPenaltyKickForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_penalty_kick);
        scoreView.setText("Elfmeter: " + String.valueOf(score));
    }




    /**
     * Increase penalty kicks for Team B by 1 point.
     */
    public void addPenaltyKickForTeamB(View v) {

        penaltyKickTeamB=penaltyKickTeamB+1;
        displayPenaltyKickForTeamB(penaltyKickTeamB);
    }

    /**
     * Increase corner kicks for Team B by 1 points.
     */
    public void addCornerForTeamB(View v) {

        cornerTeamB=cornerTeamB+1;
        displayCornerForTeamB(cornerTeamB);
    }

    /**
     * Increase the score for Team B by 1 points.
     */
    public void addGoalForTeamB(View v) {

        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void displayCornerForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_corner);
        scoreView.setText("Eckbälle: " + String.valueOf(score));
    }

    public void displayPenaltyKickForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_penalty_kick);
        scoreView.setText("Elfmeter: " + String.valueOf(score));

    }
}
