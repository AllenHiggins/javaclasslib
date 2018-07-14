import com.company.CardGame;
import org.junit.Assert;
import org.junit.Test;

public class CardGameTests {

    private CardGame cardGame = new CardGame();
    int result;

    @Test
    public void playerCountOne(){
        String A = "A586QK";
        String B = "JJ653K";
        result = cardGame.winCountForAPlayer(A,B);
        Assert.assertEquals(4, result);
    }

    @Test
    public void playerCountTwo(){
        String A = "A5862K";
        String B = "JJ653K";
        result = cardGame.winCountForAPlayer(A,B);
        Assert.assertEquals(3, result);
    }

    @Test
    public void playerCountThree(){
        String A = "A586QKA586QK";
        String B = "JJ653KJJ653K";
        result = cardGame.winCountForAPlayer(A,B);
        Assert.assertEquals(8, result);
    }

    @Test
    public void playerCountFour(){
        String A = "J4653K";
        String B = "A586QK";
        result = cardGame.winCountForAPlayer(A,B);
        Assert.assertEquals(0, result);
    }

    @Test(expected = Exception.class)
    public void playerCharsNotInGame(){
        String A = "A586QKE";
        String B = "JJ653KF";
        result = cardGame.winCountForAPlayer(A,B);
    }

    @Test(expected = Exception.class)
    public void playerCharsNotInGameTwo(){
        String A = "A586QKE!";
        String B = "JJ653KF&";
        result = cardGame.winCountForAPlayer(A,B);
        Assert.assertEquals(0, result);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void playerCharsNotInGameThree(){
        String A = "A586";
        String B = "";
        result = cardGame.winCountForAPlayer(A,B);
    }
}
