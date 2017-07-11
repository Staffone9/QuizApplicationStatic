package com.example.staffonechristian.quizapplication;

/**
 * Created by staffonechristian on 2017-07-10.
 */

public class QuestionLibrary  {

    private String mQuestions [] = {
            "Which part of the plant holds it in the soil?",
            "This part of the plant absorbs energy from the sun.",
            "This part of the plant attracts bees, butterflies and hummingbirds.",
            "The _______ holds the plant upright."

    };


    private String mChoices [][] = {
            {"Roots", "Stem", "Flower"},
            {"Fruit", "Leaves", "Seeds"},
            {"Bark", "Flower", "Roots"},
            {"Flower", "Leaves", "Stem"}
    };



    private String mCorrectAnswers[] = {"Roots", "Leaves", "Flower", "Stem"};

    public String getmQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice2 = mChoices[a][1];
        return choice2;
    }

    public String getChoice3(int a){
        String choice3 = mChoices[a][2];
        return choice3;
    }

    public String getmCorrectAnswers(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
