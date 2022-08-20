package com.controlstatements;
import java.util.*;

/**
 * 
 * @author Bheemaraya
 *
 *simple if  statement :
 *~The simple if statement is most simple control flow statement in java.
 *~This check the boolean condition if true then it executes the block of code.
 * 
 */
public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		try {
		System.out.println("Enter a marks:");
		int s=sc.nextInt();
		if (s<35) 
		{
			System.out.println("He need to be study again");
		}
		}
		finally
		{
			sc.close();
		}

	}

}
