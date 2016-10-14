/*
file name:FlipCoin.java
CreatedBy:Praveen T
CreatedDate:8/10/16
Purpose:2. Flip Coin and print percentage of Heads and Tails
*/
//package com.bridgelabz.java;
import java.util.*;

public class FlipCoin {
   public static void main( String args[] ){
	int head=0;
	int tail=0;
	int number=0;
	float headpercent;
	float tailpercent;

   Random r = new Random();
   Scanner scn = new Scanner(System.in);
   System.out.println("Enter the number");
   int n = scn.nextInt();
   // check next int value  
   // System.out.println("Next int value: " + ((float)rand.nextInt(n)%2));
   float rand=((float)r.nextInt(n));
	if(rand<0.5)
	{
	tail++;
	tailpercent=(tail/n)*100;
	System.out.println(tailpercent);
	}
	else
	{
	head++;
	headpercent=(head/n)*100;
	System.out.println(headpercent);
	}
   }    
}
