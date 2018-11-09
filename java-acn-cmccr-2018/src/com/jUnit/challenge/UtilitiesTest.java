package com.jUnit.challenge;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class UtilitiesTest {

    private Utilities util = new Utilities();

    @Before
    public void beforeclass(){
        util = new Utilities();
    }

    @Test
    public void everyNthChar() {
        char[] chararray = {'h','e','l','l','o'};
        assertArrayEquals(new char[]{'e','l',}, util.everyNthChar(chararray, 2) );
        assertArrayEquals(new char[]{'h','e','l','l','o'}, util.everyNthChar(chararray, 6) );
    }

    @Test
    public void removePairs() {
//        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
//        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
//        assertEquals("A", util.removePairs("A"));
//        assertEquals("XZY", util.removePairs("XXZZYY"));

        assertEquals("ABCDEFF", util.removePairs("ABCDEFF"));
        assertEquals("AB88EFFG", util.removePairs("AB88EFFG"));
        assertEquals("12233445566", util.removePairs("12233445566"));
        assertEquals("ZYZQQB", util.removePairs("ZYZQQB"));
        assertEquals("A", util.removePairs("A"));
    }

    @Test
    public void converter() {
        assertEquals(300, util.converter(10,0) );
    }

    @Test (expected = ArithmeticException.class)
    public void converter_arithmeticexpression() throws Exception {
        util.converter(10,0);
    }

    @Test
    public void nullIfOddLength() {
        assertEquals("timo", util.nullIfOddLength("timo"));
        assertEquals(null, util.nullIfOddLength("tim"));
        assertNotNull(util.nullIfOddLength("timo"));
    }
}
