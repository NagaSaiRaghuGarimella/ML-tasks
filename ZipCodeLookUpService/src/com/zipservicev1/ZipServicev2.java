package com.zipservicev1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.addressinformation.Area;
import com.exception.InvalidZipCodeException;

public class ZipServicev2 implements ZipServicev1{
	Scanner scanner = new Scanner(System.in);
	
	static Map<Integer,Area> map = new HashMap<>();
	static {
		 map.put( 507306,new Area("India","Telangana", "Khammam",507306));
         map.put( 507303,new Area("India","Telangana", "Kothagudem",507303));
         map.put( 500018,new Area("India","Telangana", "Narsapur",500018));
         map.put( 503042,new Area("India","Telangana", "medhak",503042));
         map.put( 507307,new Area("India","Telangana", "Sathupalli",507307));      
	}
	@Override
	public  Area getByZipCode(int zipCode) {
	   
         return map.get(zipCode);
	}
	
	
	public static  void printAllData() {
		
		     map.entrySet().forEach(entry -> {
	    	 System.out.println(entry.getValue());
	     });
		
	}


	@Override
	public void printByOptions(int option) {
		
switch(option) {
	    
	    case 1:printAllData();
	    break;
	    
	    case 2:
	    	System.out.println("You have only two atempts to enter the correct zip code");
	    	System.out.println("Enter the Zip code:");
	    	int zipCode = scanner.nextInt();
	    	 for(int i=2;i>=1;i--)
	 		{
	 		try {
	 		if(zipCode>500000 && zipCode<600000) {
	 			
	 			
	 			System.out.println(getByZipCode(zipCode));
	 			break;
	 			
	 		}
	 		else {
	 			System.err.println("Not valid zipCode please enter correct Code");
	 			throw new InvalidZipCodeException();
	 			}
	 		}
	 		catch(InvalidZipCodeException zip)
	 		{
	 			
	 				if(i==1) {
	 					System.err.println("Your attempts were failed please wait for some time");
	 					break;
	 				}
	 				System.out.println("you have only "+(i-1)+ "attempts");
	 				System.out.println("Re-enter the zip code");
	 				zipCode = scanner.nextInt();
	 					
	 		}
	 		
	 	    
	 	
	 	}
	 	    scanner.close();
}
	


}
}
