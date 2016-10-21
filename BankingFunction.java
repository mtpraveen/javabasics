/*
@file name: BankingFunction.java
@Created By: Praveen T
@Date: 18-10-2016
@purpose: Program for performing Banking operations and checking Queue.
*/

import java.util.Scanner;
public class BankingFunction{
	Scanner scn = new Scanner(System.in);
	double mBalance = 10000;
	protected Queue front,rear;
	
	//for adding node in queue	
	public void add(int data){
		Queue node = new Queue(data,null);
		if(rear == null){
			front = node;
			rear = node;
		}
		else{
			rear.setNode(node);
			rear = node;
		}
		
	}
	//for removing node from queue
	public void remove(){
			front = rear;
			if(front == null)
				System.out.println("Queue is Empty");
	}
	//depositing money
	public void deposit(int choice){
		this.add(choice);
		System.out.print("Please Enter the mAmount you want to deposit: ");
		double mAmount = scn.nextDouble();
		mBalance = mBalance + mAmount;
		System.out.println("Deposited Successfully");
		this.remove();
	}
	//withdrawing money
	public void withdraw(int choice){
		this.add(choice);
		System.out.print("Please Enter the Amount want to withdraw: ");
		double mAmount = scn.nextDouble();
		if(mAmount <= mBalance){
			mBalance = mBalance - mAmount;
		}
		else
			System.out.println("Sorry Insufficient Balance");
		this.remove();
	}

	//mBalance
	public void getBalance(){
		System.out.println("Balance is: "+mBalance+" Rs");
	}
}
