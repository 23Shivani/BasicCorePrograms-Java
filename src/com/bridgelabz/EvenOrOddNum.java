package com.bridgelabz;

public class EvenOrOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		double num = Math.floor(Math.random()*10);
		
		System.out.println(num);
		if (num % 2 == 0) 
		{
			System.out.println("Number is Even :"+num);
		}
		else 
		{
			System.out.println("Number is Odd "+num);
		}
	}

}