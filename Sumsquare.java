package com.hcl;

public class Sumsquare {

	public static void main(String[] args) {
		//sumsquaredifference
		//square of sum-sum of square
		int n=100,sum=0,square=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
			square+=i*i;
		}
		int d=sum*sum-square;
		System.out.println(d);
		

	}

}
