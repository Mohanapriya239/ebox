package com.hcl;

public class EvenOdd {

	public static void main(String[] args) {
		int[] a=new int[] {23,9,6,64,5};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even:"+a[i]);
				
			}
			else
			{
				System.out.println("Odd:"+a[i]);
			}
		}
	}

}
