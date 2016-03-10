public class Main {

    int[] rolls = new int[21];
    int currentRoll = 0;

    public void addRollsToGame(int pins){
        rolls[currentRoll++] = pins;
    }
    public int calculate(){
        int total = 0;
        int frameIndex = 0;
        for(int i = 0; i < 10; i++){
            total += rolls[frameIndex] + rolls[frameIndex];
            frameIndex += 2;
        }

        return total;
    }
}
