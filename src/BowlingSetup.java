public class BowlingSetup {

    private int[] rolls;
    private int index;
    private int gameScore;
    private int framePosition;
    public BowlingSetup() {
        rolls = new int[21];
        index = 0;
        gameScore = 0;
        framePosition = 0;
    }

    public void addRollsToGame(int pins){
        rolls[index++] = pins;
    }

    public int findScoreOfBowlingGame(){

        for(int i = 0; i < 10; i++){
            if(checkForStrike(framePosition)){
                updateScoreForStrike();
            }
            else if(checkForSpare(framePosition)){
                updateScoreForSpare();
            }
            else{
                updateScoreForNonSpecialRolls();
            }

        }
        return gameScore;
    }

    private boolean checkForSpare(int frameIndex){
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }

    private boolean checkForStrike(int frameIndex){
        return rolls[frameIndex] == 10;
    }

    private int updateScoreForStrike(){
        gameScore += 10 + rolls[framePosition + 1] + rolls[framePosition + 2];
        framePosition++;
        return gameScore;
    }

    private int updateScoreForSpare(){
        gameScore += 10 + rolls[framePosition + 2];
        framePosition += 2;
        return gameScore;
    }

    private int updateScoreForNonSpecialRolls(){
        gameScore += rolls[framePosition] + rolls[framePosition + 1];
        framePosition += 2;
        return gameScore;
    }
}
