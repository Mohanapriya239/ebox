
package com.euler;
public class SmallestMultiple {
public static void main(String[] args) {

		System.out.println(multiple());
	}
		
		public static int multiple()
		{
			int n=0;
			boolean found=false;
			while(!found)
			{
				n=n+2520;
			boolean isdivide=true;
			for(int i=1;i<=20;i++)
			{
				if(n%i!=0)
				{
					isdivide=false;
					break;
				}
			}
			if(isdivide)
			{
				found=true;
			}
			}
		return n;
		}
}

