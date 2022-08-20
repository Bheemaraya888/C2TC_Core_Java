package com.operator;
/**
 * 
 * @author Bheemaraya
 * Logical Operators
 * Logical AND(&&) and Bitwise AND(&) Operator
 * The Logical AND operator does not check the condition if the first condition is False. 
 * It only checks when the first conditions is TRUE.
 * 
 * But, Bitwise AND operator checks both condition.
 * 
 * Logical OR(||) and Bitwise OR(|) Operator
 * The Logical OR operator does not check the condition if the first condition is True. 
 * It only checks when the first conditions is False.
 * 
 * But, Bitwise OR operator checks both condition.
 */

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		//Logical AND Operator(&&)
		System.out.println(a<b && b>a);
		//Bitwise And Operator(&)
		System.out.println(a<b & b<a);
		
		System.out.println(++a>=b && b<=a);
		
		//Logical OR Operator(||)
		System.out.println(a<b || b>a);
		//Bitwise And Operator(|)
		System.out.println(a<b | b<a);
		System.out.println(++a>=b || b>a);
		
				
		
		

	}

}
