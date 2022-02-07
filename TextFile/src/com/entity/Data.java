package com.entity;

public class Data {
	
   private String name;
   private String date;
   private String time;
   
public Data(String name, String date, String time) {
	this.name = name;
	this.date = date;
	this.time = time;
}

public String getName() {
	return name;
}

public String getDate() {
	return date;
}

public String getTime() {
	return time;
}

public void setName(String name) {
	this.name = name;
}

public void setDate(String date) {
	this.date = date;
}

public void setTime(String time) {
	this.time = time;
}

@Override
public String toString() {
	return "Data [name=" + name + ", date=" + date + ", time=" + time + "]";
}


   
   

}
