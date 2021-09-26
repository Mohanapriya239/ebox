package com.hcl;
import java.util.*;
public class Multiple3and5 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int n=1000,i,a=0;
		//n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				a=a+i;
			}
			
		}
		System.out.println(a);
	}

}
