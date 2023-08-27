package com.kodnest.ArrayEx;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array length");
		int arr[]=new int[scan.nextInt()];
		//int x;
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the array contents");
			arr[i]=scan.nextInt();
		}
		System.out.print("array contents are");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
			
		
			System.out.println("enter two indexes");
			int a=scan.nextInt();
			int b=scan.nextInt();
			int x;
			x=arr[a];
			arr[a]=arr[b];
			arr[b]=x;
			//System.out.println("after swap"+" "+arr[1]+" "+arr[2]);
		
	for(int i:arr)
	{
		System.out.println(i);			
	}
}
}


