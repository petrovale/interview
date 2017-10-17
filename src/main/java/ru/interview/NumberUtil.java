package ru.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NumberUtil {

    public static List<Integer> getFirstSumsOfPairs(String[] arrayPairsWithParameter) {
        Objects.requireNonNull(arrayPairsWithParameter, "String can not be null");
        int numberOfPairs = Integer.parseInt(arrayPairsWithParameter[0]);
        if (arrayPairsWithParameter.length <= numberOfPairs)
            return null;
        if (numberOfPairs <= 0)
            return null;

        List<Integer> sumOfPairs = new ArrayList<>(numberOfPairs);
        for (int i = 1; i <= numberOfPairs; i++) {
            String[] numbersFromPair = arrayPairsWithParameter[i].split(" ");
            int sum =0;
            for (int j = 0; j < numbersFromPair.length; j++) {
                int number = Integer.parseInt(numbersFromPair[j]);
                sum+= number;
            }
            sumOfPairs.add(sum);
        }

        return sumOfPairs;
    }
}
