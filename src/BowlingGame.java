public class BowlingGame {

    private int[] rolls = new int[21];
    private int index = 0;

    public void addRollsToGame(int pins){
        rolls[index++] = pins;
    }

    public int findScoreOfBowlingGame(){
        int gameScore = 0;
        int framePosition = 0;

        for(int i = 0; i < 10; i++){
            if(checkIfAStrikeWasThrown(framePosition)){
                gameScore += 10 + rolls[framePosition + 1] + rolls[framePosition + 2];
                framePosition++;
            }
            else if(checkIfASpareWasThrown(framePosition)){
                gameScore += 10 + rolls[framePosition + 2];
                framePosition += 2;
            }
            else{
                gameScore += rolls[framePosition] + rolls[framePosition + 1];
                framePosition += 2;
            }

        }
        return gameScore;
    }

    private boolean checkIfASpareWasThrown(int frameIndex){
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }

    private boolean checkIfAStrikeWasThrown(int frameIndex){
        return rolls[frameIndex] == 10;
    }
}
