/**
 * Processing data using Doubly Linked List CST8130 Data Structures,
 * Computer Engineering Technology-Computer Science: Level 3
 * 
 * Professor: James Mwangi PhD
 * 
 * 
 * Student Name:__Huijun____ ___Bu______
 * Student ID:_____041121881______
 * Program:Computer Engineering Technology-Computing Science
 * Course:8130 Data structure
 * Lab Section:301
 * 
 */


class TestDLLApp {
	public static void main(String[] args) {

		// write your lines of code here


		
		GenericDoublyLinkedList<Double> newGLL = new GenericDoublyLinkedList<>();
		newGLL.insertFirst(30.3);
		newGLL.insertFirst(40.3);
		newGLL.insertLast(50.3);
		newGLL.insertLast(60.3);
		newGLL.searchAndDelete(30.3);
		newGLL.searchAndDelete(50.3);
		newGLL.insertAfter(40.3, 50.3);
		newGLL.insertAfter(50.3, 88.8);
		newGLL.deleteFirstNode();
		newGLL.deleteLastNode();
		
		newGLL.printForwards();
		newGLL.printBackwards();
		newGLL.insertFirst(44.3);
		newGLL.insertFirst(4.3);
		newGLL.insertFirst(60.3);
		newGLL.printForwards();
		newGLL.printBackwards();
		newGLL.insertAfter(50.3, 90.0);
		newGLL.printForwards();
		newGLL.printBackwards();
		newGLL.insertAfter(60.3, 99.0);
		newGLL.printForwards();
		newGLL.printBackwards();
		newGLL.insertAfter(88.8, 100.0);
		newGLL.printForwards();
		newGLL.printBackwards();
		newGLL.deleteFirstNode();
		newGLL.deleteLastNode();
		newGLL.printForwards();
		newGLL.printBackwards();
	} // end of main() method
} // end class TestDLLApp
