public class BowlingSetup {

    private int[] rolls;
    private int index;
    BowlingGame game;

    public BowlingSetup() {
        rolls = new int[21];
        index = 0;
        game = new BowlingGame();
    }

    public void addRollsToGame(int pins){
        rolls[index++] = pins;
        game.findScoreOfBowlingGame(rolls);
    }


}
