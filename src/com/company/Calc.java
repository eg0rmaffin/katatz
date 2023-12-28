package com.company;

import java.util.Scanner;

class Calc {
    boolean isRoman;
    String operator;
    int answer;

    public void runCalc() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите арифметическое выражение: ");
        String input = scanner.nextLine();
        scanner.close();

        operator = LegitCheck.operatorCheck(input);
        LegitCheck.operandsNum(input);
        LegitCheck.bothSame(input);
        isRoman = RomanNumStuff.isRomanNumeral(input.split(" ")[0]);
        if(!isRoman)LegitCheck.intOnly(input);
        if(isRoman)LegitCheck.rangeCheckRoman(input);
        else LegitCheck.rangeCheck(input);
        if(isRoman)answer = performOperation(RomanNumStuff.convertToArabic(input.split(" ")[0]),RomanNumStuff.convertToArabic(input.split(" ")[2]),operator);
        else answer = performOperation(Integer.parseInt(input.split(" ")[0]), Integer.parseInt(input.split(" ")[2]),operator);
        if(!isRoman)System.out.println(answer);
        else if (answer>0)System.out.println(RomanNumStuff.convertToRoman(answer));
        else throw new Exception("В римской империи таких чисел не знали");


    }

    private static int performOperation(int a, int b, String operator) throws Exception {
        switch (operator){
            case "+":return (a+b);
            case "-":return (a-b);
            case "/":return (a/b);
            case "*":return (a*b);
            default:throw new Exception("попробуйте еще раз");
        }
    }
}
