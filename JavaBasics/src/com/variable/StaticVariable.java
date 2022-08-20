package com.variable;
/**
 * 
 * @author Bheemaraya
 *"The variable which is which is available to all class instance \
 *is called Static variable"   
 */

public class StaticVariable {
	 static int a=90;//Static variable
	 void method(){
	System.out.println(a+70);
	}
	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		int i=10;//instance variable
		System.out.println(a);
		System.out.println(a+i);
		*/
		StaticVariable s= new StaticVariable();
		s.method();
		System.out.println(a);

	}

}
