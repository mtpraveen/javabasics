/*
file name:HarmonicSum
CreatedBy:Praveen T
CreatedDate:8/10/16
Purpose:Prints sum of harmonic number: 1/1 + 1/2 + ... + 1/N 
*/
//package com.bridgelabz.java;
import java.io.*;
import java.util.Scanner;
class HarmonicSum
{
     public static void main(String[] args)
     {
	Scanner scn = new Scanner(System.in);
 	System.out.println("Enter the number");
 	int n = scn.nextInt();
	float sum=0;
	for(int i=1;i<n;i++)
	{
	
	sum=sum+(float)1/i;
	
	}
	System.out.println(sum);
     }
}
