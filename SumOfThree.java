/*
file name:SumOfThree
CreatedBy:Praveen T
CreatedDate:12/10/16
purpose: Sum of three Integer adds to ZERO
*/
import java.util.*;

public class SumOfThree{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter the no. of Elements");
		int mSize = scn.nextInt();
		int mCount = 0;
		int array[] = new int[mSize];
		//taking array of numbers from user
		for(int i=0;i<mSize;i++)
		{
			System.out.println("Please enter element at position "+(i+1));
			array[i] = scn.nextInt();
		}
		
		//to find triples
		for(int i=0;i<mSize-2;i++)
		{
		for(int j=i+1;j<mSize-1;j++)
			{
			for(int k=j+1;k<mSize;k++)
				{
					if(array[i]+array[j]+array[k] == 0)
					{
						System.out.println("Triples are :"+array[i]+" "+array[j]+" "+array[k]);
						mCount ++;
					}
				}
			}
		}
		if(mCount != 0)
			System.out.println("Total number of Tripels in given list is: "+mCount);
		else
			System.out.println("Triples are Not Present");

	}
}
