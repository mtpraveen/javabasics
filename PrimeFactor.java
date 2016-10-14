/*
file name:PrimeFactor.java
CreatedBy:Praveen T
CreatedDate:10/10/16
Purpose:compute the prime factors
*/
//package com.bridgelabz.java;
import java.io.*;
import java.lang.*;
class PrimeFactor
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.print("Enter a Number : ");
		n=Integer.parseInt(br.readLine());
 
		System.out.print("The Prime Factors of "+n+" are : ");
 
		int i=2;
		while(n>1)
  		{
   			 if(n%i == 0)
   			 {
    			 System.out.print(i+" ");
    			 n=n/i;
    			 }
  			 else
   		 	 i++;
  		}
	}
}
