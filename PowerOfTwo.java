/*
file name:PowerOfTwo.java
CreatedBy:Praveen T
CreatedDate:8/10/16
Purpose:This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
*/
//package com.bridgelabz.java;
public class PowerOfTwo
{
     public static void main(String[] args)
     {
            //This is the given input number n
            int n = 31;
 
            int i = 0;
            int power = 1;
 
            System.out.println("Powers of 2 that are less than 2^"+n);
            while (i <= n)
            {
                System.out.println("2^"+i+" = " + power);
                power = power * 2;
                i++;
            }
        }
}
