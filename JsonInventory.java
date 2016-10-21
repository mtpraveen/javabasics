package com.bridgelabz.json;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonInventory {

	public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();//to read json files
		double totalPrice;
		try{
			Object obj = parser.parse(new FileReader("/home/bridgeit/java/demo/JsonFile.json"));
			JSONObject object = (JSONObject) obj;//json object created
			
			
			 JSONArray data = (JSONArray) object.get("data");
			 String[] str = {"rice","pulses","weats"};
			 
			 for(int i=0;i<data.size();i++){
				 JSONObject itemObj = (JSONObject) data.get(i);
				 JSONArray item = (JSONArray) itemObj.get(str[i]);
				System.out.println(str[i]+" Data:");
				totalPrice = 0;
				 for (int y = 0; y < item.size(); y++) {
				        JSONObject itemData = (JSONObject) item.get(y);
				        System.out.println("name: "+itemData.get("name"));
				      
				        Object quantObject = itemData.get("weight");
				        int quantity = Integer.parseInt((String)quantObject);
				        System.out.println("Weight: "+quantity+" Kg");
				        
				        Object priceObject = itemData.get("price");
				        double price = Double.parseDouble((String) priceObject);
				        System.out.println("price: "+price+" Rs/Kg");
				        
				        double itemPrice = (quantity*price);
				        totalPrice = totalPrice+itemPrice;
				        System.out.println("price for "+itemData.get("name")+" is: "+itemPrice+" Rs");
				        System.out.println();
				    }
				 System.out.println("Total Price for "+str[i]+" is: "+totalPrice+" Rs.");
				 System.out.println("*********************");
			 }

		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}	
