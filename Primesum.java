package com.euler;

public class Primesum {

	public static void main(String[] args) {
		int count=0;
		long sum=0;
		long n=2000000;
		for(n=1;n<=2000000;n++)
		{
				for(int i=2;i<=n;i++)
		          {
					if(n%i==0)
					{
					count++;
					//break;
				if(count==1)
				{
					sum+=n; 
				}
		          }
		          }
		}
				System.out.println(sum);

	}
}