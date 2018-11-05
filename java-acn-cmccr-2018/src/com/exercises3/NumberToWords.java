package com.exercises3;

public class NumberToWords {
    //gets the number and reverses it
    //uses the reversed version to display the code
    public static void numberToWords(int number) {
        int lastDigit=0;
        int reversed = reverse(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        for (int i = 0; i < getDigitCount(number); i++){
            lastDigit =reversed%10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }reversed/=10;
        }


    }
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number = number/10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        int temp=0;

        if(number<0){
            return -1;
        }
        if (number == 0) {
            return 1;
        }


        for (int a = 0; number>0; a++ ){
            number/=10;
            temp++;
        }
        return temp;
    }
}