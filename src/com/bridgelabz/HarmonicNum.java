package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("num:");
		int num = scan.nextInt();
		float harmonic = 1;
		for (int i = 2; i<= num; i++) 
		{
			harmonic += (float)1/i;
			System.out.println(harmonic);
		}
		System.out.println("Harmonic number is "+harmonic);		
    scan.close();
    }
}