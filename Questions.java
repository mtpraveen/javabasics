/*
file name:Questions.java
CreatedBy:Praveen T
CreatedDate:18/10/16
Purpose:Questions to find the number
*/
import java.util.*;
import java.lang.*;
import java.util.*;
public class Questions {

	static int search(int lo, int hi) 
	{
        if ((hi - lo) == 1)
		 return lo;
        int mid = lo + (hi - lo) / 2;
	System.out.println("Is it less than ?  "+ mid);
	Scanner scn = new Scanner(System.in);
	boolean check=scn.nextBoolean();
        
        if (check)
		 return search(lo, mid);
        else    
         return search(mid, hi);
    }
    public static void main(String[] args) 
{
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter No. of Steps you want");
		int k = scn.nextInt();
		int n = (int)Math.pow(2, k);
		int x=n-1;
       System.out.println("Think of an integer between 0 and"+ x);
        int num = search(0, n);
       System.out.println("Your number is:" +num);
    
}
}
