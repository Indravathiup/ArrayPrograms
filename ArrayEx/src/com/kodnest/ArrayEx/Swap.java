package com.kodnest.ArrayEx;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two values");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c;
		System.out.println("print the values before swap"+" "+a+" " + b); //swapping before
		c=a; 			 //first variable give it to helping variable
		a=b;  			//second variable give it to first variable
		b=c;  			//helping variable give to second variable
		System.out.print("print the values after swap"+" " +a+" " + b);   //after swapping
		
		
	}

}
