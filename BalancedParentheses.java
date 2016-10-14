/*
file name:BalancedParentheses.java
CreatedBy:Praveen T
CreatedDate:14/10/16
purpose:Balancing Arithmetic Expression 
*/
//package com.bridgelabz.java;
import java.util.*;

class BalancedParentheses{
	public static void main(String[] args){
	
		Scanner scn = new Scanner(System.in);
		System.out.println(" Enter Mathematical Expression for Checking: ");
		String  string = scn.nextLine();
	
		Stack stack = new Stack();
		//Push and Pop operation
		for(int i=0;i<string.length();i++){
			if(string.charAt(i) == '{'){
				stack.push('{');
			}
			if(string.charAt(i) == '('){
				stack.push('(');
			}
			if(string.charAt(i) == '['){
				stack.push('[');
			}
			if(string.charAt(i) == '}'){
				stack.pop();
			}
			if(string.charAt(i) == ')'){
				stack.pop();
			}
			if(string.charAt(i) == ']'){
				stack.pop();
			}
}
		if(stack.empty())
			System.out.println("Expression is Balanced");
		else
			System.out.println("Expression is Not Balanced");
	}
}
