package com.debug.sample0;

/**
 * Created by timbuchalka on 15/11/16.
 */
public class StringUtilities {
    private int charsAdded = 0;

    public void addChar(StringBuilder sBuilder, char c) {
        sBuilder.append(c);
        charsAdded++;
    }
}
