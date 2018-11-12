package com.regex.challenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String h1 = "I want a bike.";
        System.out.println(h1.matches("I want a bike."));

        String regExp = "I want a \\w++.";
        System.out.println(h1.matches(regExp));
        String h2 = "I want a ball.";
        System.out.println(h2.matches(regExp));

        String regExp0 = "I want a (bike|ball).";
        System.out.println(h1.matches(regExp0));
        System.out.println(h2.matches(regExp0));


        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(h1 );
        System.out.println(matcher.matches());

        matcher = pattern.matcher(h2);
        System.out.println(matcher.matches());

        String h3 = "Replace all blanks with underscores.";
        System.out.println(h3.replaceAll("\\s","_"));


        String h4 = "aaabcccccccccdddefffg";
        System.out.println(h4.matches("[abcdefg]+")); //if it has every single occurence of the character given
        System.out.println(h4.matches("[a-g]+"));
        System.out.println(h4.matches("^a{3}bc{8}d{3}ef{3}g$")); //matches the string in its entirety
        System.out.println(h4.replaceAll("^a{3}bc{8}d{3}ef{3}g$", "REPLACED")); //a good way to verify

        String h5 = "abcd.135";
        System.out.println("sample = "+ h5.matches("^[a-z]{4}[\\.]{1}[0-9]{3}$"));
        System.out.println("f5.12a = "+ "f5.12a".matches("^[a-z]{4}[\\.]{1}[0-9]{3}$"));
        System.out.println("sample2 = "+ "abcd.135".matches("^[A-z][a-z]+\\.\\d+$")); //alternative way
        System.out.println("f5.12a = "+ "f5.12a".matches("^[a-z]{4}[\\.]{1}[a-z][0-9]{3}$"));

        String h6 = "abcd.135uvqz.7tzik.999";
        Pattern pattern2 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
        Matcher matcher2 = pattern.matcher(h6);
        while(matcher2.find()){
            System.out.println("Occurence: " + matcher2.group(1));
        }

        String h7 ="abcd.135uvqz.7tzik.999";
        System.out.println(h7.matches("^[A-z][a-z]+\\.\\d+$"));

        String h8 = "abcd.135uvqz.7tzik.999";
        Pattern pattern8 = Pattern.compile("[A-z][a-z]+\\.(\\d+)");
        Matcher matcher8 = pattern8.matcher(h8);
        while(matcher8.find()){
            System.out.println("Occurence: " + matcher8.group(1)); //retrieves numbers
        }

        String h9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern9 = Pattern.compile("[A-z][a-z]+\\.(\\d+)\\s"); //removes white spaces/tabs and displays same as above
        Matcher matcher9 = pattern9.matcher(h9);
        while(matcher9.find()){
            System.out.println("Occurence: " + matcher9.group(1));
        }

        String h10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s"); //removes white spaces/tabs and displays same as above
        Matcher matcher10 = pattern10.matcher(h10);
        while(matcher10.find()){
            System.out.println("Occurence: start " + matcher10.start(1) + " and end " + (matcher10.end(1)-1)); //returns indexes of numbers 135,7,999
        }

        String h11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");//all objects inside
        Matcher matcher11 = pattern11.matcher(h11);
        while(matcher11.find()) {
            System.out.println("Occurence: " + matcher11.group(1));
        }

        System.out.println("*************************************");


        String h12 = "{0, 2}, {0, 5}, {1, 3}, {2, 4} {x, y}, {6, 34}, {11, 12}";
        Pattern pattern12 = Pattern.compile("\\{(\\d+, \\d+)\\}"); //all numbers
        Matcher matcher12 = pattern12.matcher(h12);
        while(matcher12.find()) {
            System.out.println("Occurence: " + matcher12.group(1));
        }

        String h13 = "11111";
        System.out.println(h13.matches("^[0-9]{5}$"));
        System.out.println(h13.matches("^\\d{5}$")); //alternative

        String h14 = "11111-1111";
        System.out.println(h14.matches("^\\d{5}[\\-]{1}\\d{4}$"));
        System.out.println(h14.matches("^\\d{5}(-\\d{4})?$")); //alternative way

    }


}
