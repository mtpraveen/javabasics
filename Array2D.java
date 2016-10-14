/*
file name:Array2D.java
CreatedBy:Praveen T
CreatedDate:14/10/16
purpose: A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
*/
//package com.bridgelabz.java;
import java.util.*;
public class Array2D
{
	public static void main(String[] args){
		int row,column,choice;
		

		System.out.println("Please choose which type of array you want to create :");
		System.out.println(" 1.Integer \n 2.Double \n 3.Boolean");
		Scanner scn = new Scanner(System.in);
		choice =scn.nextInt();
		switch(choice){
			case 1:{
				System.out.println("Please Enter no. of Rows :");
					row = scn.nextInt();
				System.out.println("Please Enter no. Columns :");
					column =scn.nextInt();
					Integer array[][] = new Integer[row][column];

					for(int i=0;i<row;i++){
						for(int j=0;j<column;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = scn.nextInt();
					}
				}
		

				System.out.println("Array is");
				for(int i=0;i<row;i++){
					for(int j=0;j<column;j++){
						System.out.print(array[i][j]+" ");
			}
			System.out.println();
				}
				
				break;
			}

			case 2:{
				System.out.println("Please Enter no. of Rows :");
					row = scn.nextInt();
				System.out.println("Please Enter no. Columns :");
					column = scn.nextInt();
					Double array[][] = new Double[row][column];

					
					for(int i=0;i<row;i++){
						for(int j=0;j<column;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = scn.nextDouble();
					}
				}
		
				System.out.println("Array is");
				for(int i=0;i<row;i++){
					for(int j=0;j<column;j++){
						System.out.print(array[i][j]+" ");
			}
			System.out.println();
				}
				break;
			}

			case 3:{
				System.out.println("Please Enter no. of Rows :");
					row =scn.nextInt();
				System.out.println("Please Enter no. Columns :");
					column = scn.nextInt();
					Boolean array[][] = new Boolean[row][column];

					
					for(int i=0;i<row;i++){
						for(int j=0;j<column;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = scn.nextBoolean();
					}
				}
		
				System.out.println("Array is");
				for(int i=0;i<row;i++){
					for(int j=0;j<column;j++){
						System.out.print(array[i][j]+" ");
			}
			System.out.println();
				}
				break;
			}
	
		}


	}	
}

