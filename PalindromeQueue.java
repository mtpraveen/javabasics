/*
file name:PalindromeQueue	
CreatedBy:Praveen T
CreatedDate:14/10/16
purpose:Palindrome
*/
import java.util.*;


class PalindromeQueue
{
	public static void main(String[] args)
	{
		Stack stack = new Stack();	
		Queue queue = new LinkedList(); 
	  	Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter the String to Check");
		String string = scn.nextLine();
		int size = string.length();
		for(int i=0;i<size;i++)
		{ 			
		stack.push(string.charAt(i));
		queue.add(string.charAt(i));
		}
		System.out.println(stack);
						//checking for palindrome
		if(stack.pop().equals(queue.remove()))
		System.out.println("its is Palindrome");
		else
		System.out.println("it is not Palindrome");

	}
}
