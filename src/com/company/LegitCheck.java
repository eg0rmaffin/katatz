package com.company;

class LegitCheck{
    public static boolean operandsNum(String input) throws Exception {
        int tmp = input.trim().isEmpty() ? 0 : input.trim().split("\\s+").length;
        if (tmp==3)return true;
        else throw new Exception("Неверное количество операндов");

    }

    public static boolean rangeCheck(String input) throws Exception {
        String[]tmp = input.split(" ");
        try{
            if ((Integer.parseInt(tmp[0])>0 && Integer.parseInt(tmp[0])<11)&&(Integer.parseInt(tmp[2])>0 && Integer.parseInt(tmp[2])<11))return true;
            else throw new Exception("Принимаются числа от 1 до 10");
        }catch (NumberFormatException e){
            throw new Exception("Только целковые числа");
        }

    }

    public static boolean rangeCheckRoman(String input) throws Exception {
        String[]tmp = input.split(" ");
        try{
            if (((RomanNumStuff.convertToArabic(tmp[0]) )>0 && RomanNumStuff.convertToArabic(tmp[0])<11)&&(RomanNumStuff.convertToArabic(tmp[2])>0 && RomanNumStuff.convertToArabic(tmp[2])<11))return true;
            else throw new Exception("Принимаются числа от I до X");
        }catch (NumberFormatException e){
            throw new Exception("вряд ли эта ошибка вылетит.");
        }

    }

    public static boolean intOnly(String input) throws Exception {
        String[]tmp = input.split(" ");
        try{
            Integer.parseInt(tmp[0]);
            Integer.parseInt(tmp[2]);
            return true;
        }catch (NumberFormatException e){
            throw new Exception("Только целковые числа");
        }

    }

    public static boolean bothSame(String input) throws Exception {
        String[]tmp = input.split(" ");
        if ((RomanNumStuff.isRomanNumeral(tmp[0])&&RomanNumStuff.isRomanNumeral(tmp[2]))||(RomanNumStuff.isArabic(tmp[0])&&RomanNumStuff.isArabic(tmp[2])))return true;
        else throw new Exception("Выберите арабские или римские числа, что -то одно");


    }







}
