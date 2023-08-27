package com.kodnest.ArrayEx;

import java.util.Scanner;

public class ArrayApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of array");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		//Array p=new Array();
		Array.PrintArray(arr);
	}

}
