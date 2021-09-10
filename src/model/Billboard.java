package model;

import java.io.Serializable;

public class Billboard implements Serializable{


	private static final long serialVersionUID = 1L;
	double width;
	double height;
	boolean usage;
	String brand;
	
	
	public Billboard() {
		
	}

	public Billboard(double width, double height, boolean usage, String brand) {
		super();
		this.width = width;
		this.height = height;
		this.usage = usage;
		this.brand = brand;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isUsage() {
		return usage;
	}

	public void setUsage(boolean usage) {
		this.usage = usage;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double calculateArea(double width,double height) {
		double area;
		area = width * height;
		return area;
	}
	
}
