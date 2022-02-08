package com.addressinformation;

public class Area extends State {
	 String areaName;
	 long zipCode;
	public String getAreaName() {
		return areaName;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return  "areaName=" + areaName + ", zipCode=" + zipCode + ", state=" + state + ", countryName=" + countryName;
	}
	public Area(String countryName, String state,String areaName, long zipCode) {
		super.countryName = countryName;
		super.state = state;
		this.areaName = areaName;
		this.zipCode = zipCode;
	}
	
	
	
	
	
	

}
