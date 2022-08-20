package com.operator;
/**
 * 
 * @author Bheemaraya
 *
 *Ternary Operator
 *Ternary Operator (?:) is used to replacement as a on line statement 
 *for if then else statement and used a lot in java programming. 
 *
 *It is the only conditions which take the operands. 
 */


public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=8;
		int min=(a<b)?a:b;
		System.out.println("min " +min);
		
		int c=8;
		int d=20;
		int max=(c>d)?c:d;
		System.out.println("max " +max);

	}

}
