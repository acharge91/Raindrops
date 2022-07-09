package com.sparta.ac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class RaindropsCalculatorTests {

    @Nested
    @DisplayName("factoryCalculator tests")
    public class factorCalculatorTests {


        @Test
        @DisplayName("Check factorCalculator returns correct factors of 1")
        void checkCorrectFactorsOf1Returned() {
            ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(1));
            Assertions.assertTrue(RaindropsCalculatorHelperMethods.checkAllElementsAreDivisible(1));
            Assertions.assertEquals(expectedResult, RaindropsCalculatorHelperMethods.getFactorCalculatorResult(1));
        }

        @Test
        @DisplayName("Check factorCalculator returns correct factors of 28")
        void checkCorrectFactorsOf28Returned() {
            ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(28, 14, 7, 4, 2, 1));
            Assertions.assertTrue(RaindropsCalculatorHelperMethods.checkAllElementsAreDivisible(28));
            Assertions.assertEquals(expectedResult, RaindropsCalculatorHelperMethods.getFactorCalculatorResult(28));
        }

        @Test
        @DisplayName("Check factorCalculator returns correct factors of 50")
        void checkCorrectFactorsForOfReturned() {
            ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(50, 25, 10, 5, 2, 1));
            Assertions.assertTrue(RaindropsCalculatorHelperMethods.checkAllElementsAreDivisible(50));
            Assertions.assertEquals(expectedResult, RaindropsCalculatorHelperMethods.getFactorCalculatorResult(50));
        }

        @Test
        @DisplayName("Check factorCalculator returns correct factors of 84")
        void checkCorrectFactorsOf84Returned() {
            ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(84, 42, 28, 21, 14, 12, 7, 6, 4, 3, 2, 1));
            Assertions.assertTrue(RaindropsCalculatorHelperMethods.checkAllElementsAreDivisible(84));
            Assertions.assertEquals(expectedResult, RaindropsCalculatorHelperMethods.getFactorCalculatorResult(84));
        }

        @Test
        @DisplayName("Check factorCalculator returns correct factors of 60")
        void checkCorrectFactorsOf60Returned() {
            ArrayList<Integer> expectedResult = new ArrayList<>(Arrays.asList(60, 30, 20, 15, 12, 10, 6, 5, 4, 3, 2, 1));
            Assertions.assertTrue(RaindropsCalculatorHelperMethods.checkAllElementsAreDivisible(60));
            Assertions.assertEquals(expectedResult, RaindropsCalculatorHelperMethods.getFactorCalculatorResult(60));
        }

        @Test
        @DisplayName("Check factorCalculator returns empty array for factors of 0")
        void check0ReturnsEmptyArray() {
            ArrayList<Integer> expectedResult = new ArrayList<>();
            Assertions.assertEquals(expectedResult, RaindropsCalculatorHelperMethods.getFactorCalculatorResult(0));
        }

    }

    @Nested
    @DisplayName("raindropsStringBuilder tests")
    public class RaindropsStringBuilderTests {

        @Test
        @DisplayName("Check raindropsStringBuilder returns 'Cannot factor this number' for 0")
        void check0ReturnsCannotFactorString() {
            Assertions.assertEquals("Cannot factor this number", RaindropsCalculator.raindropsStringBuilder(0));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 'Cannot factor this number' for negative number")
        void checkNegativeReturnsCannotFactorString() {
            Assertions.assertEquals("Cannot factor this number", RaindropsCalculator.raindropsStringBuilder(-6));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 'Pling' for 3")
        void check12ReturnsPling() {
            Assertions.assertEquals("Pling", RaindropsCalculator.raindropsStringBuilder(3));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 'Pling' for 27")
        void check27ReturnsPling() {
            Assertions.assertEquals("Pling", RaindropsCalculator.raindropsStringBuilder(27));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 'Plang' for 5")
        void check5ReturnsPlang() {
            Assertions.assertEquals("Plang", RaindropsCalculator.raindropsStringBuilder(5));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 'Plang' for 20")
        void check20ReturnsPlang() {
            Assertions.assertEquals("Plang", RaindropsCalculator.raindropsStringBuilder(20));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 'Plong' for 7")
        void check7ReturnsPlong() {
            Assertions.assertEquals("Plong", RaindropsCalculator.raindropsStringBuilder(7));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 'Plong' for 49")
        void check49ReturnsPlong() {
            Assertions.assertEquals("Plong", RaindropsCalculator.raindropsStringBuilder(49));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 'PlingPlang' for 15")
        void check15ReturnsPlingPlang() {
            Assertions.assertEquals("PlingPlang", RaindropsCalculator.raindropsStringBuilder(15));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 'PlingPlang' for 60")
        void check60ReturnsPlingPlang() {
            Assertions.assertEquals("PlingPlang", RaindropsCalculator.raindropsStringBuilder(60));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 'PlingPlong' for 21")
        void check21ReturnsPlingPlong() {
            Assertions.assertEquals("PlingPlong", RaindropsCalculator.raindropsStringBuilder(21));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 'PlingPlong' for 84")
        void check84ReturnsPlingPlong() {
            Assertions.assertEquals("PlingPlong", RaindropsCalculator.raindropsStringBuilder(84));
        }
        @Test
        @DisplayName("Check raindropsStringBuilder returns 'PlangPlong' for 35")
        void check35ReturnsPlangPlong() {
            Assertions.assertEquals("PlangPlong", RaindropsCalculator.raindropsStringBuilder(35));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 'PlangPlong' for 70")
        void check70ReturnsPlangPlong() {
            Assertions.assertEquals("PlangPlong", RaindropsCalculator.raindropsStringBuilder(70));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 'PlingPlangPlong' for 105")
        void check105ReturnsPlingPlangPlong() {
            Assertions.assertEquals("PlingPlangPlong", RaindropsCalculator.raindropsStringBuilder(105));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 'PlingPlangPlong' for 735")
        void check735ReturnsPlingPlangPlong() {
            Assertions.assertEquals("PlingPlangPlong", RaindropsCalculator.raindropsStringBuilder(735));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 2 for 2")
        void check2Returns2() {
            Assertions.assertEquals("2", RaindropsCalculator.raindropsStringBuilder(2));
        }

        @Test
        @DisplayName("Check raindropsStringBuilder returns 92 for 92")
        void check92Returns92() {
            Assertions.assertEquals("92", RaindropsCalculator.raindropsStringBuilder(92));
        }

    }

}
