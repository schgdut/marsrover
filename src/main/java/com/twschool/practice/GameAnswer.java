package com.twschool.practice;


public class GameAnswer {
    private String answerNumbers;
    public GameAnswer(String answerNumbers) {
        this.answerNumbers = answerNumbers;
    }
    public String check(String userNumbers){
        int valueAndPositionCorrectCount = 0;
        int valueIncorrectAndPositionCorrectCount = 0;
        for (int i = 0;i<this.answerNumbers.length();i++){
            if (String.valueOf(this.answerNumbers.charAt(i)).equals(String.valueOf(userNumbers.charAt(i)))){
                valueAndPositionCorrectCount ++;

            }else if (this.answerNumbers.contains(String.valueOf(userNumbers.charAt(i)))){
                valueIncorrectAndPositionCorrectCount ++ ;
            }
        }
        return valueAndPositionCorrectCount+"A"+valueIncorrectAndPositionCorrectCount+"B";
    }

}

