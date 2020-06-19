package com.twschool.practice;

public class GuessNumberGame {
    private static final int NAX_TRY_TIMES = 6;
    private GameAnswer gameAnswer;
    private GameStatus gameStatus = GameStatus.CONTITNUE;
    private int leftTryTimes = NAX_TRY_TIMES;

    public GuessNumberGame(GameAnswer gameAnswer) {
        this.gameAnswer = gameAnswer;
    }



    public String guess(String userAnswerString) {
        String result = gameAnswer.check(userAnswerString);
        decreaseTryTimes();
        modifyStatus(result);
        return result;
    }

    private void decreaseTryTimes() {
        leftTryTimes --;
    }

    private void modifyStatus(String result) {
        if("4A0B".equals(result)){
            gameStatus = GameStatus.SUCCEED;
        }else if (leftTryTimes == 0){
            gameStatus = GameStatus.FAILED;
        }
    }

    public GameStatus getStatus() {

        return gameStatus;
    }
}
