//Collection is an Interface Whose child Interface is (List, Set, Queue)
//
//List - It Stores element is Contiguous fashion manner which means insertion order is preserved
//     - Duplicates are allowed
//     - List is child Interface of Collection Interface
//     - Available from version 1.2
//     - ArrayList, LinkedList, Stack & Vector are classes who implements list Interface

//Queue - Queue is child interface of Collection Interface
//	  	- Available from version 1.5
//	  	- Worked on FIFO(First In First Out)
//	  	- It has Front and Rear End, we put element through rear end and element will exit from front end(like Ticket-Counter Queue)
//	  	- We can implement queue using array and LinkedList
//
//LinkedList - LinkedList is a class which implements Queue interface as well as List Interface
//			 - add(), element(), remove() can be used insted of offer(), peek(), and poll() if anything goes wrong app can crash
//
//
//

import java.util.*;

public class LearnLinkedListQueue {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
			queue.offer(10);  								// Offer() is used add elements in a queue
			queue.offer(20);
			queue.offer(30);
			queue.offer(40);
			
			System.out.println(queue);
			
			System.out.println(queue.poll()); 				//poll() it will remove element which is entered first in a queue
			System.out.println(queue);
			
			System.out.println(queue.peek());				 //peek() it shows the first element in a queue
	}

}
