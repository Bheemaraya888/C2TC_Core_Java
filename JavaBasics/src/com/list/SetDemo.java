package com.list;
import java.util.*;
public class SetDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int array[]= {10,20,30,40,50,60,50,40,90,70,80,90};
		//Set<Integer> s1 = new HashSet<Integer>();
		SortedSet<Integer> s1=new TreeSet<Integer>();
		try {
			for(int i=0;i<array.length;i++) 
			{
				s1.add(array[i]);
			}
			System.out.println(s1);
			//System.out.println(array.length);
			//System.out.println(s.size());
		}
catch (Exception e){}
	}
}
