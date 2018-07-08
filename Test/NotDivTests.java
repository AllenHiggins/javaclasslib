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
    public void TestNormalExpectedList(){

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
    public void TestNegitiveValues(){
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
    public void TestTwo(){
        int[] list = {1,7};
        result = notDiv.isNotDiv(list.length,list,3);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(7);
        expected.add(1);
        Collections.sort(expected);
        assertEquals(expected, result);
    }

    @Test
    public void ifOneElementAndIsDiv(){
        int[] list = {6};
        result = notDiv.isNotDiv(list.length,list,3);
        List<Integer> expected = new ArrayList<Integer>();
        Collections.sort(expected);
        assertEquals(expected, result);
    }

    @Test(expected=ArithmeticException.class)
    public void ifDividingByZero(){
        int[] list = {1,7,2,4,5,0,-1};
        result = notDiv.isNotDiv(list.length,list,0);
    }

    @Test
    public void ifListHasOnlyOneElement(){
        int[] list = {7};
        result = notDiv.isNotDiv(list.length,list,3);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(7);
        assertEquals(expected, result);
    }

    @Test(expected = ArithmeticException.class)
    public void ifListIsEmpty(){
        int[] list = {};
        result = notDiv.isNotDiv(list.length,list,3);
    }
}
