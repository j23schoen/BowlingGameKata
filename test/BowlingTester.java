import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingTester {

    BowlingGame game;

    @Before
    public void setUp(){
        game = new BowlingGame();
    }

    @Test
    public void all1sShouldReturn20(){
        for(int i = 0; i < 21; i++){
            game.addRollsToGame(1);
        }
        Assert.assertEquals(20, game.findScoreOfBowlingGame());
    }

    //input will be 3, 5, 5, 5, 7, 2, followed by all zeroes
    @Test
    public void spareTestShouldReturn34(){
        game.addRollsToGame(3);
        game.addRollsToGame(5);
        game.addRollsToGame(5);
        game.addRollsToGame(5);
        game.addRollsToGame(7);
        game.addRollsToGame(2);
        addRemainingRolls(15, 0);
        Assert.assertEquals(34, game.findScoreOfBowlingGame());
    }

    @Test
    public void testAll5sShouldReturn150(){
        for(int i =0; i < 21; i++){
            game.addRollsToGame(5);
        }

        Assert.assertEquals(150, game.findScoreOfBowlingGame());
    }

    //input will be 10, 3, 5, 10, 4, 6, 3, followed by all zeroes
    @Test
    public void testStrikesShouldReturn62(){
        game.addRollsToGame(10);
        game.addRollsToGame(3);
        game.addRollsToGame(5);
        game.addRollsToGame(10);
        game.addRollsToGame(4);
        game.addRollsToGame(6);
        game.addRollsToGame(3);
        Assert.assertEquals(62, game.findScoreOfBowlingGame());
    }

    @Test
    public void allStrikesShouldReturn300(){
        addRemainingRolls(12, 10);
        Assert.assertEquals(300, game.findScoreOfBowlingGame());
    }

    public void addRemainingRolls(int numberOfRolls, int pins){
        for(int i = 0; i < numberOfRolls; i++){
            game.addRollsToGame(pins);
        }
    }
}
