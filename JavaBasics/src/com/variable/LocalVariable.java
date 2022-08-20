package com.variable;
/**
 *@Author Bheemaraya
 *About Local Variable 
 *"The Variable which declared inside the method and 
 *is used in the body of the method is called Local Variable " 
 *We can not declared local variable as a "Static" Keyword
 * 
 */


public class LocalVariable {

	static void method() 
	{
		int a=10;//local variable
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*LocalVariable l = new LocalVariable();
		l.method();
 		*/
		method();
	}

}
