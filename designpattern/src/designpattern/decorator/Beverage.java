package designpattern.decorator;

public abstract class Beverage {
	String description;
	
	private String size = "TALL";
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
