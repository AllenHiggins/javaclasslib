import com.company.AngryProfessor;
import org.junit.Assert;
import org.junit.Test;

public class AngryProfessorTests {

    private final String YES = "YES";
    private final String NO = "NO";
    private String result;
    private int[] classTimes;

    private AngryProfessor angryProfessor = new AngryProfessor();

    @Test
    public void classIsCancelledOne(){
        classTimes = new int[]{1,4,3,6};
        result = angryProfessor.angryProfessorTimeSheet(3,classTimes);
        Assert.assertEquals(YES, result);
    }

    @Test
    public void classIsCancelledTwo(){
        classTimes = new int[]{-3,0,4,2,1,7,2,1,7,4,5,1,6};
        result = angryProfessor.angryProfessorTimeSheet(10,classTimes);
        Assert.assertEquals(YES, result);
    }

    @Test
    public void classIsCancelledThree(){
        classTimes = new int[]{3,10,4,2,1,7,2,1,2,4,0,1,6};
        result = angryProfessor.angryProfessorTimeSheet(2,classTimes);
        Assert.assertEquals(YES, result);
    }

    @Test
    public void classIsCancelledFour(){
        classTimes = new int[]{};
        result = angryProfessor.angryProfessorTimeSheet(2,classTimes);
        Assert.assertEquals(YES, result);
    }

    @Test
    public void classIsCancelledFive(){
        classTimes = new int[]{-2};
        result = angryProfessor.angryProfessorTimeSheet(2,classTimes);
        Assert.assertEquals(YES, result);
    }

    @Test
    public void classIsNotCancelledOne(){
        classTimes = new int[]{3,0,4,2,1,7,2,1,0,0,0,1,6};
        result = angryProfessor.angryProfessorTimeSheet(4,classTimes);
        Assert.assertEquals(NO, result);
    }

    @Test
    public void classIsNotCancelledTwo(){
        classTimes = new int[]{3,0,4,2,-1,7,2,1,0,0,0,1,-6};
        result = angryProfessor.angryProfessorTimeSheet(6,classTimes);
        Assert.assertEquals(NO, result);
    }

    @Test
    public void classIsNotCancelledThree(){
        classTimes = new int[]{-3,0,-4,-2,-1,-7,-2,-1,0,0,0,-1,-6,-3,0,-4,-2,-1,-7,-2,-1,0,0,0,-1,-6};
        result = angryProfessor.angryProfessorTimeSheet(20,classTimes);
        Assert.assertEquals(NO, result);
    }

    @Test
    public void classIsNotCancelledFour(){
        classTimes = new int[]{-2};
        result = angryProfessor.angryProfessorTimeSheet(1,classTimes);
        Assert.assertEquals(NO, result);
    }

}
