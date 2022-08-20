package com.list;
import java.util.*;
public class DictionaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> m = new TreeMap<String,String>();
		m.put("1DA18CS029","Bheemaraya");
		m.put("1DA18CS026","Badri Narayan S");
		m.put("1DA18CS027","Bharath");
		m.put("1DA18CS028","Bhargav G K");
		m.put("1DA18CS046","Dinesh Kuamar T P");
		m.put("1DA18CS042","Deekshit S A");
		System.out.println(m);
		System.out.println(m.get("1DA18CS026"));
		System.out.println(m.put("1DA18CS031", "Binit Shresta"));
		System.out.println(m);
	}

}
