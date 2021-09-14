package org.example;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {
        DecimalFormat f = new DecimalFormat("#0.###");
        Scanner scanner = new Scanner(System.in);
        float[] numbers = new float[3];

        System.out.println( "Enter the first number: " );
        numbers[0] = scanner.nextFloat();

        System.out.println( "Enter the second number: " );
        numbers[1] = scanner.nextFloat();

        System.out.println( "Enter the third number: " );
        numbers[2] = scanner.nextFloat();

        Arrays.sort(numbers);
        float biggest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if( numbers[i] == numbers[i-1])
                System.exit(0);
            if(numbers[i] > biggest)
                biggest = numbers[i];
        }

        System.out.println( "The largest number is " + f.format(biggest) + ".");

        scanner.close();
    }
}
