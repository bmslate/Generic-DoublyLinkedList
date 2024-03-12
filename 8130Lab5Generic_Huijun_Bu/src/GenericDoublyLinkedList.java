/**
 * Processing data using Doubly Linked List CST8130 Data Structures,
 * Computer Engineering Technology-Computer Science: Level 3
 * 
 * Professor: James Mwangi PhD
 * 
 * Lab5
 * Student Name:_Huijun__Bu______
 * Student ID:___041121881_______
 * Program:Computer Engineering Technology-Computing Science
 * Course:8130 Data Structure
 * Lab Section:301
 * 
 */

class Node<T> {
	public T mData; // data item
	public Node<T> next; // next node in list
	public Node<T> previous; // previous node in list
	// -------------------------------------------------------------

	public Node(T d) // constructor
	{
		mData = d;
	}

	// -------------------------------------------------------------
	// display this node data
	public void displayNode() {
		System.out.print(mData + " ");
	}
	// -------------------------------------------------------------
}
public class GenericDoublyLinkedList<T> {
	private Node<T> first;// Reference to the first node in the list
	private Node<T> last;// Reference to the last node in the list

	// -------------------------------------------------------------
	public GenericDoublyLinkedList() {// Constructor to create an empty list
		first = null;
		last = null;
	}

	// -------------------------------------------------------------
	public boolean isEmpty() {// Check if the list is empty
		return first == null;
	}

	/**
	 * Insert the node to the last place of the LinkedList
	 * @param num
	 */
	public void insertFirst(T num) {// Insert a new node at the beginning of the list
		Node<T> newNode = new Node<T>(num);
		if(isEmpty()) {// If list is empty, newNode becomes both first and last
            first = newNode;
			last = newNode;
			first.previous = null;
			last.next = null;
		}else {// Link the new node as the new first
			first.previous = newNode;
			newNode.next = first;
			first = newNode;
		}
		first.previous = null;// The first node's previous is always null
	}

	/**
	 * Insert the node to the last place of LinkedList.
	 * @param num-Data field of the node
	 */
	public void insertLast(T num) {// Insert a new node at the end of the list
		Node<T> newNode = new Node<T>(num);
		if(isEmpty()) {// If list is empty, newNode becomes both first and last
			first =  newNode;
			last = newNode;
			first.previous = null;
			last.next = null;
		}else {// Link the new node as the new last
			last.next = newNode;
			newNode.previous = last;
			last = newNode;
		}
		last.next = null;// The last node's next is always null
	}

	/**
	 * insert newNumber just after numToFind
	 * @param numToFind- target data field
	 * @param newNumber- new data field
	 * @return -true
	 */
	public boolean insertAfter(T numToFind, T newNumber) { // (assumes non-empty list)
		// write your code here
		Node<T> current = first;
		
		while(current!= null) {
			if(current.mData.equals(numToFind)) {//use 'equals' to compare the value;
				Node<T> addNode =  new Node<T>(newNumber);
				addNode.next = current.next;
				addNode.previous = current;
				if(current.next != null) {// If not inserting at the end
					current.next.previous = addNode;
				}else {// If inserting at the end, update last
					last = addNode;
				}
				current.next = addNode;
				return true;				
			}
			current = current.next;
		}
		return false;// numToFind not found
	}

	/**
	 *  delete first node
	 * @return deleted node
	 */
	public Node<T> deleteFirstNode() {// Delete the first node and return it

		// write your code here
		if(isEmpty()) {
			return null;
		}
		Node<T> temp = first;
		if(first.next != null) {
			first.next.previous = null;//set second node's previous link to point to null
		}
		first = first.next;//set second node to first node;
		temp.next = null;//set originall first node's next link to point to null;
		return temp;
	}

	/**
	 * delete last node
	 * @return deleted node
	 */
	public Node<T> deleteLastNode() {// Delete the last node and return it

		// write your code here
		if (isEmpty()) {
            return null;
        }
		Node<T> temp = last;
		if(last == null) {
			return  null;
		}else {
			last = last.previous;//set the second last node to last node
			last.next = null;//set the new last node's next points point to null;
		}
		temp.previous = null;//cut the link between original last node and last previous node.
		
		return temp;// Return the deleted node

	}


	/**
	 * finds, deletes and returns the node that contains the given int value
	 * @param number-Searching Data fields
	 * @return deleted node
	 */
	public Node<T> searchAndDelete(T number) {

		// write your code here
		if(isEmpty()) {
			return null;
		}
		Node<T> current = first;
		while(current!= null) {
			if(current.mData.equals(number)) {
				if(current.previous == null) {//check if it is the first node.
					first = current.next;//set second node to the first place of the linkedList
					if(first != null) {//if there are more nodes after new first node;
						first.previous = null;//set the new first node to null;
					}else{
						last = null;
					}
				}else {// If it's not the first node
					current.previous.next = current.next;
					if(current.next != null) {
						current.next.previous = current.previous;
					}else {
						last = current.previous;
					}				
				}
				current.next = null;
				current.previous = null;
				return current;
			}
			current = current.next;
		}
		return null;
	}

	/**
	 * display data from first node to last node
	 */
	public void printForwards() {

		// write your code here
		Node<T> current = first;
		System.out.print("Linked List: [From first to last]: ");
		while(current != null) {
			System.out.print(current.mData+" ");
			current = current.next;
		}
		System.out.println();

	}

	/**
	 * display data from last node to first node
	 */
	public void printBackwards() {

		// write your code here
		Node<T> current = last;
		System.out.print("Linked List: [From last to first]: ");
		while(current != null) {
			System.out.print(current.mData+" ");
			current = current.previous;
		}
		System.out.println();
	}
}
