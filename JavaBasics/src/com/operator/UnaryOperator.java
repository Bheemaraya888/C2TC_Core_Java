package com.operator;

/**
 * 
 * @author Bheemaraya
 *
 *Unary Operator
 *Unary operator is performing a operation using single operand
 *Unary opeartor performed various opeartions
 *~increment or decrement each value by one 
 *~inverting a boolean expression
 *~negating a expression
 *  
 */
public class UnaryOperator {
	static void increment() 
	{
		int i=20;
		System.out.println(i++);//it prints the value before increment 20
		System.out.println(i);//21
		System.out.println(++i);//it prints the value after increment 22
			
	}
	static void decrement() 
	{
		int i=20;
		System.out.println(i--);//it prints the value before decrement 20
		System.out.println(i);//19
		System.out.println(--i);//it prints the value after decrement 18
		
	}
	static void add() 
	{
		int a=20;
		int b=10;
		System.out.println(a++ + b++);//30
		System.out.println((++a) + (++b));//34
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increment();
		decrement();
		add();

	}

}
