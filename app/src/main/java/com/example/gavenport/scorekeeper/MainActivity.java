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

    // Saves the scores of both teams in case of changing activity
    static final String STATE_SCORE_A = "scoreTeamA";
    static final String STATE_SCORE_B = "scoreTeamB";
    static final String STATE_PENALTY_A = "penaltyKickTeamA";
    static final String STATE_PENALTY_B = "penaltyKickTeamB";
    static final String STATE_CORNER_A = "cornerTeamA";
    static final String STATE_CORNER_B = "cornerTeamB";

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putInt(STATE_SCORE_A, scoreTeamA);
        savedInstanceState.putInt(STATE_SCORE_B, scoreTeamB);
        savedInstanceState.putInt(STATE_PENALTY_A, penaltyKickTeamA);
        savedInstanceState.putInt(STATE_PENALTY_B, penaltyKickTeamB);
        savedInstanceState.putInt(STATE_CORNER_A, cornerTeamA);
        savedInstanceState.putInt(STATE_CORNER_B, cornerTeamB);
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);
        // Restore state members from saved instance
        scoreTeamA = savedInstanceState.getInt(STATE_SCORE_A);
        scoreTeamB = savedInstanceState.getInt(STATE_SCORE_B);
        penaltyKickTeamA = savedInstanceState.getInt(STATE_PENALTY_A);
        penaltyKickTeamB = savedInstanceState.getInt(STATE_PENALTY_B);
        cornerTeamA = savedInstanceState.getInt(STATE_CORNER_A);
        cornerTeamB = savedInstanceState.getInt(STATE_CORNER_B);

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayCornerForTeamA(cornerTeamA);
        displayCornerForTeamB(cornerTeamB);
        displayPenaltyKickForTeamA(penaltyKickTeamA);
        displayPenaltyKickForTeamB(penaltyKickTeamB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView scoreTeamA = findViewById(R.id.team_a_score);
        TextView cornerTeamA = findViewById(R.id.team_a_corner);
        TextView penaltyKickTeamA = findViewById(R.id.team_a_penalty_kick);
        TextView scoreTeamB = findViewById(R.id.team_b_score);
        TextView cornerTeamB = findViewById(R.id.team_b_corner);
        TextView penaltyKickTeamB = findViewById(R.id.team_b_penalty_kick);

    }



        /**
         * Increase penalty kicks for Team A by 1 point.
         */
    public void addPenaltyKickForTeamA(View view) {

        penaltyKickTeamA=penaltyKickTeamA+1;
        displayPenaltyKickForTeamA(penaltyKickTeamA);
    }

    /**
     * Increase corner kicks for Team A by 1 points.
     */
    public void addCornerForTeamA(View view) {

        cornerTeamA=cornerTeamA+1;
        displayCornerForTeamA(cornerTeamA);
    }

    /**
     * Increase the score for Team A by 1 points.
     */
    public void addGoalForTeamA(View view) {

        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    public void resetScore(View view) {
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
     * Increase penalty kicks for Team B by 1 point.
     */
    public void addPenaltyKickForTeamB(View view) {

        penaltyKickTeamB=penaltyKickTeamB+1;
        displayPenaltyKickForTeamB(penaltyKickTeamB);
    }

    /**
     * Increase corner kicks for Team B by 1 points.
     */
    public void addCornerForTeamB(View view) {

        cornerTeamB=cornerTeamB+1;
        displayCornerForTeamB(cornerTeamB);
    }

    /**
     * Increase the score for Team B by 1 points.
     */
    public void addGoalForTeamB(View view) {

        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
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
