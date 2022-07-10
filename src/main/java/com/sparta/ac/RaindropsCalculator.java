package com.sparta.ac;

import java.util.ArrayList;

public class RaindropsCalculator {

    public static String raindropsStringBuilder(int numToFactor) {

        if (numToFactor > 0) {
            ArrayList<Integer> factorArray = new ArrayList<>();
            factorCalculator(numToFactor, numToFactor, factorArray);

            String returnString = "";
            if (factorArray.contains(3)) returnString += "Pling";
            if (factorArray.contains(5)) returnString += "Plang";
            if (factorArray.contains(7)) returnString += "Plong";
            if (returnString.isEmpty()) returnString += numToFactor;

            return returnString;
        } else {
            return "Cannot factor this number";
        }
    }

    public static void factorCalculator(int numToFactor, int numIncrements, ArrayList<Integer> factorArray) {
        if (numIncrements == 0) return;
        if (numToFactor % numIncrements == 0 ) factorArray.add(numIncrements);

        numIncrements--;
        factorCalculator(numToFactor, numIncrements, factorArray);
    }
}
