package com.hcl;

public class EvenoddPositions {

	public static void main(String[] args) {
		int[] a=new int[] {12,17,19,20,21};
		for(int i=0;i<a.length;i++) 
		{
			if(i%2==0)
			{
				System.out.println("even:"+a[i]);
			}
		}
		for(int i=1;i<a.length;i=i+2)
		{
			System.out.println("odd:"+a[i]);
		}
			

	}

}
