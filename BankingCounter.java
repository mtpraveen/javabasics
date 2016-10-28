/*
*@file name: BankingCounter.java
*@Created By: Praveen T
*@Date: 18-10-2016
*@purpose: Program for creating a Banking Cash Counter by using queue for withdraw and deposite the Money.
*/
import java.demo.BankingFunction;
import java.util.Scanner;
public class BankingCounter{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		 BankingFunction b = new  BankingFunction();
		int choice;
		boolean mCheck = true;
		while(mCheck){
			System.out.println("\nPlease choose your option:\n1.Deposit\n2.Withdraw\n3.Balance Info\n4.Exit");
			choice = scn.nextInt();

			switch(choice){
				case 1:{
					b.deposit(choice);
					break;
				}
				case 2:{
					b.withdraw(choice);
					break;
				}
				case 3:{
					b.getBalance();
					break;
				}
				case 4:{
					System.out.println("Exit");
					mCheck = false;
					break;
				}
				default:{
					System.out.println("Entered Wrong Choice");
					break;
				}
			}//end of switch
		}//end of while
		
	}
}
