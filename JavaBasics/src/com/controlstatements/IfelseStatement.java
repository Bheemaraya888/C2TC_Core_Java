package com.controlstatements;
import java.util.*;
/**
 * 
 * @author Bheemaraya
 *
 *If else statement:
 *
 */
public class IfelseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter a Number");
			int n=sc.nextInt();
			if (n>1) 
			{
				System.out.println("the number is greater than  your postion");
			}
		else {
			System.out.println("the number is lesser than  your postion");			
		}
		}
		finally {
			sc.close();
		}
	}

}
