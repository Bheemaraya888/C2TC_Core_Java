package com.list;
import java.util.*;
public class BitSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitSet b = new BitSet(16);
		BitSet b1 = new BitSet(16);
		for (int i = 0;i<16;i++) {
			if(i%2==0)b.set(i);
			if(i%5==0)b1.set(i);
		}
		System.out.println(b);
		System.out.println(b1);

	}

}
