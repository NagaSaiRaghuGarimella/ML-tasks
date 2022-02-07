package com.main;

import java.util.Scanner;


import com.zipservicev1.ZipServicev1;
import com.zipservicev1.ZipServicev2;

public class MainClass {

	public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
	    ZipServicev1 zipService = new ZipServicev2();
	    System.out.println("Enter option 1 to print all the info:");
	    System.out.println("Enter option 2 to get info by zip code: ");
	    int option = scanner.nextInt();
	    zipService.printByOptions(option);
	    
	    scanner.close();
	      
}
}


