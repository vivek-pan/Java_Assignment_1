package com.test;

public class Q5 {
	public static void main(String[] args) {
		
	
	int n=14;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1 || i==n || i+j <= (n+2)/2 || i-j >= (n-1)/2)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}