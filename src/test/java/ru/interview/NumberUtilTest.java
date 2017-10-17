package ru.interview;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NumberUtilTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testGetFirstSumsOfPairs() throws Exception {
        String[] arrayPairWithParameter = {"3", "100 8", "15 245", "1945 54"};
        assertEquals(Arrays.asList(108, 260, 1999), NumberUtil.getFirstSumsOfPairs(arrayPairWithParameter));
    }

    @Test
    public void testGetFirstSumsOfPairsMoreThanParameter() throws Exception {
        String[] arrayPairWithParameter = {"3", "100 8", "15 245", "1945 54", "2000 54"};
        assertEquals(Arrays.asList(108, 260, 1999), NumberUtil.getFirstSumsOfPairs(arrayPairWithParameter));
    }

    @Test
    public void testGetFirstSumsOfPairsLessThanParameter() throws Exception {
        String[] arrayPairWithParameter = {"3", "100 8", "15 245"};
        assertEquals(null, NumberUtil.getFirstSumsOfPairs(arrayPairWithParameter));
    }

    @Test
    public void testGetFirstSumsOfPairsNullParameter() throws Exception {
        thrown.expect(NullPointerException.class);
        NumberUtil.getFirstSumsOfPairs(null);
    }

    @Test
    public void testGetFirstSumsOfPairsNegativeParameter() throws Exception {
        String[] arrayPairWithParameter = {"-1", "100 8", "15 245"};
        assertEquals(null, NumberUtil.getFirstSumsOfPairs(arrayPairWithParameter));

        String[] arrayPairWithParameterSecond = {"0", "100 8", "15 245"};
        assertEquals(null, NumberUtil.getFirstSumsOfPairs(arrayPairWithParameterSecond));
    }

    @Test
    public void testGetFirstSumsOfPairsNumberFormat() throws Exception {
        thrown.expect(NumberFormatException.class);
        String[] arrayPairWithParameter = {"a", "100 8", "15 245", "1945 54"};
        assertEquals(Arrays.asList(108, 260, 1999), NumberUtil.getFirstSumsOfPairs(arrayPairWithParameter));
    }
}