package com.list;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(80);
		a1.add(90);
		a1.add(100);
		
		System.out.println(a1.remove(9));
		System.out.println("ArrayList is " + a1);
		//System.out.println(a1.get(7));
		// System.out.println(a1.get(9));
		System.out.println(a1.set(4,8));
		System.out.println("Sub list is " + a1.subList(3, 8));
		System.out.println("ArrayList is " + a1);
		List<Integer> l1 = new LinkedList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(70);
		l1.add(80);
		l1.add(90);
		l1.add(100);
		System.out.println("LINKED LIST " + l1);
		

	}

}
