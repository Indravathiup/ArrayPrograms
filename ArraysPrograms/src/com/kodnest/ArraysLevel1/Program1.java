package com.kodnest.ArraysLevel1;

import java.util.Iterator;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array elements");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the contents of array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		System.out.println("array contents are");
			
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
