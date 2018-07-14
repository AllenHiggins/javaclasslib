package com.company;

public class Main {

    public static void main(String[] args) {

        // Write Your Code Here

        UserInput.TextInput textInput = new UserInput.TextInput();
        UserInput.TextInput numericInput = new UserInput.NumericInput();
        textInput.add('1');
        textInput.add('a');
        textInput.add('0');
        numericInput.add('1');
        numericInput.add('a');
        numericInput.add('0');
        System.out.println(textInput.getValue());
        System.out.println(numericInput.getValue());
    }

}
