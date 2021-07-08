package com.bridgelabz;

import java.util.Scanner;

public class FindLargeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a:");
		int a = scan.nextInt();

		System.out.println("Enter b:");
		int b = scan.nextInt();

		System.out.println("Enter c:");
		int c = scan.nextInt();
	
		if (a > b && a > c) 
		{
			System.out.println("a is greater");
		}
		else if (b > a && b > c ) 
		{
			System.out.println("b is greater");			
		}
		else 
		{
			System.out.println("c is greater");
		}
		scan.close();
	}

}
