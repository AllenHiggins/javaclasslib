import com.company.MaxMin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxMInTest {

    MaxMin maxMin = new MaxMin();

    @Test
    public void returnMaxMinString1() {

        int[] list = {1,2,3,4,5};

        String result = maxMin.findMaxMin(list);

        assertEquals("14 10", result);
    }

    @Test
    public void returnMaxMinString2() {

        int[] list = {1,2,3,4,5,6,-7};

        String result = maxMin.findMaxMin(list);

        assertEquals("21 8", result);
    }
}