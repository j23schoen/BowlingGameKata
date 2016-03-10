import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingTester {

    Main game;
    @Before
    public void setUp(){
        game = new Main();
    }

    @Test
    public void all1sShouldReturn20(){
        for(int i = 0; i < 21; i++){
            game.addRollsToGame(1);
        }
        Assert.assertEquals(20, game.calculate());
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
        fillRemainingFrames(15, 0);
        Assert.assertEquals(34, game.calculate());
    }


    public void fillRemainingFrames(int framesRemaining, int pins){
        for(int i = 0; i < framesRemaining; i++){
            game.addRollsToGame(pins);
        }
    }
}
