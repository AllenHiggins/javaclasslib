import com.company.NotDiv;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class NotDivTests {

    NotDiv notDiv = new NotDiv();
    List<Integer> result;

    @Test
    public void Test1(){

        int[] list = {1,7,2,4};
        result = notDiv.isNotDiv(list.length,list,3);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(7);
        expected.add(4);
        expected.add(1);
        Collections.sort(expected);
        assertEquals(expected, result);
    }

    @Test
    public void Test2(){
        int[] list = {1,7,2,4,5,0,-1};
        result = notDiv.isNotDiv(list.length,list,3);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(7);
        expected.add(-1);
        expected.add(1);
        expected.add(0);
        expected.add(2);
        expected.add(5);
        expected.add(4);
        Collections.sort(expected);
        assertEquals(expected, result);
    }

    @Test
    public void Test5(){
        int[] list = {1,7};
        result = notDiv.isNotDiv(list.length,list,3);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(7);
        expected.add(1);
        Collections.sort(expected);
        assertEquals(expected, result);
    }

    @Test
    public void Test6(){
        int[] list = {7};
        result = notDiv.isNotDiv(list.length,list,3);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(7);
        Collections.sort(expected);
        assertEquals(expected, result);
    }

    @Test(expected=ArithmeticException.class)
    public void Test3(){
        int[] list = {1,7,2,4,5,0,-1};
        result = notDiv.isNotDiv(list.length,list,0);
    }

    @Test
    public void Test4(){
        int[] list = {7};
        result = notDiv.isNotDiv(list.length,list,3);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(7);
        assertEquals(expected, result);
    }

    @Test(expected = ArithmeticException.class)
    public void Test7(){
        int[] list = {};
        result = notDiv.isNotDiv(list.length,list,3);
    }
}
