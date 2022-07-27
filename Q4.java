package com.test;

public class Q4 {
	public static void main(String[] args) {
		
		int n=14;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==n || i-j>=(n-1)/2|| ((i+j)/3)*2 >= n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}