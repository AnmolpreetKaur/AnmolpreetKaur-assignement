import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.List;
public class ArrayBasedDeque<AnyType> implements deque<AnyType> {
	
	private static int MAX_SIZE = 5;  // initial array size
	//DO NOT CHANGE this, it is set to 5 to make sure your code
	//will pass all the tests and works with no issue.

	
	// add all data fields which are required

	/**
	 *  ArrayBasedDeque() constructs an empty deque.
	 */
	public ArrayBasedDeque(){ 
		private List<Integer> deque = new ArrayList<Integer>();
		public void addFirst(int x){
		//add element at the beginning of the queue
		System.out.println("adding at front: "+x);
		deque.add(0,x);
		System.out.println(deque);
	}
	
	/**
	 * Returns the size of the deque
	 * @return the number of elements in this deque
	 */
	public int Size() {
		//return length of deque
		int lenDeque = deque.size();
		return lenDeque;
	}
	
	/**
	 * Removes all elements from this deque
	 */
	public void Clear() {
		deque.clear();
		System.out.println(deque);
	}
	  
	/**
	 * Tests if the deque contains no element
	 * @return true if the deque contains no element
	 */
	public boolean isEmpty() {
	    boolean res = deque.isEmpty();
		return res;
	}
	
	/**
	  * Adds an item to this front of the deque
	  * @param x any object
	  */
	public void addFirst(int x) {
		//add element at the beginning of the queue
		System.out.println("adding at front: "+x);
		deque.add(0,x);
		System.out.println(deque);
	}
	
	/**
	  * Adds an item to this rear of the deque
	  * @param x any object
	  */
	public void addLast(int x) {
		//add element at the end of the queue
		System.out.println("adding at rear: "+x);
		deque.add(x);
		System.out.println(deque);
	}
	
	/**
	 * Remove and return the item at the front of the deque.
	 * @return the item that was removed from the deque
	 * @throws NoSuchElementException if the deque is empty
	 */
	public void removeFirst() throws NoSuchElementException{
		if(deque.isEmpty()){
			System.out.println("Deque underflow!! unable to remove.");
			return;
		}
		//remove an item from the beginning of the queue
		int rem = deque.remove(0);
		System.out.println("removed from front: "+rem);
		System.out.println(deque);
	}
	
	/**
	 * Remove and return the item at the rear of the deque.
	 * @return the item that was removed from the deque
	 * @throws NoSuchElementException if the deque is empty
	 */
	public void removeLast() throws NoSuchElementException{
		if(deque.isEmpty()){
			System.out.println("Deque underflow!! unable to remove.");
			return;
		}
		//remove an item from the beginning of the queue
		int rem = deque.remove(deque.size()-1);
		System.out.println("removed from front: "+rem);
		System.out.println(deque);
	}
	
	/**
	 * Returns the item at position index in deque
	 * front of the deque will be considered as index 0, 
	 * index 1 is the next item, and so on
	 * @param index the index to search in
	 * @return return the item in index
	 * @throws IndexOutOfBoundsException if index is out ot bound
	 */
	public int get(int index) throws IndexOutOfBoundsException {
		//get the second element in a list
		int value = deque.get(index);
		return value;
	}
	
	/**
	 * Return the item at the rear of the deque.
	 * @return the item the rear of the deque
	 * @throws NoSuchElementException if the deque is empty
	 */
	public int getLast() throws NoSuchElementException{
		//gets the element from the rear without removing it
		int item = deque.get(deque.size()-1);
		System.out.println("Element at rear: "+item);
		return item;
	}
	
	/**
	 * Return the item at the front of the deque.
	 * @return the item the front of the deque
	 * @throws NoSuchElementException if the deque is empty
	 */
	public int getFirst() throws NoSuchElementException{
		//gets the element from the front without removing it
		int item = deque.get(0);
		System.out.println("Element at first: "+item);
		return item;
	}
	
	// public String toString() {
	// 	//complete
	// }
}
