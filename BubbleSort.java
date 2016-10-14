/*
file name:BubbleSort.java
CreatedBy:Praveen T
CreatedDate:08/10/16
Purpose:Compare adjacent elements and swap them
*/
//package com.bridgelabz.java;
import java.util.*;
public class BubbleSort
{

 public static void main(String args[])
   {
        int temp=0;
        int arr[]={9,2,5,3,8,1};
        int n=arr.length;

        for(int i=0;i<n;i++)
        {
        for (int j=0;j<n;j++)    
          {
         if (arr[j] > arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
          }
        }
   }
}
