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

        System.out.println("Harry".replaceAll("[Hh]arry","harry")); //changes hh to lower case



        String alphanumeric1 = "1234chacha";
        String sample = "1234567890qwertyuiopasdfghjklzxcvbnmASDFGHJKL";
        System.out.println(alphanumeric1.replaceAll("[^ha]","X")); //all replaced besides 'ha'
        System.out.println(alphanumeric1.replaceAll("[ha]","X")); //replaces ha 'ha'
        System.out.println(sample.replaceAll("[a-h7-9A-F]","x"));
        System.out.println(sample.replaceAll("(?i)[a-h7-9]","x")); //replaces all letters either capital or not
        System.out.println(sample.replaceAll("\\d","x")); //replaces numbers with x
        System.out.println(sample.replaceAll("\\D","x")); //replaces all non-numbers

        String hasspaces = "1 2 3 4 5 q w e r t y u i\to p";
        System.out.println(hasspaces.replaceAll("\\s","")); //removes white spaces
        System.out.println(hasspaces.replaceAll("\t","")); //removes tab
        System.out.println(hasspaces.replaceAll("\\S","")); //replaces all the non-whitespaces
        System.out.println(hasspaces.replaceAll("\\w","x")); //replaces all characters with x
        System.out.println(hasspaces.replaceAll("\\b","x")); //surrounds each word with 'x'

        String sample1 = "sampleeeeeee";
        System.out.println(sample1.replaceAll("^sample{1}", "YYY"));





    }
}
