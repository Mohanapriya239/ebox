package com.euler;

public class Prime1000 {
	public static boolean isPrime(int n)
	{
		if(n%2==0)
			return false;
		else
			for(int i=3;i<=(int)Math.sqrt(n);i++)
			{
				if(n%i==0)
					return false;
			}
	return true;
	}
	public static void main(String[] args) {
		int c=1;
		for(int i=3; ;i++)
		{
			if(isPrime(i))
				c++;
			if(c==10001)
			{
				System.out.println(i);
				break;
			}
		}
	}

}
