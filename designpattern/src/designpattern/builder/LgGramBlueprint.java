package designpattern.builder;

public class LgGramBlueprint extends BluePrint {
	
	private Computer computer;
	
	public LgGramBlueprint() {
		computer = new Computer("default", "default", "default");
	}
	
	@Override
	public void setCpu() {
		computer.setCpu("17");
	}

	@Override
	public void setRam() {
		computer.setRam("8g");
	}

	@Override
	public void setStorage() {
		computer.setStorage("256g ssd");
	}

	@Override
	protected Computer getComputer() {
		return computer;
	}

}
