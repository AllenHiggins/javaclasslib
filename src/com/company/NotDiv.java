package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NotDiv {

    public NotDiv(){

    }

    public List<Integer> isNotDiv(int numOfElements, int[] list, int divBy){

        List<Integer> notDivList = new ArrayList<Integer>();

        if(numOfElements > 1) {

            int size = numOfElements - 1;

            returnResultListGreaterThanOne( size, notDivList, list, divBy);

        }else{
            returnListOne(list, divBy, notDivList);
        }

        return notDivList;
    }

    private static void returnResultListGreaterThanOne(int size, List<Integer> notDivList,int[] list, int divBy){
        try {
            for (int i = 0; i < size; ++i) {
                int sum = 0;
                for (int j = i + 1; j <= size; ++j) {
                    sum = list[i] + list[j];

                    if (sum % divBy != 0) {
                        checkAddToList(list[i], notDivList);
                        checkAddToList(list[j], notDivList);
                    }
                }
            }
        } catch (Exception e) {
            throw new ArithmeticException("Cannot Divide by Zero");
        }
    }

    private static void returnListOne(int[] list, int divBy, List<Integer> notDivList){
        try {
            if (list[0] % divBy != 0) {
                checkAddToList(list[0], notDivList);
            }
        } catch (Exception e) {
            throw new ArithmeticException("Cannot Divide by Zero");
        }
    }

    private static void checkAddToList(int number, List<Integer> list){
        if(!list.contains(number)) {
            list.add(number);
            Collections.sort(list);
        }
    }

}
