package com.company;

import java.util.Arrays;

public class AngryProfessor {

    public String angryProfessorTimeSheet(int k, int[] a) {

        int isEarly = 0;
        String result = "YES";

        Arrays.sort(a);

        for (int number : a) {
            if(number <= 0) {
                isEarly++;
            }

            if(isEarly == k) {
                result = "NO";
                break;
            }
        }

        return result;
    }

}
