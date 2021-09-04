//Collection is an Interface Whose child Interface is (List, Set, Queue)
//
//List - It Stores element is Contiguous fashion manner which means insertion order is preserved
//     - Duplicates are allowed
//     - List is child Interface of Collection Interface
//     - Available from version 1.2
//     - ArrayList, LinkedList, Stack & Vector are classes who implements list Interface
//
//ArrayList - ArrayList is a Class
//			- It implements list interface
//		  	- Dynamically memory allocation
//		  	- Initial Size of Array is 10
//		  	- When elements reach maximum limit it increases (n*n/2) + 1
//			- Available from version 1.2
//          - LinkedList can Performs everything similar to ArrayList

import java.util.*;

public class LearnArrayList {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>(); 		// created an Object of an Arraylist -Integer Type where list is reference variable
		List<Integer> newlist=new ArrayList<>(); 	// Created other Object of an ArrayList 
		
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		list.add(10); 								//this will add 10 at the last (Expected output is - [2,3,4,10]
		System.out.println(list);

		list.add( 1, 5); 							// this will add 5(5 is an element) at index 1( 1 is an index)
		System.out.println(list);
		
		newlist.add(30);
		newlist.add(20);
		System.out.println("NewList:"+ newlist); 	// Printing newList
		
		list.addAll(newlist); 						// This will Append newlist at the end to the list
		System.out.println(list);
		
		System.out.println(list.get(5));  			//To Get An Element of index=5
		
		System.out.println(list.remove(3));         // This will remove elements which is present on index=3
		
		list.remove(Integer.valueOf(10));			// We are trying to remove Integer type element who's value is 10
		System.out.println(list);
		
		list.set(2, 40);							// this will set value 40 at index number 2
		System.out.println(list);
		
		System.out.println(list.contains(20));		// this will check whether 20 is present in the list or not


		
		
		// Type-1 (Iterating list one-by-one) using for loop
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println("Element at "+i+" is "+ list.get(i));
		}
		
		// Type-2 (Iterating list one-by-one) using foreach loop
		
		for(Integer element: list)
		{
			System.out.println("Foreach Element is "+element);
		}
		
		// Type-3 [Iterating list one-by-one] using Iterator(this is basically acts as cursor)
		
		Iterator<Integer> it =list.iterator();
		
		while(it.hasNext())
		{
			System.out.println("Iterator "+ it.next());
		}
		
		
		list.clear();     							// this will remove all the elements from ArrayList
		System.out.println(list);
	}

}
