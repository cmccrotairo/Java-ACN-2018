package com.regex;

public class Main {
    public static void main(String[] args) {
        String string = "I am charionne. Yes I am.";
        System.out.println(string);

        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "1234chacha";
        System.out.println(alphanumeric.replaceAll(".","b")); //bbbbbbbb
        System.out.println(alphanumeric.replaceAll("^1234","kek")); //kekchacha
        //take cursor in regex and click popup>Check RegExp

        System.out.println(alphanumeric.matches("^1234cha")); //false
        System.out.println(alphanumeric.matches("^1234chacha")); //true


        System.out.println(alphanumeric.replaceAll("cha$", "zxc")); //1234chazxc
        System.out.println(alphanumeric.replaceAll("[ca3]","x")); //12x4xhxxhx

        System.out.println(alphanumeric.replaceAll("[34a][h]", "x"));
    }
}
