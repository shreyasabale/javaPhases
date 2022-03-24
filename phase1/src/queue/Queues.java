package queue;

import java.util.*;

public class Queues 
{
	public static void main(String[] args) 
	{
	        		Queue<String> locationsQueue = new LinkedList<>();
	        		locationsQueue.add("Pune");
	        		locationsQueue.add("Nashik");
	        		locationsQueue.add("Mumbai");
	        		locationsQueue.add("Delhi");
	        		locationsQueue.add("Goa");
	        		System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}
}
