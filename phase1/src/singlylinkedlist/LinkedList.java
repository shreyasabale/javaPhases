package singlylinkedlist;

import java.io.*; 

public class LinkedList {
	Node head;  
	static class Node 
	{ 
    		int data; 
    		Node next; 
    		Node(int d) 
    		{ 
        		data = d; 
        		next = null; 
    		} 
	} 

	public static LinkedList insert(LinkedList list, int data) 
	{ 
    		
    		Node new_node = new Node(data); 
    		new_node.next = null; 
		
    		if (list.head == null) 
    		{ 
        			list.head = new_node; 
    		} 
    		else 
    		{ 
        			
        			Node last = list.head; 
        			while (last.next != null) 
        			{ 
            			last = last.next; 
        			} 
		
        			last.next = new_node; 
    		} 
    		return list; 
	} 
	public static void printList(LinkedList list) 
	{	 
    		Node currNode = list.head; 
    		System.out.print("LinkedList: "); 
    		
    		while (currNode != null) 
    		{ 
        	
        			System.out.print(currNode.data + " "); 
        			currNode = currNode.next; 
    		} 
    		System.out.println(); 
	}  
	public static LinkedList deleteByKey(LinkedList list, int key) 
	{ 
    		
    		Node currNode = list.head, prev = null; 
    		if (currNode != null && currNode.data == key)
    		{ 
        			list.head = currNode.next;  
        			System.out.println(key + " found and deleted"); 
        			return list; 
    		} 
    		while (currNode != null && currNode.data != key) 
    		{ 
        			prev = currNode; 
        			currNode = currNode.next; 
    		} 
    		if (currNode != null) 
    		{ 
        			prev.next = currNode.next; 
        			System.out.println(key + " found and deleted"); 
    		} 
    		if (currNode == null) 
    		{ 
        			System.out.println(key + " not found"); 
    		} 
    		return list; 
	} 
	
	public static void main(String[] args) 
	{ 
    		
    		LinkedList list = new LinkedList(); 
    
    		list = insert(list, 1); 
    		list = insert(list, 12); 
    		list = insert(list, 13); 
    		list = insert(list, 45); 
    		list = insert(list, 56); 
    		list = insert(list, 66); 
    		list = insert(list, 89); 
    		list = insert(list, 91); 
    		
    		printList(list); 
    		deleteByKey(list, 1); 
    		printList(list); 
    		deleteByKey(list, 13); 
    		printList(list); 
    		deleteByKey(list, 10); 
    		printList(list); 
	}

}
