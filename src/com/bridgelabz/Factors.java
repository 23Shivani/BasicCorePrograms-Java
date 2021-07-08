package com.bridgelabz;
import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("num:");
		int num = scan.nextInt();
		
		int fact = 1 ;
		for (int i=2; i<=num; i++) 
		{
			fact = fact*i;
		}
		System.out.println("Factorial : "+fact);
		scan.close();
	}

}
