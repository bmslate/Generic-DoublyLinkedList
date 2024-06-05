Generic Doubly Linked List

This project implements a generic doubly linked list in Java. It allows insertion, deletion, and traversal of nodes from both ends of the list.

Features：
Insert Nodes: Insert nodes at the beginning, end, or after a specified node.
Delete Nodes: Delete the first, last, or a specified node.
Traversal: Print the list forwards or backwards.

Class Structure：
Main Classes：
Node<T>: Represents a node in the doubly linked list with data, next, and previous pointers.
GenericDoublyLinkedList<T>: Manages the list operations like insertion, deletion, and traversal.

Methods:
Node<T>
Node(T d): Constructor to initialize the node with data d.
void displayNode(): Displays the node's data.

GenericDoublyLinkedList<T>
GenericDoublyLinkedList(): Constructor to initialize an empty list.
boolean isEmpty(): Checks if the list is empty.
void insertFirst(T num): Inserts a node at the beginning of the list.
void insertLast(T num): Inserts a node at the end of the list.
boolean insertAfter(T numToFind, T newNumber): Inserts a node after the node with numToFind.
Node<T> deleteFirstNode(): Deletes the first node and returns it.
Node<T> deleteLastNode(): Deletes the last node and returns it.
Node<T> searchAndDelete(T number): Searches for and deletes the node with number.
void printForwards(): Prints the list from first to last.
void printBackwards(): Prints the list from last to first.
