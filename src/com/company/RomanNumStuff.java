package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class RomanNumStuff{
    private final static TreeMap<Integer, String> romanNumerals = new TreeMap<>();

    static {
        romanNumerals.put(1, "I");
        romanNumerals.put(4, "IV");
        romanNumerals.put(5, "V");
        romanNumerals.put(9, "IX");
        romanNumerals.put(10, "X");
        romanNumerals.put(40, "XL");
        romanNumerals.put(50, "L");
        romanNumerals.put(90, "XC");
        romanNumerals.put(100, "C");
        romanNumerals.put(400, "CD");
        romanNumerals.put(500, "D");
        romanNumerals.put(900, "CM");
        romanNumerals.put(1000, "M");
    }

    public static String convertToRoman(int number) {
        int floorKey = romanNumerals.floorKey(number);
        if (number == floorKey) {
            return romanNumerals.get(number);
        }
        return romanNumerals.get(floorKey) + convertToRoman(number - floorKey);
    }


    private final static Map<Character, Integer> arabicNumerals = new HashMap<>();

    static {
        arabicNumerals.put('I', 1);
        arabicNumerals.put('V', 5);
        arabicNumerals.put('X', 10);
        arabicNumerals.put('L', 50);
        arabicNumerals.put('C', 100);
        arabicNumerals.put('D', 500);
        arabicNumerals.put('M', 1000);
    }

    public static int convertToArabic(String roman) {
        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            int currentNumeral = arabicNumerals.get(roman.charAt(i));

            if (i < roman.length() - 1) {
                int nextNumeral = arabicNumerals.get(roman.charAt(i + 1));

                if (currentNumeral < nextNumeral) {
                    result += nextNumeral - currentNumeral;
                    i++; // Skip the next numeral, as it has been considered already.
                } else {
                    result += currentNumeral;
                }
            } else {
                result += currentNumeral;
            }
        }

        return result;
    }

    public static boolean isRomanNumeral(String input) {
        String romanNumeralPattern = "^[IVXLCDM]+$";
        return input.matches(romanNumeralPattern);
    }

    public static boolean isArabic(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
