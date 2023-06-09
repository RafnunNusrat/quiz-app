package com.example.quizapplicationlab4;

public class QuestionLibrary {
    private String mQuestions [] = {
            "Q1: Which part of the plant holds it in the soil?",
            "Q2: This part of the plant absorbs energy from the sun.",
            "Q3: This part of the plant attracts bees, butterflies, and hummingbirds.",
            "Q4: The _______ holds the plant upright."
    };

    private String mChoices [][] = {
            {"Roots", "Stem", "Flower"},
            {"Fruit", "Leaves", "Seeds"},
            {"Bark", "Flower", "Roots"},
            {"Flower", "Leaves", "Stem"}
    };

    private String mCorrectAnswers[] = {"Roots", "Leaves", "Flower" , "Stem"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice1 = mChoices[a][0];
        return choice1;
    }

    public String getChoice2(int a) {
        String Choice2 = mChoices[a][1];
        return Choice2;
    }

    public String getChoice3(int a) {
        String choice3 = mChoices[a][2];
        return choice3;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
