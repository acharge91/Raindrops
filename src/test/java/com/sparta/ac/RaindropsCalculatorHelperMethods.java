package com.sparta.ac;

import java.util.ArrayList;
import java.util.Arrays;

public class RaindropsCalculatorHelperMethods {

    public static ArrayList<Integer> getFactorCalculatorResult(int numToFactor) {
        ArrayList<Integer> factorArray = new ArrayList<>();
        RaindropsCalculator.factorCalculator(numToFactor, numToFactor, factorArray);
        return factorArray;
    }

    public static boolean checkAllElementsAreDivisible(int numToFactor) {
        ArrayList<Integer> factorArray = new ArrayList<>();
        RaindropsCalculator.factorCalculator(numToFactor, numToFactor, factorArray);
        boolean isDivisible = false;
        for (int number : factorArray) {
            if (numToFactor % number == 0) {
                isDivisible = true;
            } else {
                isDivisible = false;
                break;
            }
        }
        return isDivisible;
    }
}
