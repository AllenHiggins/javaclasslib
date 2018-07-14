package com.company;

public class UserInput {

    public static class TextInput {

        public String useInputs = "";

        public void add(char c){
            useInputs += c;
        }

        public final String getValue(){
            return useInputs;
        }

    }

    public static class NumericInput extends TextInput{

        public void add(char c){
            if( c >= 48 && c <= 57){
                useInputs += c;
            }
        }
    }
}
