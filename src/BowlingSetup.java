public class BowlingSetup {

    private int[] rolls;
    private int index;
    public BowlingSetup() {
        rolls = new int[21];
        index = 0;

    }

    public void addRollsToGame(int pins){
        rolls[index++] = pins;
    }

    private boolean checkForSpare(int frameIndex){
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }

    private boolean checkForStrike(int frameIndex){
        return rolls[frameIndex] == 10;
    }
}
