package com.jUnit.challenge;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {
    private String input;
    private String output;
    private Utilities util;

    public UtilitiesTestParameterized(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Before
    public void setup(){
        util = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
            {"ABCDEFF", "ABCDEF"},
            {"AB88EFFG", "AB8EFG"},
            {"12233445566", "123456"},
            {"ZYZQQB", "ZYZQB"},
            {"A", "A"}
        });
    }

    @org.junit.Test
    public void removePairs() throws Exception {
        //assertEquals(output, util.removePairs(input));
        //assertNotEquals(output, util.removePairs(input));
    }


}
