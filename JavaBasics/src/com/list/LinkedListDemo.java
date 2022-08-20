package com.list;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList<Integer>();
		LinkedList<Integer> l1 = new LinkedList<Integer>();

		// the adding element in the linkedlist
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		System.out.println(l);

		// adding element in the specified location
		l.add(3, 40);
		l.add(5, 100);
		System.out.println("The LInkedLISt l is" + l);

		// The Second linked list

		l1.add(60);
		l1.add(70);
		l1.add(80);
		l1.add(90);
		System.out.println("The LinkedList L1 is " + l1);

		// adding collection to the list

		l.addAll(5, l1);
		System.out.println("The LInkedLISt l is after adding new collection " + l);

		// Clone the list
		System.out.println("The cloning list or swallow copy " + l.clone());

		// Retrieve the first element in the list
		System.out.println("The First elment is " + l.getFirst());

		// Retrieve the last element in the list
		System.out.println("The Last  elment is " + l.getLast());

		// Retrieve the element from the specified location in the list
		System.out.println("The elment is " + l.get(8));

		// The size of the linked list
		System.out.println("The Size of the linkedlist is  " + l.size());

		// The replace the element from the specied loaction
		System.out.println("The replace the element from the specified loaction " + l.set(9, 200));
		System.out.println("The LInkedLiSt l is after adding replacing element to the list \n" + l);

		// The LinkedList convert into array

		int a[] = new int[l.size()];
		for (int i = 0; i < l.size(); i++) {
			a[i] = l.get(i);
		}

		for (int i : a) {
			System.out.print(" " + i);

		}
		System.out.print("\n");

		for (int i = 0; i < l.size(); i++) {
			System.out.print(" " + a[i]);

		}
		System.out.print("\n");

		Integer[] b = l.toArray(new Integer[0]);
		for (int i : b) {
			System.out.print(" " + i);

		}
		System.out.print("\n");

		// remove element by using object
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l.remove());
		System.out.println(l);
		System.out.println(l.remove(2));

		// contains element in the list
		System.out.print(l.contains(90));
		System.out.println(l.contains(200));

		// clear the element from the list
		l.clear();
		System.out.println(l);
		System.out.println(l.getClass());
		System.out.println(a.getClass());
		System.out.println(b.getClass());

	}

}
