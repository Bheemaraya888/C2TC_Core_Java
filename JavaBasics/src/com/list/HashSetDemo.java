package com.list;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(3);
		System.out.println(h);
		System.out.println(h.size());
		List<Integer> g = new LinkedList<Integer>();
		g.add(1);
		g.add(2);
		g.add(3);
		g.add(1);
		g.add(4);
		g.add(5);
		g.add(1);
		g.add(2);
		System.out.println(g);
		System.out.println(g.size());
		h.addAll(g);
		System.out.println(h);
		System.out.println(g.iterator());
		
		System.out.println(h.size());

	}

}
