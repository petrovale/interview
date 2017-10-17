package ru.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NumberUtil {

    private NumberUtil() {
    }

    public static List<Integer> getFirstSumsOfPairs(String[] arrayPairsWithParameter) {
        Objects.requireNonNull(arrayPairsWithParameter, "String can not be null");
        int numberOfPairs = Integer.parseInt(arrayPairsWithParameter[0]);
        if (arrayPairsWithParameter.length <= numberOfPairs)
            return null;
        if (numberOfPairs <= 0)
            return null;

        List<Integer> sumOfPairs = new ArrayList<>(numberOfPairs);
        for (int i = 1; i <= numberOfPairs; i++) {
            sumOfPairs.add(
                    getSumOfPair(
                            getNumbersFromPair(
                                    arrayPairsWithParameter[i])));
        }

        return sumOfPairs;
    }

    private static int getSumOfPair(String[] numbersFromPair) {
        int sum = 0;
        for (String number : numbersFromPair) {
            if (!number.equals("")) {
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }

    private static String[] getNumbersFromPair(String arrayPairsWithParameter) {
        return arrayPairsWithParameter.trim().split(" ");
    }
}
