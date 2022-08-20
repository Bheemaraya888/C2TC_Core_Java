package com.list;
import java.util.*;
public class TreeSetDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it gives the element in the sorted and  ascending order
		Set<Integer> s = new TreeSet<Integer>();
		System.out.println("The inserted order is : 10, 5, 6, 4, 3, 1, 2, 7, 8, 9 ");
		s.add(10);
		s.add(5);
		s.add(6);
		s.add(4);
		s.add(3);
		s.add(1);
		s.add(2);
		s.add(7);
		s.add(8);
		s.add(9);
		System.out.println("TreeSetDemo : " + s);
		
		
		//LinkedHashSet gives the element what the way we inserted the element gives in the same order 
		Set<Integer> l = new LinkedHashSet<Integer>();
		System.out.println("\n");
		System.out.println("The inserted order is : 10, 5, 6, 4, 3, 1, 2, 7, 8, 9 ");
		l.add(10);
		l.add(5);
		l.add(6);
		l.add(4);
		l.add(3);
		l.add(1);
		l.add(2);
		l.add(7);
		l.add(8);
		l.add(9);
		
		
		System.out.println("LinkedHashSet : " +l);
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		l1.add(10);
		System.out.println("The ArryList is " + l1);
		int res = Collections.binarySearch(l1, 10);
		System.out.println(res);
		int res1 = Collections.binarySearch(l1, 20);
		System.out.println(res1);

	}

}
