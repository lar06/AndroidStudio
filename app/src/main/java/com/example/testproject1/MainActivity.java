package com.example.testproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button oneAScoreButton;
    Button twoAScoreButton;
    Button threeAScoreButton;
    TextView scoreATextView;

    Button oneBScoreButton;
    Button twoBScoreButton;
    Button threeBScoreButton;
    TextView scoreBTextView;

    Button resetButton;

    Integer aScore =  new Integer(0);
    Integer bScore =  new Integer(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oneAScoreButton = (Button) findViewById(R.id.left_one_score_btn);
        oneAScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aScore += 1;
                scoreATextView.setText(aScore.toString());
            }
        });
        twoAScoreButton = (Button) findViewById(R.id.left_two_score_btn);
        twoAScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aScore += 2;
                scoreATextView.setText(aScore.toString());
            }
        });
        threeAScoreButton = (Button) findViewById(R.id.left_three_score_btn);
        threeAScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aScore += 3;
                scoreATextView.setText(aScore.toString());
            }
        });

        scoreATextView = (TextView) findViewById(R.id.left_score_tv);

        oneBScoreButton = (Button) findViewById(R.id.right_one_score_btn);
        oneBScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bScore += 1;
                scoreBTextView.setText(bScore.toString());
            }
        });
        twoBScoreButton = (Button) findViewById(R.id.right_two_score_btn);
        twoBScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bScore += 2;
                scoreBTextView.setText(bScore.toString());
            }
        });
        threeBScoreButton = (Button) findViewById(R.id.right_three_score_btn);
        threeBScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bScore += 3;
                scoreBTextView.setText(bScore.toString());
            }
        });

        scoreBTextView = (TextView) findViewById(R.id.right_score_tv);

        resetButton = (Button) findViewById(R.id.reset_btn);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aScore = 0;
                scoreATextView.setText(aScore.toString());
                bScore = 0;
                scoreBTextView.setText(bScore.toString());
            }
        });
    }

}
