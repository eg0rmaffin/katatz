package com.company;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите арифметическое выражение: ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(LegitCheck.operandsNum(input));
        System.out.println(LegitCheck.rangeCheck(input));
        System.out.println(LegitCheck.intOnly(input));
    }
}
