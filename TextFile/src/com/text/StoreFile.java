package com.text;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.entity.Data;
import com.exception.InvalidDateException;
import com.textfileprocessor.FileProcessor;




public  class StoreFile implements FileProcessor{
	
	Map<String,List <Data>> map = new HashMap<>();
	Scanner scanner = new Scanner(System.in);
	
	public void fileRead()  throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new FileReader("file.txt")); 
		String line;
		while((line = reader.readLine()) != null){
			String[] st = line.split("\\n");
			for(String str:st) {
				
				str = str.replaceAll("\\s{2,}"," ").trim();
				
			    String[] stdate = str.split("\\s");
			    
			    if(map.containsKey(stdate[1])) {
			    	List<Data> data = map.get(stdate[1]);
			    	data.add(new Data(stdate[0],stdate[1],stdate[2]+" "+stdate[3]));
			    	map.put(stdate[1],data);
			    }
			    
			    else {
			    	List<Data> data1 = new ArrayList<>();
			    	data1.add(new Data(stdate[0],stdate[1],stdate[2]+" "+stdate[3]));
			    	map.put(stdate[1],data1);
			    	
			    }
			}
		}
		reader.close();
				
	}
	
	   public void printDataByDate(String date) throws InvalidDateException {
		   
		   if(map.containsKey(date)) {
			   System.out.println(map.get(date));
		   }
		   else
		   {
			   throw new InvalidDateException();  
		   }
	   }
	   
	   public void allData() {
			for(Map.Entry<String, List<Data>> mp:map.entrySet()) {
				
				System.out.println(mp.getKey());
				System.out.println("Members logged in this date :");
				System.out.println(mp.getValue().size());
				System.out.println(mp.getValue());
				
			}
		}
	   
	   
	   public void getByOptions() throws InvalidDateException {
		   
		   char val;
		do {
			   System.out.println("Enter 1 to get the details by date:");
			   System.out.println("Enter 2 to get all the data:");
			   
			    int options = scanner.nextInt();
			   
			   String date = " ";
			   
			   switch(options) {
			   case 1:System.out.println("Enter the date in format of mm/dd :");
			          date = scanner.next();
			         printDataByDate(date);
			          break;
			   case 2:System.out.println("Details of the persons");
			         allData();
			          break;
			          
			    default:
			    	System.err.println("Please enter valid option");
			   }
			   
			   System.out.println("Do you want to continue ?? enter y/n");
			   val = scanner.next().charAt(0);
			   
			   if(val == 'n') {
				   
				   System.out.println(" Program terminated abruptly. Thank you visit Again ");
				   break;
			   }
			   
	
		   }while(val =='y');
	   }

	

	
	   
		 	
		


}
