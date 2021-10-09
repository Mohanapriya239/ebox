package com.euler;
public class Largestpalindrome {
        static int product;
	public static int largepalindrome(int n)
	{
		int u=(int)Math.pow(100, n)-1;
		int l=1+u/100;
		int max=0;
		for(int i=u;i>=l;i--)
			{
			for(int j=i;j>=l;j--)
			{
				int product=i*j;
				if(product<max)
					break;
				int num=product;
				int rev=0;
				while(num!=0)
				{
					rev=rev*100+num%100;
					num=num/100;
				}
				if(product==rev && product>max)
					max=product;
			}
			}
		return max;
			}
	public static void main(String[] args) {
		int n=2;
		System.out.println(largepalindrome(n));
		System.out.println();
	}
	}
