package com.list;
import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Vector<Integer> v= new Vector<Integer>();
		//Vector b =new Vector();
		v.add(11);
		v.add(51);
		v.add(61);
		v.add(42);
		v.add(33);
		v.add(12);
		v.add(26);
		v.add(78);
		v.add(3, 40);
		/*b.add(10);
		b.add(5);
		b.add(6);
		v.addElement(b);
		*/
		//System.out.println(v);
		//System.out.println(v.elementAt(8)); */
		Vector<Integer> g= new Vector<Integer>(5,2);
		System.out.println(g.capacity());
		g.add(4);
		g.add(5);
		g.add(6);
		g.add(7);
		g.add(8);
		g.add(4);
		g.add(5);
		g.add(6);
		g.add(6);
		g.add(7);
		g.add(8);
		g.add(4);
		g.add(5);
		g.add(6);
		g.add(7);
		g.add(8);
		g.add(4);
		g.add(5);
		g.add(6);
		g.add(7);	
		g.add(8);
		g.add(6);
		System.out.println(g.size());
		System.out.println(g.capacity());
	}

}
