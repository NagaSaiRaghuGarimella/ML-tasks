package com.mainclass;


import java.io.IOException;

import com.exception.InvalidDateException;
import com.text.StoreFile;

public class MainClass {

	public static void main(String[] args) throws IOException, InvalidDateException {
		
	  StoreFile storeFile = new StoreFile();
	  storeFile.fileRead();
	  storeFile.getByOptions();     

	}

}
