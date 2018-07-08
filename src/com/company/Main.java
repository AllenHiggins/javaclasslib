package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //    int[] list = {1,2,3,4,5};
    //    MaxMin maxMin = new MaxMin();
    //    String result = maxMin.findMaxMin(list);
    //    System.out.println(result);

        int[] list = {7};
        List<Integer> result;
        NotDiv notDiv = new NotDiv();
        result = notDiv.isNotDiv(list.length,list,0);
        System.out.println(result);
    }
}
