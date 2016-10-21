/*
file name:Array2D.java
CreatedBy:Praveen T
CreatedDate:14/10/16
purpose: A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
*/
import java.util.*;
public class Array2D
{
	public static void main(String[] args){
		int mRow,mColumn,mChoice;
		

		System.out.println("Please choose which type of array you want to create :");
		System.out.println(" 1.Integer \n 2.Double \n 3.Boolean");
		Scanner scn = new Scanner(System.in);
		mChoice =scn.nextInt();
		switch(mChoice){
			case 1:{
				System.out.println("Please Enter no. of Rows :");
					mRow = scn.nextInt();
				System.out.println("Please Enter no. Columns :");
					mColumn =scn.nextInt();
					Integer array[][] = new Integer[mRow][mColumn];

					for(int i=0;i<mRow;i++){
						for(int j=0;j<mColumn;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = scn.nextInt();
					}
				}
		

				System.out.println("Array is");
				for(int i=0;i<mRow;i++){
					for(int j=0;j<mColumn;j++){
						System.out.print(array[i][j]+" ");
			}
			System.out.println();
				}
				
				break;
			}

			case 2:{
				System.out.println("Please Enter no. of Rows :");
					mRow = scn.nextInt();
				System.out.println("Please Enter no. Columns :");
					mColumn = scn.nextInt();
					Double array[][] = new Double[mRow][mColumn];

					
					for(int i=0;i<mRow;i++){
						for(int j=0;j<mColumn;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = scn.nextDouble();
					}
				}
		
				System.out.println("Array is");
				for(int i=0;i<mRow;i++){
					for(int j=0;j<mColumn;j++){
						System.out.print(array[i][j]+" ");
			}
			System.out.println();
				}
				break;
			}

			case 3:{
				System.out.println("Please Enter no. of Rows :");
					mRow =scn.nextInt();
				System.out.println("Please Enter no. Columns :");
					mColumn = scn.nextInt();
					Boolean array[][] = new Boolean[mRow][mColumn];

					
					for(int i=0;i<mRow;i++){
						for(int j=0;j<mColumn;j++){
						System.out.print("Please enter Element at position ("+i+","+j+"): ");
						array[i][j] = scn.nextBoolean();
					}
				}
		
				System.out.println("Array is");
				for(int i=0;i<mRow;i++){
					for(int j=0;j<mColumn;j++){
						System.out.print(array[i][j]+" ");
			}
			System.out.println();
				}
				break;
			}
	
		}


	}	
}

