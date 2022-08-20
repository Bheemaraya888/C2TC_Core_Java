package com.list;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m1=new HashMap<Integer,String>();
		
		m1.put(1,"ONE");
		m1.put(2,"TWO");
		m1.put(3,"THREE");
		m1.put(4,"FOUR");
		m1.put(5,"FIVE");
		System.out.println(m1);
	//	System.out.println(m1.clear());
		System.out.println(m1.get(1));
		//System.out.println(m1.put(6,"SIX"));
		System.out.println(m1.remove(5));
		System.out.println(m1);
		
		
		
		
	}

}
