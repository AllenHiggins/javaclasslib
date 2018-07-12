import com.company.PalSearch;
import org.junit.Assert;
import org.junit.Test;

public class PalTests {

    private PalSearch palSearch = new PalSearch();
    private Boolean result;

    @Test
    public void isNotPalOne(){
        result = palSearch.isWordAPal("TheWordIsNot");
        Assert.assertEquals(false, result);
    }

    @Test
    public void isNotPalTwo(){
        result = palSearch.isWordAPal("really");
        Assert.assertEquals(false, result);
    }

    @Test
    public void isNotPalThree(){
        result = palSearch.isWordAPal("MoonyM");
        Assert.assertEquals(false, result);
    }

    @Test
    public void isPalOne(){
        result = palSearch.isWordAPal("Noon");
        Assert.assertEquals(true, result);
    }

    @Test
    public void isPalTwo(){
        result = palSearch.isWordAPal("No on");
        Assert.assertEquals(true, result);
    }

    @Test
    public void isPalThree(){
        result = palSearch.isWordAPal("Racecar");
        Assert.assertEquals(true, result);
    }

    @Test
    public void isStringPalOne(){
        result = palSearch.isStringAPal("Eva, can I see bees in a cave?");
        Assert.assertEquals(true, result);
    }

    @Test
    public void isStringPalTwo(){
        result = palSearch.isStringAPal("No lemon, no melon");
        Assert.assertEquals(true, result);
    }

    @Test
    public void isStringPalThree(){
        result = palSearch.isStringAPal("Named undenominationally rebel, I rile Beryl? La, no! I tan. I'm, o Ned, nude, man!");
        Assert.assertEquals(true, result);
    }

    @Test
    public void isStringPalFour(){
        result = palSearch.isStringAPal("Able was I, (ere) I-saw Elba;");
        Assert.assertEquals(true, result);
    }

    @Test
    public void isNotStringPalOne(){
        result = palSearch.isStringAPal("Named undenominationalle rebel, I rile Beryl? La, no! I tan. I'm, o Ned, nude, man!");
        Assert.assertEquals(false, result);
    }

    @Test
    public void isNotStringPalTwo(){
        result = palSearch.isStringAPal("Named undenominationalle rebel, I rile Beryl? La, no! I tan. I'm, o Ned, nude, manY!");
        Assert.assertEquals(false, result);
    }

    @Test
    public void isNotStringPalThree(){
        result = palSearch.isStringAPal("Named undenominationally rebel, I rile Beryl? Lay, no! I tan. I'm, o Ned, nude, man!");
        Assert.assertEquals(false, result);
    }
}
