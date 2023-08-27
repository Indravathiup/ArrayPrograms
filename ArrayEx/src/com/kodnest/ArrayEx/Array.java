package com.kodnest.ArrayEx;

public class Array {
	public static void PrintArray(int arr[])
	{
		System.out.println("enter array contents in forward direction");
		for(int i=0;i<=arr.length-1;i++)
		{
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("enter array contents in reverse direction");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
			

		
	}

}
