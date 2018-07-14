package com.company;

import com.sun.xml.internal.ws.protocol.soap.MessageCreationException;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.io.Console;
import java.nio.charset.CharacterCodingException;
import java.util.InvalidPropertiesFormatException;

public class CardGame {


    public CardGame(){}

    public int winCountForAPlayer(String A, String B) {

        int winCount = 0, cardA = 0, cardB = 0;
        try{
            for(int i = 0; i <= A.length()-1; ++i) {
                cardA = returnCardScore(A.charAt(i));
                cardB = returnCardScore(B.charAt(i));

                if(cardA > cardB){
                    winCount++;
                }
            }
            return winCount;
        }catch (Exception e){
            throw new StringIndexOutOfBoundsException("Both player cards must be same amount each and be vaild cards: 2-9 T J Q K A: " + e.getMessage());
        }
    }

    private static int returnCardScore(char cardInHand){

        int cardScore = 0;

        switch (cardInHand){
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
