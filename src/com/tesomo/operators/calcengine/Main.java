package com.tesomo.operators.calcengine;


public class Main {

    public static void main(String[] args) {

        double value1 = 900.0d;
        double value2 = 50.0d;
        double result = 0.0d;
        int b = 2;
        char opCode = 'd';
        if(opCode == 'a')
            result = value1 + value2;
        else if(opCode =='s')
            result = value1 - value2;

        else if(opCode =='m')
            result = value1 * value2;
        else if(opCode == 'd')
            result = value1 / value2;
        else
            result = 0.0d;
        System.out.println(result);
        String m = "result is a greater than 2";
        String n = "result is 2 or less than 2";
        if(result >2)
            System.out.println(m);
        else
            System.out.println(n);

        System.out.println(value1 + b);

    }



    }




