
public interface deque<AnyType> {
	public void addFirst(AnyType item);
	public void addLast(AnyType item);
	public void removeFirst();
	public void removeLast();
	public int getFirst();
	public int getLast();
	public int get(int index);
	public boolean isEmpty();
	public int size();
	public void clear();
	
}
