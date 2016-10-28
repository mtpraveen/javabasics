/*
file name:Regex.java
CreatedBy:Praveen T
CreatedDate:19/10/16
Purpose:Regular Expression Demonstration
*/
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.demo.NodeCreation;
import java.demo.NodeOperation;

//import Home.java.demo.NodeOperation;
public class OrderList {
	public static void main(String[] args){
		NodeOperation node = new NodeOperation();
		try
		{
		File file = new File("Order.txt");
		BufferedReader rf = new BufferedReader(new FileReader(file));
		
		
		String string= rf.readLine();
		//string = string.trim();
		System.out.println("Contents of file are: "+string);
		
		String strArray[] = string.split(" ");
		for(int i=0;i<strArray.length;i++){
			node.addNode(Integer.parseInt(strArray[i]));
		}
		
		System.out.print("List Elements are: ");
		node.showList();
		Scanner scn = new Scanner(System.in);
		System.out.print("\nPlease Enter the element you want to Search: ");
		int value = scn.nextInt();
		node.search(value);
		}
		catch(Exception e)
		{
    		e.printStackTrace();
		}
	}
}

