package org.printInteger;

import java.util.Scanner;

public class PrintAnInteger {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int no = sc.nextInt();
		System.out.println("Entered Number is :"+no);
		
		System.out.println("Enter 2nd Number");
		long l = sc.nextLong();
		System.out.println("Entered Number is :"+l);
	}

}
