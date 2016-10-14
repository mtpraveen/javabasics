/*
file name:CouponCode.java
CreatedBy:Praveen T
CreatedDate:12/10/16
purpose: Coupon Code generator program
*/

//package com.bridgelabz.java;
import java.util.*;

 class CouponCode{
	void randomgen(int num){
		Random r = new Random();
		for(int i=1;i<=n;i++){
			System.out.println(r.nextInt(50));
		}
	}

	public static void main(String[] args){
		int n;
	
		CouponCode c = new CouponCode();
		Scanner scn = new Scanner(System.in);
		System.out.println(" Enter the number of random numbers you want");
		n = scn.nextInt();
		c.randomgen(num);		
	}
}
