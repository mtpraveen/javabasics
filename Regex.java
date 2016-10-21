/*
file name:Regex.java
CreatedBy:Praveen T
CreatedDate:18/10/16
Purpose:Regular Expression Demonstration
*/
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class Regex{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		try
		{
		File file = new File("message.txt");
		BufferedReader rf = new BufferedReader(new FileReader(file));
		String message= rf.readLine();
		String mFirstName=null,mPhoneNumber;
		System.out.print("Please Enter Your Full Name: ");
		String mFullName = scn.nextLine();
		
		//Taking name and checking for the conditions
		boolean checkName = Pattern.matches("[A-Z][a-zA-Z]*[\\s][A-Z][a-zA-Z]*",mFullName);

		if(checkName){
			String name[] = mFullName.split(" ");
			mFirstName = name[0];
		}
		else{
			System.out.println("Your name or Format is Wrong\nPlease Enter in 'Abc Xyz' Format");
			System.exit(0);
		}
		

		//Taking Phone number and checking for the conditions
		System.out.print("Please Enter Your 10-Digits Phone Number: ");
		mPhoneNumber = scn.nextLine();

		boolean checkNumber = Pattern.matches("[9]{1}\\d{9}",mPhoneNumber);

		if(!checkNumber){
			System.out.println("Number is incorrect");
			System.exit(0);
		}

		//calculating current date
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = dateFormat.format(new Date());

		message = message.replace("<<name>>",mFirstName);
		message = message.replace("<<full name>>",mFullName);
		message = message.replace("xxxxxxxxxx",mPhoneNumber);
		message = message.replace("XX/XX/XXXX",date);
		System.out.println("\n\n"+message);
}
		catch(Exception e)
		{
    		e.printStackTrace();
		}

	}
}

