package com.list;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stack implementation using Last In First Out(LIFO) or (FILO) 
		Stack<Integer> s = new Stack<Integer>();
	    //check the stack is empty or not before adding elements
		//System.out.println("The Stack is empty                      :"+s.empty());
		s.add(20);
		s.add(29);
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.push(70);
		s.add(60);
		System.out.println("Stack element in the list               : " +s);
		/*
		//Retrieve element from top end it gives the first element from the stack   
		System.out.println("Pop element in the stack                : " +s.pop());
		
		//push the element from top end it storing as last element in the  stack  
		System.out.println("Push into the stack is                  : "  + s.push(9));
		
		//peek gives the the top last element from stack
		System.out.println("From Top end it gives the first element : "+s.peek());
		System.out.println("Stack element in the list               : " + s);
		
		//push the element from top end it storing as last element in the stack  
		System.out.println("Search the element from the stack       : "  + s.search(70));
		
		*/
		Enumeration<Integer> e = s.elements();
		while(e.hasMoreElements())
		{
			Integer I = (Integer) e.nextElement();
			if(I%2==0) 
			{
				System.out.println(I);
			}

		}

	}
}