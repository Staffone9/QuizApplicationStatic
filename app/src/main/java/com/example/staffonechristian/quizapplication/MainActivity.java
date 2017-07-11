package com.example.staffonechristian.quizapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQestionLibrary = new QuestionLibrary();
    private TextView mScoreView, mQuestionView;
    private Button mButtonChoice1, mButtonChoice2, mButtonChoice3;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);

        updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonChoice1.getText() == mAnswer)
                {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(getApplicationContext(),"correct",Toast.LENGTH_SHORT).show();
                }else {

                    Toast.makeText(getApplicationContext(),"wrong",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonChoice2.getText() == mAnswer)
                {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(getApplicationContext(),"correct",Toast.LENGTH_SHORT).show();
                }else {

                    Toast.makeText(getApplicationContext(),"wrong",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonChoice3.getText() == mAnswer)
                {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(getApplicationContext(),"correct",Toast.LENGTH_SHORT).show();
                }else {

                    Toast.makeText(getApplicationContext(),"wrong",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

    }

    private void updateQuestion() {
        mQuestionView.setText(mQestionLibrary.getmQuestions(mQuestionNumber));
        mButtonChoice1.setText(mQestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQestionLibrary.getChoice3(mQuestionNumber));

        mAnswer = mQestionLibrary.getmCorrectAnswers(mQuestionNumber);
        if(mQuestionNumber==3)
        {
            mQuestionNumber=0;
        }else {
            mQuestionNumber++;
        }

    }

    private void updateScore(int mScore) {
        mScoreView.setText(""+ mScore);
    }
}
