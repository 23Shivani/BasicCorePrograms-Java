package com.bridgelabz;

public class Swap2num {

	public static void swap(int a,int b) {
		// TODO Auto-generated method stub
		int temp = a;
		a = b; 
		b = temp;
		System.out.println("Numbers after swapping a: "+a+" and b: "+b);
	}
	public static void main(String[] args) {
		int a = 5;
		int b = 8;	
		swap(a,b);
		System.out.println("Numbers before swapping a: "+a+" and b: "+b);
	}

}