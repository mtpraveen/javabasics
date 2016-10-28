/*
file name:StcokReport
CreatedBy:Praveen T
CreatedDate:12/10/16
Purpose:Write a program to read in Stock Names, Number of Share, Share Price. Print a Stock Report with total value of each Stock and the total value of Stock.
*/


public class StockReport {
		int mNumber;
		double mAllTotal = 0;
		
		Utility u = new Utility();
		String name[] = new String[100];
		int share[] = new int[100];
		double value[] = new double[100];
		double total[] = new double[100];
		
		//for entry of stock details
		public void entry(int mNumber){
			this.mNumber = mNumber;
			for(int i=0;i<mNumber;i++){
				System.out.println("\nPlease Enter Details for Stock: "+(i+1));
				System.out.println("Name:");
				name[i] = u.inputString();
				System.out.println("No. of shares:");
				share[i] = u.inputInteger();
				System.out.println("Value for Each share:");
				value[i] = u.inputDouble();		
			}
			
		}

		//calculating total of each stack
		public void calculate(){
			for(int i=0;i<mNumber;i++){
				total[i] = share[i]*value[i];
				System.out.println("Total value for Stock "+(i+1)+" is: "+total[i]+" Rs.");
			}
		}

		//Calculating total share
		public void totalval(){
			for(int i=0;i<mNumber;i++){
				mAllTotal = mAllTotal+total[i];
			}
			System.out.println("\nTotal value of all "+mNumber+" Stock is: "+mAllTotal+" Rs.");
		}


public static void main(String[] args){
	Utility u = new Utility();
		StockReport si = new StockReport();
		int stockNumber;
		System.out.println("Please Enter No. of Stocks: ");
		stockNumber = u.inputInteger();
		
		si.entry(stockNumber);
		si.calculate();
		si.totalval();
}
}
