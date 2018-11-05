package com.variables;

public class MoreUnicode {
    public static void main(String[] args) {
        char myChar = '\u00A9'; //http://unicode-table.com/en/#control-character
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen.

        char registeredSymbol = '\u00AE'; //http://unicode-table.com/en/#control-character
        System.out.println("Registered symbol = " + registeredSymbol);
    }
}
