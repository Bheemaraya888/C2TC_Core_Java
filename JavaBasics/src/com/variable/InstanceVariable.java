package com.variable;
/**
 *@Author Bheemaraya
 *About Local Variable 
 *"The Variable which declared outside  the method and 
 *inside the class  called Instance Variable "
 *Instance variable cannot declared as a "static" 
 * 
 */


public class InstanceVariable {
	 
	 static void method1(int a) 
	{
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=60;//instance variable
		//InstanceVariable i = new InstanceVariable();
		method1(a);
		System.out.println(a);

	}

}
