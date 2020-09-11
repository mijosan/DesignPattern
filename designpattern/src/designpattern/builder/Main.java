package designpattern.builder;

import designpattern.builder2.Computer;

public class Main {

	public static void main(String[] args) {
		ComputerFactory factory = new ComputerFactory();
		factory.setBlueprint(new LgGramBlueprint());
	
		factory.make();
		
		Computer computer = factory.getComputer();

		System.out.println(computer.toString());
	}

}
