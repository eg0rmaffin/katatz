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





}
