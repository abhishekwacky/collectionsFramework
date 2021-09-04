//Collection is an Interface Whose child Interface is (List, Set, Queue)
//
//Queue - Queue is child interface of Collection Interface
//	  	- Available from version 1.5
//	  	- Worked on FIFO(First In First Out)
//	  	- It has Front and Rear End, we put element through rear end and element will exit from front end(like Ticket-Counter Queue)
//	  	- We can implement queue using LinkedList, PriorityQueue, 
//
//PriorityQueue - PriorityQueue is a class which implements Queue Interface
//			  	- We can set Priority within queue(whatever we want)
//				- Initially we get smaller element out of a PriorityQueue(Default Setting)


import java.util.*;

public class LearnPriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		
		pq.offer(40);
		pq.offer(10);
		pq.offer(38);
		pq.offer(26);
		
		System.out.println(pq); // Under the hood PriorityQueue Implements MinHeap Concept(Tree) so we will get output in Tree form
		
		System.out.println(pq.poll()); // This will remove smaller element 
		System.out.println(pq);
		
		System.out.println(pq.peek());
	}

}
