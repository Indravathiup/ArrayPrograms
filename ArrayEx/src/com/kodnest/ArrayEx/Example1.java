package com.kodnest.ArrayEx;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of array");
		int arr[]=new int[scan.nextInt()];
		for(int i =0;i<=arr.length-1;i++)
		{
			System.out.println("enter the array elements");
			arr[i]=scan.nextInt();
		}
		System.out.println("array contents are");
		for(int x:arr)      //enhanced for loop
		{
			if(x>0)
			{
				System.out.print(x+" ");
			}
			
		}
	}

}
