package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String sample2 = "sammmmmmmple";
        System.out.println(sample1.replaceAll("^sample{1}", "YYY")); //replaces e, number depends on occurences


        System.out.println(sample2.replaceAll("^sam+", "YYY")); //replaces all long m
        System.out.println(sample2.replaceAll("^sam*", "YYY")); //replaces any occurence of m
        System.out.println(sample2.replaceAll("^sam{2,5}", "YYY")); //replaces m placed 2 to 5
        System.out.println(sample2.replaceAll("a+m*", "x"));

        //http://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html
        //https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>Sample paragraph.</p>");
        htmlText.append("<p>Lorem ipsum dolor</p>");
        htmlText.append("<h2>Summaree</h2>");
        htmlText.append("<p>Sum-a-ree</p>");

        String h2Pattern = ".*Sam.*"; //regex format for finding occurence in html text

        String h2PatternSample = "Summaree";
        Pattern pattern = Pattern.compile(h2PatternSample);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches()); //checks if the string has the given string


        matcher.reset();
        int count = 0;
        while(matcher.find()){
            count++;
            System.out.println("Occurence " + count + " : " + matcher.start() + " to " + matcher.end());
        }


        String h2GroupPattern = "(<h2>.*</h2>)"; //for starting h2 up to end h2
        String h2GroupPattern1 = "(<h2>.*?</h2>)"; //for occurrences of both h2
        Pattern groupPattern = Pattern.compile(h2GroupPattern1);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()){
            System.out.println("Occurence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while(h2TextMatcher.find()){
            System.out.println("Occurence: "+ h2TextMatcher.group(2)); //trying to extract the text between the tags without the tags
        }

        //=====================================================================

        System.out.println("Charionne".replaceAll("[C|c]harionne", "Cha"));
        System.out.println("Charionne".replaceAll("[C|c]harionne", "Cha"));

        String tvTest = "tstvtkt";
        String tNotVRegExp1 =  "t[^v]";
        String tNotVRegExp2 =  "t(?!v)"; // opposite is t(?=v)
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp2);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count=0;
        while(tNotVMatcher.find()){
            count++;
            System.out.println("Occurence " + count + " : "+ tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }

        String phone1 = "1234567890";
        String phone2 = "(02) 726-1510";
        String phone3 = "038758353";
        String phone4 = "(123)456-7890";

        System.out.println("phone1 = "+ phone1.matches("^([\\(]{1}[0-9]{2}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = "+ phone2.matches("^([\\(]{1}[0-9]{2}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$")); //string format returns true (ph-based)
        System.out.println("phone3 = "+ phone3.matches("^([\\(]{1}[0-9]{2}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = "+ phone4.matches("^([\\(]{1}[0-9]{2}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

        String visa1 = "123412341234";
        String visa2 = "4444333322221111";
        String visa3 = "4555555555554";
        String visa4 = "1234";
        System.out.println();

        System.out.println("visa1 = "  + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 = "  + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 = "  + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 = "  + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));




    }
}
