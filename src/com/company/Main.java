package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;

public class Main {

    public static void main(String[] args) {

        // Write Your Code Here


        // String A = "A586QK";
       // String B = "JJ653K";

       // int res = solution( A,  B);
      //  System.out.println("win count: " + res);



    }

    public static int solution(String A, String B) {
        // write your code in Java SE 8

        int winCount = 0;
        for(int i = 0; i <= A.length()-1; ++i) {
            int cardA = returnCardScore(A.charAt(i));
            int cardB = returnCardScore(B.charAt(i));
            System.out.println(cardA + " -- " + cardB);
            if(cardA > cardB){
                winCount++;
            }
        }

        return winCount;
    }

    public static int returnCardScore(char a){
        int cardScore = 0;
        switch (a){
            case 'A':
                cardScore = 13;
                break;
            case 'K':
                cardScore = 12;
                break;
            case 'Q':
                cardScore = 11;
                break;
            case 'J':
                cardScore = 10;
                break;
            case 'T':
                cardScore = 9;
                break;
            case '9':
                cardScore = 8;
                break;
            case '8':
                cardScore = 7;
                break;
            case '7':
                cardScore = 6;
                break;
            case '6':
                cardScore = 5;
                break;
            case '5':
                cardScore = 4;
                break;
            case '4':
                cardScore = 3;
                break;
            case '3':
                cardScore = 2;
                break;
            case '2':
                cardScore = 1;
                break;
        }

        return cardScore;
    }
}
