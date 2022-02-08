package com.textfileprocessor;

import java.io.IOException;

import com.exception.InvalidDateException;

public interface FileProcessor {
	
	public void fileRead() throws IOException;
	public void allData();
	public void printDataByDate(String date) throws InvalidDateException;
	public void getByOptions() throws InvalidDateException;

}
