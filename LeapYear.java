/*
file name:LeapYear.java
CreatedBy:Praveen T
CreatedDate:8/10/16
Purpose:LeapYear
*/
//package com.bridgelabz.java;
import java.io.*;
import java.util.Scanner;

class LeapYear
{
   public static void main(String args[])
   {
 	Scanner scn = new Scanner(System.in);
 	System.out.println("Enter the Year");
 	Integer n = scn.nextInt();
	int length =n.toString().length();
	if(length==4)
	{
	 if((n%4==0 && n%100!=0) || n%400==0)
	{
	System.out.println("its a leap year");
	}
	else
	{
	System.out.println("its a not leap year");
	}
	}
	else
	{
	System.out.println("plz enter four digits...!");
	}
	
   }
}	
