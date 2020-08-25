package com.javaclass;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("you will enter three numbers between 1 and 100 and the program will give you the average of the three numbers; numbers cannot be decimals, less than 1 or more than 100");
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the first number: ");
        int input1FromUser = scan.nextInt();
        if(input1FromUser<1|| input1FromUser>100) {
            System.out.println("please enter a number greater than 1 and less than 100");
        }
        System.out.println("please enter the second number: ");
        int input2FromUser = scan.nextInt();
        if(input2FromUser<1|| input2FromUser>100) {
            System.out.println("please enter a number greater than 1 and less than 100");
        }
        System.out.println("please enter the third number: ");
        int input3FromUser = scan.nextInt();;
        System.out.println( "the average value is " + (input1FromUser+input2FromUser+input3FromUser) /3);
        //int a = 3, b = 4, c = 5, e = 3;




    }

}
