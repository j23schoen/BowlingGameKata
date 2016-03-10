public class Main {

    int[] rolls = new int[21];
    int index = 0;

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

    public boolean checkIfASpareWasThrown(int frameIndex){
        if(rolls[frameIndex] + rolls[frameIndex + 1] == 10){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkIfAStrikeWasThrown(int frameIndex){
        if(rolls[frameIndex] == 10){
            return true;
        }
        else{
            return false;
        }
    }
}
