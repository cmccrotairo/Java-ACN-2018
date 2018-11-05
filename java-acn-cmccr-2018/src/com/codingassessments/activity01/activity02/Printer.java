package com.codingassessments.activity01.activity02;

public class Printer {
    public void print(String string, int value){
        ConsolePrinter console = new ConsolePrinter();

        if (string.equals("box")){
            console.printBox(value);
        }else if(string.equals("x")){
            console.printX(value);
        }
    }
}