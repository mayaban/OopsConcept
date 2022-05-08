package com.bangbang;

public class Constructor {
	
	private String make;
	private String model;
	private int year;
	private String vin;
	private String color;
	
	//commnets added in constructor.java
	
	
	
	
	public Constructor() {
		this("unknown","unknown" ,0,"unkown","unknwon");
		System.out.println("1st constructor called");
		
		System.out.println("!!!!!!!!!!!!!!!");
	}
	public Constructor(String make, String model, int year) {
		this(make, model, year, "unknown","unknown");
		System.out.println("2nd constructor called");
		
		System.out.println("+++++++++++++++");
		
	}
	
	
	public Constructor(String make, String model, int year, String vin, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.vin = vin;
		this.color = color;
		
		System.out.println("main constructor called");
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public String getVin() {
		return vin;
	}
	public String getColor() {
		return color;
	}
	
	
	

}
