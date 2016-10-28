/*
*@file name: Utility.java
*@Created By: Praveen T
*@Date: 12/10/2016
*@purpose: Utility class for data input and common code.
*/
import java.io.*;

import java.util.Scanner;


public class Utility{
	BufferedReader br,rf = null;

	//Utility constructor for creating object for BufferedReader
	public Utility(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	//input string
	public String inputString(){
		try{
			return br.readLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "";
	}
	
	//input Integer
	public int inputInteger(){
		try{
			return Integer.parseInt(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
		return 0;
	}

	//input double
	public double inputDouble(){
		try{
			return Double.parseDouble(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}new BufferedReader(new InputStreamReader(System.in));
		return 0.0;
	}


	//input boolean
	public boolean inputBoolean(){
		try{
			return Boolean.parseBoolean(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
		return false;
	}

	//coin flipping
	public void randFlip(int num){
		double head=0,tail=0,random;
		for(int i=1; i<=num; i++){
			random = Math.random(); //to get randome value between 0 to 1;
			if(random<0.5){
					tail++;	
			}
			else{
					head++;
			}
		}
		System.out.println("Percentage of heads ="+(head/num)*100+"%");
		System.out.println("Percentage of tails ="+(tail/num)*100+"%");
			
	}

	//taking integer array input
	public Integer[] inputIntArray(int size){
		Integer array[] = new Integer[size];
		for(int i=0;i<size;i++){
			System.out.print("Please enter Element at "+(i+1)+" position: ");
			array[i] = this.inputInteger();
		}
		return array;
	}

	//taking String array input
	public String[] inputStringArray(int size){
		String array[] = new String[size];
		for(int i=0;i<size;i++){
			System.out.print("Please enter String at "+(i+1)+" position: ");
			array[i] = this.inputString();
		}
		return array;
	}

	//Array Printing(one dimentional) Generic type
	public <T> void printArray(T[] inputArray){
		for(T i:inputArray)
			System.out.print(i+" ");

		System.out.println();
	}

	//Array printing(two dimentional) Generic type
	public <T> void printArray(T[][] inputArray,int row,int column){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(inputArray[i][j]+" ");
			}
			System.out.println();
		}
	}

	//reading file
	public String readFile(File file){
		
		try{
			rf = new BufferedReader(new FileReader(file));
			return rf.readLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "";
	}

	//Writing into file int Data
	public void writeFile(File file,int data){
		try{
			String str = this.readFile(file);
			str = str.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(str+data+" ");
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	//writing into file String data
	public void writeFile(File file,String data){
		try{
			String string = this.readFile(file);
			string = string.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(string+" "+data);
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	//Clear the Data inside the file
	public void clearFile(File f){
		try{
			String s = this.readFile(f);
			BufferedWriter wr = new BufferedWriter(new FileWriter(f));
			wr.write(" ");
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	//bubble sort for Integer
	public Integer[] bubbleSortInt(Integer[] array){
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array.length-i;j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}

	//bubble sort for String
	public String[] bubbleSortString(String[] array){
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array.length-i;j++){
				if(array[j].compareTo(array[j+1])>0){
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}

	//insertion sort for integer
	public Integer[] insertionSortInt(Integer[] array){
		for(int i=1;i<array.length;i++){
			for(int j=i;j>0;j--){
				if(array[j-1]>array[j]){
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		return array;
	}

	//insertion sort for String
	public String[] insertionSortString(String[] array){
		for(int i=1;i<array.length;i++){
			for(int j=i;j>0;j--){
				if(array[j-1].compareTo(array[j])>0){
					String temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
		return array;
	}

	//binary search for integer
	public void binarySearchInt(Integer[] array,int num){
		int size = array.length;
		array = this.bubbleSortInt(array);
		int start,end,mid,count=0;
		
		start = 0;
		end  = size-1;

		while(start <= end){
			mid = (start+end)/2;
			if (num==array[mid]){
				System.out.println("Search found at position :"+mid);
				count++;
				break;
			}
			if(num<array[mid])
				end = mid-1;
			else
				start = mid+1;		
		}
		if(count == 0)
			System.out.println("Search not found");	

	}

	//binary search for String
	public void binarySearchString(String[] array, String str){
		int size = array.length;
		array = this.bubbleSortString(array);
		int start,end,mid,count=0;
		start = 0;
		end  = size-1;
		
		while(start <= end){
			mid = (start+end)/2;
			if (str.compareTo(array[mid])==0){
				System.out.println("Search found at position :"+mid);
				count++;
				break;
			}
			if(str.compareTo(array[mid])<0)
				end = mid-1;
			else
				start = mid+1;		
		}
		if(count == 0)
			System.out.println("Search not found");	

	}

	
}


