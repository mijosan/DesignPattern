package designpattern.singleton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private volatile static ChocolateBoiler chocolateBoiler;
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		if(chocolateBoiler == null) {
			synchronized(ChocolateBoiler.class) {
				if(chocolateBoiler == null) {
					chocolateBoiler = new ChocolateBoiler();
				}
			}
		}
		
		return chocolateBoiler;
	}
	
	/**
	 * 보일러에 우유/초콜릿을 혼합한 재료를 집어넣음
	 */
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	
	/**
	 * 재료를 끓임
	 */
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
	
	/**
	 * 끓인 재료를 다음 단계로 넘김
	 */
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
