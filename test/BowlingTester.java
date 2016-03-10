import org.junit.Assert;
import org.junit.Test;

public class BowlingTester {

    @Test
    public void all1sShouldReturn20(){
        Main game = new Main();
        for(int i = 0; i < 21; i++){
            game.addRollsToGame(1);
        }
        Assert.assertEquals(20, game.calculate());
    }

}
