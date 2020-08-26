package designpattern.adpater;

public class EnumerationIteratorAdapter<E> implements Iterator<E> {
	private Enumeration<E> enumeration;
	
	public EnumerationIteratorAdapter(Enumeration enumeration) {
		this.enumeration = enumeration;
	}
	
	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}
	
	@Override
	public E next() {
		return enumeration.nextElement();
	}
}
