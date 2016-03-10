import org.junit.Assert;
import org.junit.Test;

public class BowlingTester {

    @Test
    public void all1sShouldReturn20(){
        Main game = new Main();
        Assert.assertEquals(20, game.calculate());
    }

}
