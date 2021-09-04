//Collection is an Interface Whose child Interface is (List, Set, Queue)
//
//List - It Stores element is Contiguous fashion manner which means insertion order is preserved
//     - Duplicates are allowed
//     - List is child Interface of Collection Interface
//     - Available from version 1.2
//     - ArrayList, LinkedList, Stack & Vector are classes who implements list Interface
//
//Stack - Stack is a class and it implements List Interface{ WHich means stack can access all functionalities (like functions) of List.}
//	  	- Works on LIFO (Last In First Out) Which means elements which enters last in stack will be first to remove.
//		- push(), peek() & Pop() are main methods in stack
//


import java.util.*;

public class LearnStack {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<>();
		st.push("abhi");
		st.push("wacky");
		st.push("sandy");
		st.push("Choco");
		
		System.out.println(st); 					//This will print all elements present in stack
		
		System.out.println(st.peek()); 				//This will show which elements present at top(top elements is always last pushed element on stack)
		
		st.pop();  									//This will remove top element from stack
		System.out.println(st);
		
		System.out.println(st.peek()); 				// Now the peek element will be sandy
	}

}
