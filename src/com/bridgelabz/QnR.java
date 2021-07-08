package com.bridgelabz;

import java.util.Scanner;

public class QnR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a dividend number:");
        int dividend = scanner.nextInt();
        
        System.out.print("Enter divisor number:");
        int divisor = scanner.nextInt();
        
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
        scanner.close();
	}

}
