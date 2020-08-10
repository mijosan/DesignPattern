package designpattern.command;

public class Light {
	String type;
	
	public Light(String type) {
		this.type = type;
	}
	public void on() {
		System.out.println(type + " on");
	}
	
	public void off() {
		System.out.println(type + " off");
	}
}
