/*
file name:BinarySearchList.java
CreatedBy:Praveen T
CreatedDate:13/10/16
purpose:Binary Search the Word from Word List
*/

package com.bridgelabz.java;
import java.util.*;
public class BinarySearchList{
	public static void main(String[] args){
		int mSize,mFirst,mLast,mid,mCount = 0; 
		Scanner scn =new Scanner(System.in);
		System.out.println("Please Enter Strings");
		String names = scn.nextLine();
		String str1[] = names.split(",");
		mSize = str1.length;
		System.out.println("Please Enter the string to be find :");
		String str2 = scn.nextLine();

		for(int i=1;i<mSize;i++){
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

		mFirst = 0;
		mLast= mSize-1;

		while(mFirst <= mLast){
			mid = (mFirst+mLast)/2;
			if (str2.compareTo(str1[mid])==0){
				System.out.println("\nSearch found at position :"+mid);
				mCount++;
				break;
			}
			if(str2.compareTo(str1[mid])<0)
				mLast = mid-1;
			else
				mFirst = mid+1;		
		}
		if(mCount == 0)
			System.out.println("\nSearch not found");		
		
	}
}
