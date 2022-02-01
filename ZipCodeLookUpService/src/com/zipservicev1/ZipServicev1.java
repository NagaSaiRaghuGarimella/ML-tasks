package com.zipservicev1;

import com.addressinformation.Area;

public interface ZipServicev1 {
	
	Area getByZipCode(int zipCode);
	void printByOptions(int options);

}
