package com.list;
import java.util.*; 

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer,Integer> m = new HashMap<Integer,Integer>();
		m.put(1, 1);
		m.put(2, 2);
		m.put(2, 2);
		m.put(3,3);
		System.out.print(m);

	}

}
