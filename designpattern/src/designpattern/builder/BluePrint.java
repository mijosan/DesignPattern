package designpattern.builder;

import designpattern.builder2.Computer;

public abstract class BluePrint {

	abstract public void setCpu();
	abstract public void setRam();
	abstract public void setStorage();
	protected abstract Computer getComputer();
	
}
