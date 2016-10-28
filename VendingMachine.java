/*
file name:VendingMachine.java
CreatedBy:Praveen T
CreatedDate:12/10/16
purpose: minimum Note needed to give the change and second list of Rs Notes that would given in the Change
*/
import java.util.*;
public class VendingMachine{
	static int mTotal = 0;
	
	//recursive function
	static void function(int value){
		
		if(value >= 1000){
			value = value-1000;
			System.out.print("1000 ");
			mTotal++;
			function(value);
		}
		else if(value >= 500){
			value = value-500;
			System.out.print("500 ");
			mTotal++;
			function(value);
		}
		else if(value >= 100){
			value = value-100;
			System.out.print("100 ");
			mTotal++;
			function(value);
		}
		else if (value >=50){
			value = value-50;
			System.out.print("50 ");
			mTotal++;
			function(value);
		}
		else if(value >= 10){
			value = value-10;
			System.out.print("10 ");
			mTotal++;
			function(value);
		}
		else if(value >= 5){
			value = value-5;
			System.out.print("5 ");
			mTotal++;
			function(value);
		}
		else if(value >= 2){
			value = value-2;
			System.out.print("2 ");
			mTotal++;
			function(value);
		}
		else if(value >= 1){
			value = value-1;
			System.out.print("1 ");
			mTotal++;
			function(value);
		}
	}
	
	public static void main(String[] args){
	
		VendingMachine v = new VendingMachine();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value of Change to be Returned");
		int value = scn.nextInt();
		System.out.println("\nchange Values:");		
		if(value != 0)
			function(value);
		else
			System.out.println("No Change");
		System.out.println("\nTotal No. of notes: "+mTotal);
		
	}
}
