package com.list;
import java.util.*;
public class ArrayListDemo {


	public static void main(String[] args) {
		// To Create a dynamic Array
		ArrayList<Integer> a = new ArrayList<Integer>(10);
		ArrayList<Integer> b = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(50);
		a.add(60);
		
		System.out.println(a);
		System.out.println(b.isEmpty());		
		/*
		Vector v= new Vector();
		System.out.print(v.capacity());
		 */
	}

}
