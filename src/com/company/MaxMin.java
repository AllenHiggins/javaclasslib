package com.company;

public class MaxMin {

    public MaxMin(){}

    public String findMaxMin(int[] list){
        int count = 0, sum = 0, max = 0, min = 2147483647;
        while(count <= list.length-1){
            sum = holdOneGetSum(list, count);
            max = setMax(sum, max);
            min = setMin(sum, min);
            count++;
        }
        return String.format("%s %s", max,min);
    }

    private static int holdOneGetSum(int[] list, int index){
        int sum = 0;

        for(int i = 0; i <= list.length-1; ++i){
            if( index == i){
                continue;
            }else{
                sum += list[i];
            }
        }

        return sum;
    }

    private static int setMax(int number, int max){
        if(max < number){ max = number;}
        return max;
    }

    private static int setMin(int number, int min){
        if(min > number){
            min = number;
        }
        return min;
    }
}
