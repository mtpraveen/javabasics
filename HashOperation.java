/*
file name:HashTable.java
CreatedBy:Praveen T
CreatedDate:21/10/16
Purpose:Hashing Function to search a Number in a slot
*/
import java.io.File;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.demo.HashTable;

public class HashOperation{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		boolean mCheck = true;
		
		System.out.print("Please Enter Table Size:");
		int size = scn.nextInt();
		HashTable ht = new HashTable(size);
		try
		{
		File file = new File("HashValues.txt");
		BufferedReader rf = new BufferedReader(new FileReader(file));
		String string= rf.readLine();
		String str[] = string.split(" ");
		for(int i=0;i<str.length;i++){
			ht.addValue(Integer.parseInt(str[i]));
		}

		while(mCheck){
			System.out.println("Please Choose Your Option:\n1.search Value\n2.Show HashTable\n3.Exit");
			int choice = scn.nextInt();
			switch(choice){
				case 1:{
					System.out.print("Please Enter a value: ");
					int value = scn.nextInt();
					ht.search(value);
					break;
				}
				case 2:{
					System.out.println("Hash table is");
					ht.showTable();
					System.out.println();
					break;
				}
				case 3:{
					mCheck = false;
					break;
				}
				default :{
					System.out.println("Wrong Choice");
					break;
				}

			}//end of switch
		}//end of while
	}
		catch(Exception e)
		{
    		e.printStackTrace();
		}
	}
}

