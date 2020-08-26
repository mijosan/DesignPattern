package designpattern.adpater;

public class IteratorAdapter<E> implements Enumeration {
	private Iterator<E> iterator;
	
	public IteratorAdapter(Iterator iterator) {
		this.iterator = iterator;
	}
	
	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}
	
	@Override
	public Object nextElement() {
		return iterator.next();
	}
}
