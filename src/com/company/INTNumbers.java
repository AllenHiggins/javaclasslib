package com.company;

public class INTNumbers {

    public INTNumbers(){}

    public int getReverseInt(int value) {
        int resultNumber = 0;
        for (int i = value; i != 0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;
        }
        return resultNumber;
    }

    public int numDif(int x, int y){
        return Math.abs(x - y);
    }

    public boolean numIsEvenlyDivisible(int x, int y){
        try {
            Boolean result = x % y == 0 ? true : false;
            return result;
        }catch (Exception e){
            throw new ArithmeticException("Cannot Divide by Zero: " + e);
        }
    }

    public int beautifulDays(int i, int j, int k) {
        int numberOfBeautifulDays = 0, startDay = i, endDay = j;

        while(startDay <= endDay){
            int rev = getReverseInt(startDay);
            int diff = numDif(startDay, rev);
            boolean isBeautiful = numIsEvenlyDivisible(diff, k);
            if(isBeautiful){
                numberOfBeautifulDays++;
            }
            startDay++;
        }

        return numberOfBeautifulDays;
    }
}
