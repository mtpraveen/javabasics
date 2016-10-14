/*
file name:GetInputFromUser
CreatedBy:Praveen T
CreatedDate:8/10/16
Purpose:Take User Input and Replace UserName
*/
//package com.bridgelabz.java;
import java.io.*;
import java.util.Scanner;
 
class GetInputFromUser
{
   public static void main(String args[])
   {
 	Scanner scn = new Scanner(System.in);
 	System.out.println("Enter a username");
 	String str = scn.nextLine();
	if(str.length()>=3)
	{
	System.out.println("hello"    +  str  + ",how are you");
	}
	else
	{
	System.out.println("enter the more than 3 characters");
	}
   }
}
  
