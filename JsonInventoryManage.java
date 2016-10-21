package com.bridgelabz.json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonInventoryManage {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(new FileReader("/home/bridgeit/java/demo/JsonFile.json"));
		 
		
		JSONObject object = (JSONObject) obj;//json object created
		
		
		 JSONArray data = (JSONArray) object.get("data");
		 
		 String[] str = {"rice","pulses","wheats"};
		 for(int i=0;i<data.size();i++){
			 JSONObject itemObj = (JSONObject) data.get(i);
			 
			 JSONArray item = (JSONArray) itemObj.get(str[i]);
			 System.out.println(str[i]+" Data:");
			 for (int y = 0; y < item.size(); y++) {
			        JSONObject itemData = (JSONObject) item.get(y);
			        System.out.println("name: "+itemData.get("name"));
			        System.out.println("Weight: "+itemData.get("weight")+" Kg");
			        System.out.println("price: "+itemData.get("price")+" /Kg");
			        System.out.println();
			 }
			    
			 System.out.println("*********************");
		 }
		}
			 catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 
	
		
	}
}


	



