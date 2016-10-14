/*
file name:BinarySearchList.java
CreatedBy:Praveen T
CreatedDate:13/10/16
purpose:Binary Search the Word from Word List
*/

//package com.bridgelabz.java;
import java.util.*;
public class BinarySearchList{
	public static void main(String[] args){
		int size,first,last,mid,count = 0; 
		Scanner scn =new Scanner(System.in);
		System.out.println("Please Enter Strings");
		String names = scn.nextLine();
		String str1[] = names.split(",");
		size = str1.length;
		System.out.println("Please Enter the string to be find :");
		String str2 = scn.nextLine();

		for(int i=1;i<size;i++){
			for(int j=i;j>0;j--){
				if(str1[j-1].compareTo(str1[j])>0){
					String temp = str1[j];
					str1[j] = str1[j-1];
					str1[j-1] = temp;
				}
			}
		}

		System.out.println("Sorted Strings are: ");
		for(int i=0;i<str1.length;i++)	
		{
		System.out.println(str1[i]);
		}

		first = 0;
		last= size-1;

		while(first <= last){
			mid = (first+last)/2;
			if (str2.compareTo(str1[mid])==0){
				System.out.println("\nSearch found at position :"+mid);
				count++;
				break;
			}
			if(str2.compareTo(str1[mid])<0)
				last = mid-1;
			else
				first = mid+1;		
		}
		if(count == 0)
			System.out.println("\nSearch not found");		
		
	}
}
