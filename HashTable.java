/*
file name:HashTable.java
CreatedBy:Praveen T
CreatedDate:21/10/16
Purpose:Hashing Function to search a Number in a slot
*/
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.demo.NodeCreation;

public class HashTable{
	Scanner scn = new Scanner(System.in);
	File file = new File("HashValues.txt");
	NodeCreation mHead,mTemp,mEntry;
	int key,value,tableSize;
	NodeCreation[] table;
	
	//creating table array
	public HashTable(int size){
		tableSize = size;
		table = new NodeCreation[tableSize];
		for (int i = 0; i <tableSize; i++)
			table[i] = null;
	} 
	//adding Element into table
	public void addValue(int value){
		int key = value % tableSize;
		if(table[key] == null){
			table[key] = new NodeCreation();
			table[key].setData(key);
			mHead = table[key];
		}
			mHead = table[key];
			mTemp = mHead;
			mEntry = new NodeCreation();
			mEntry.setData(value);
			while(mTemp.getNext() != null)
				mTemp = mTemp.getNext();
			mTemp.setNext(mEntry);

	}//end of addValue

	//search value from table
	public void search(int value){
		int key = value % tableSize;
		if(table[key] == null){
			System.out.println("Search not Found, number is added");
			this.addValue(value);
			this.updateFile();
		}
		else{
			mHead = table[key];
			mTemp = mHead.getNext();
			mEntry = new NodeCreation();
			mEntry.setData(value);
			int count = 0;
			while(mTemp != null){
				if(mEntry.getData() == mTemp.getData()){
					System.out.println("Search Found, number is Deleted");
					count++;
					this.remove(value);
					this.updateFile();
					break;
				}
				else
					mTemp = mTemp.getNext();
			}
			if(count == 0){
				System.out.println("Search not found, value is added");
				this.addValue(value);
				this.updateFile();
			}
		}
	}//end of search function

	//removing value
	public void remove(int value){
		int key = value % tableSize;
		mHead = table[key];
		mTemp = mHead;
		NodeCreation temp2 = mTemp.getNext();
		while(temp2 != null){
			if(value == temp2.getData()){
				mTemp.setNext(temp2.getNext());
				break;			
			}
			else{
				mTemp = temp2;
				temp2 = temp2.getNext();
			}
		}
			
	}

	//Updating into file
	public void updateFile(){
		try{
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(" ");
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		String str;
		for(int i=0;i<tableSize;i++){
			mEntry = table[i];
			mTemp = table[i];
			if(mTemp == null)
				str = "";
			else{
				mTemp = mTemp.getNext();
				while(mTemp != null){
					str = Integer.toString(mTemp.getData());
					u.writeFile(file,str);
					mTemp = mTemp.getNext();
				}
			}
		}
	System.out.println("File is Updated");
	}//end of updateFile
		
	//show table
	public void showTable(){
		for(int i=0;i<tableSize;i++){

			System.out.print("\ntable "+i+": ");
			mTemp = table[i];
			int total = 0;
			if(mTemp == null)
				System.out.println("List is Empty");
			else{
				mTemp = mTemp.getNext();
				while(mTemp != null){
						total++;
						System.out.print(mTemp.getData()+" ");
						mTemp = mTemp.getNext();
				}
				System.out.println("\nTotal numbers in list: "+total);
			}
		}

	}//end of showTable
}

