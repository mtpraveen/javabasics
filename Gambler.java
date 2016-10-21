/*
file name:StcokReport
CreatedBy:Praveen T
CreatedDate:12/10/16
purpose: Gambler program
*/
import java.util.*;
import java.io.*; 
public class Gambler{
	public static void main(String[] args){
		int mStake,mGoal = 100,mTrials,mWin=0,mLose=0;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter mStake");
		mStake = scn.nextInt();
		System.out.println("Please Enter number of mTrials");
		mTrials = scn.nextInt();
		int points = mStake;
		int m = mTrials;
		
		while(points>0 && points<mGoal && mTrials>0){
				double rand = Math.random(); //to get randome value between 0 to 1;
				if(rand<0.5){
					points++;
					mWin++;
				}
				else{
					points--;
					mLose++;
				}
				mTrials--;
			}
		
		//finding the percentage of Winning and losing
		System.out.println("percentage of winning bet :"+100*mWin/m+"%");
		System.out.println("percentage of Losing bet :"+100*mLose/m+"%");
		//printing result
		if(points == mGoal){
			System.out.println("player Won, mStake = "+points);
		}
		else{
			System.out.println("Player Lose, mStake = "+points);
		}
	}
}
