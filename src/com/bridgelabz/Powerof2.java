package com.bridgelabz;

import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		System.out.println("power:");
		int power = scan.nextInt();
		int num = 4;
		
		if (num < 31) {
			for (int i=1; i<=num; i++) 
			{
				power = (2 * power);
				System.out.println("power of 2 is : "+power);
			}	
		}
	scan.close();
	}
}