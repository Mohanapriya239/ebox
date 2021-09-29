package com.hcl;

public class Largestprime {

		public static long largestprime(long n)
		{
			int i;
			long m=n;
			for(i=2;i<=m;i++)
			{
				if(m%i==0)
				{
					m/=i;
					i--;
				}
			}
			return i;
		}
 public static void main(String[] args)
 {
	 System.out.println("Largest prime factor: " + largestprime(60085));
	}

}
