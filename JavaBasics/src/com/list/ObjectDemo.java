package com.list;
import java.util.*;
public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*LinkedList l1=new LinkedList();		
		l1.add(10);
		l1.add("Bheemaraya");
		l1.add(45.78f);
		l1.add("w");
		System.out.println(l1);
		*/
		ArrayList<Integer> a = new ArrayList<Integer>(2);
		a.add(1);
		a.add(2);
		System.out.println(a);
		System.out.println(a.size());
		a.add(3);
		System.out.println(a);
		System.out.println(a.size());
		
		//System.out.print(a.ensureCapacity(10));
		

	}

}
