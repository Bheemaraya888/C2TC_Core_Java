package com.variable;
/**
 * 
 * @author Bheemaraya
 * 
 *"Data types Specify the size and values that can be stored in the variable"
 *"There are two Data types 1.Primitive 2.Non Primitive data types"
 *There are 8 Primitive data types 
 *1.boolean data types - True or False
 *2.byte data types    - 1 byte means 8 bit = 256 values range between -128 to 127
 *3.char data types    - 1 byte means 8 bit
 *4.short data types   - 2 byte means 16 bit
 *5.int data types     - 4 byte means 32 bit
 *6.long data types    - 8 byte means 64 bit-L
 *7.float data types   - 4 byte means 32 bit with single precision-0.0f 
 *8.double data types  - 8 byte means 64 bit with double precision-0.0d
 *
 * Non primitive data types are 
 * string, classes, interfaces,arrays etc. 
 */
public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=true;
		if (a==true) 
		{
			System.out.println(a);
		}
		else 
		{
			System.out.println("HI Bheemaraya");
		}
		byte b=12;
		char c ='\u0062';
		short d=32767;
		int  e=678768686;
		long f=908090999;
		float g=787989989898989.09090980990898887f;
		double i=88099897879879876.0986698779898d;
		//System.out.println(a);
		System.out.println("1 " + b);
		System.out.println("2 " + c);
		System.out.println("3 " +d);
		System.out.println("4 " +e);
		System.out.println("5 " +f);
		System.out.println("6 " +g);
		System.out.println("7 " +i);
		System.out.println((byte)(7));
		System.out.println((char)('$'));
		
		
	}

}
