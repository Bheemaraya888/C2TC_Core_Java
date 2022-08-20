package com.controlstatements;
/**
 * 
 * @author Bheemaraya
 *
 *Nested if else statement
 *
 */
public class NestedIfstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="AIT";
		String b="1DA18CS029";
		if(a=="AIT") {
			if(b=="1DA18CS029") {
				System.out.println("He is a Student of DRAIT with USN "+b);
			}
			else {
				System.out.println("He is a Student of DRAIT");
				
			}
		}
		else {
			System.out.println("He is not a student of DrAIT");
		}
	}

}
