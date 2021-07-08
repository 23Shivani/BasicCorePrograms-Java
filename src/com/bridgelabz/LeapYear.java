package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Scanner in = new Scanner(System.in);
		 
		 System.out.println("Enter Year: ");
		 int YrToCheck = in.nextInt();
		
		if (YrToCheck >= 1000) 
		{
			if(YrToCheck % 4 ==0 &&  YrToCheck % 100 != 0 || YrToCheck % 400 ==0) 
			{
				System.out.println("Leap Year");
			}
			else 
			{
				System.out.println("Not leap Year");
			}
		}
		else
		{
			System.out.println("Invalid Input");
			in.close();

		}
	}
}