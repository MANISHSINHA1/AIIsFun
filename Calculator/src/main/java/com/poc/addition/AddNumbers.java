package com.poc.addition;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number ::");
        String number1 = scanner.nextLine();

        System.out.println("Enter second number ::");
        String number2 = scanner.nextLine();

        System.out.println("Enter third number ::");
        String number3 = scanner.nextLine();

        Integer sum = Integer.valueOf(number1) + Integer.valueOf(number2) - Integer.valueOf(number3);

        System.out.println(sum);




    }




}
