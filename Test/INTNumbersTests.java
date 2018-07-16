import com.company.INTNumbers;
import org.junit.Assert;
import org.junit.Test;

public class INTNumbersTests {

    private INTNumbers intNumbers = new INTNumbers();
    int result;

    @Test
    public void numbersZero(){
        result = intNumbers.getReverseInt(0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void numbersOne(){
        result = intNumbers.getReverseInt(234);
        Assert.assertEquals(432, result);
    }

    @Test
    public void numbersTwo(){
        result = intNumbers.getReverseInt(2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void numbersThee(){
        result = intNumbers.getReverseInt(-21);
        Assert.assertEquals(-12, result);
    }

    @Test
    public void numbersFour(){
        result = intNumbers.getReverseInt(123456789);
        Assert.assertEquals(987654321, result);
    }

    @Test
    public void diffValueOne(){
        result = intNumbers.numDif(12, 6);
        Assert.assertEquals(6, result);
    }

    @Test
    public void diffValueTwo(){
        result = intNumbers.numDif(-12, 6);
        Assert.assertEquals(18, result);
    }

    @Test
    public void diffValueThree(){
        result = intNumbers.numDif(20, 2);
        Assert.assertEquals(18, result);
    }

    @Test
    public void diffValueFour(){
        result = intNumbers.numDif(200, 49);
        Assert.assertEquals(151, result);
    }

    @Test
    public void isDivisible(){
        Assert.assertEquals(true,intNumbers.numIsEvenlyDivisible(20,10));
    }

    @Test
    public void isDivisibleTwo(){
        Assert.assertEquals(true,intNumbers.numIsEvenlyDivisible(-20,10));
    }

    @Test
    public void isDivisibleThree(){
        Assert.assertEquals(true,intNumbers.numIsEvenlyDivisible(18,6));
    }

    @Test
    public void isDivisibleFour(){
        Assert.assertEquals(false,intNumbers.numIsEvenlyDivisible(299,6));
    }

    @Test
    public void isDivisibleFive(){
        Assert.assertEquals(false,intNumbers.numIsEvenlyDivisible(500,251));
    }

    @Test(expected = ArithmeticException.class)
    public void isDivisibleSix(){
        Assert.assertEquals(false,intNumbers.numIsEvenlyDivisible(500,0));
    }
}
