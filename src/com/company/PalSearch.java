package com.company;

public class PalSearch {

    public PalSearch(){ }

    public Boolean isStringAPal(String str){
        str = str.replaceAll("[' ;:()\\\",?\\-!.\\\\]","");
        Boolean isPal = searchWordForPal(str);
        return isPal;
    }

    public Boolean isWordAPal(String word){
        Boolean isPal = searchWordForPal(word);
        return  isPal;
    }

    private static Boolean searchWordForPal(String word){
        int posFromEnd = word.length()-1;
        int halfWay = Math.abs(word.length() / 2);
        Boolean isPal = true;

        for(int i = 0; i <= word.length()-1; ++i){

            if(i > halfWay && halfWay > posFromEnd) {
                break;
            }

            if(word.toLowerCase().charAt(i) != word.toLowerCase().charAt(posFromEnd)){
                isPal = false;
                break;
            }

            posFromEnd--;
        }
        return isPal;
    }

}
