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
	 * ���Ϸ��� ����/���ݸ��� ȥ���� ��Ḧ �������
	 */
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	
	/**
	 * ��Ḧ ����
	 */
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
	
	/**
	 * ���� ��Ḧ ���� �ܰ�� �ѱ�
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
