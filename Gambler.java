/*
file name:Gambler.java
CreatedBy:Praveen T
CreatedDate:12/10/16
purpose: Gambler program
*/
//package com.bridgelabz.java;
import java.util.*;
import java.io.*; 
public class Gambler{
	public static void main(String[] args){
		int stake,goal = 100,trials,win=0,lose=0;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter Stake");
		stake = scn.nextInt();
		System.out.println("Please Enter number of trials");
		trials = scn.nextInt();
		int points = stake;
		int m = trials;
		
		while(points>0 && points<goal && trials>0){
				double rand = Math.random(); //to get randome value between 0 to 1;
				if(rand<0.5){
					points++;
					win++;
				}
				else{
					points--;
					lose++;
				}
				trials--;
			}
		
		//finding the percentage of winning and losing
		System.out.println("percentage of winning bet :"+100*win/m+"%");
		System.out.println("percentage of Losing bet :"+100*lose/m+"%");
		//printing result
		if(points == goal){
			System.out.println("player Won, Stake = "+points);
		}
		else{
			System.out.println("Player Lose, Stake = "+points);
		}
	}
}
