package com.kodnest.LabelledForLoop;

public class LabelledForLoop {
	public static void main(String[] args) {
		rajini:for(int i=1;i<=3;i++)
		{
			System.out.println("hello");
			tamanna:for(int j=1;j<=5;j++)
			{
				break rajini;
			}
			System.out.println("kodnest");
		}
	}

}
