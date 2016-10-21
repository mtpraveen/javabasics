package com.bridgelabz.programs;
import com.bridgelabz.util.Utility;
import com.bridgelabz.programs.UnOrderedNode;
import java.io.File;
import java.demo.UnOrderNodeCreation;
import java.demo.UnOrderNodeOperation;

public class UnOrderedList{
	public static void main(String[] args){
		Scanner scn =new Scanner();
		UnOrderNodeOperation node = new UnOrderNodeOperation();
		File file = new File("UnOrder.txt");
		BufferedReader rf = new BufferedReader(new FileReader(file));
		String string = rf.readLine(file);
		System.out.println("File Contents are: "+string);
		string = string.trim();
		String[] str = string.split(" ");
		
		for(int i=0;i<str.length;i++){
			node.addNode(str[i]);
		}
		
		System.out.print("Please Enter String You want to search: ");
		String searchStr = scn.nextLine();
		node.search(searchStr);
	}
}
