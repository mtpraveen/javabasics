/*
file name:CouponCode
CreatedBy:Praveen T
CreatedDate:12/10/16
purpose: Coupon Code generator program
*/


import java.util.*;

 class CouponCode{
	void randomNo(int num){
		Random r = new Random();
		for(int i=1;i<=num;i++){
			System.out.println(r.nextInt(100));
		}
	}

	public static void main(String[] args){
		int num;
	
		CouponCode c = new CouponCode();
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter the number of random numbers you want");
		num = scn.nextInt();
		c.randomNo(num);		
	}
}
