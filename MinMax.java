package com.hcl;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int Maximum=Integer.MIN_VALUE;
		int Minimum=Integer.MAX_VALUE;
		System.out.println("Enter numbers:");
		for(int i=0;i<num;i++)
		{
			int current=sc.nextInt();
			if(current>Maximum)
			{
				Maximum=current;
			}
			if(current<Minimum)
			{
				Minimum=current;
			}
			
		}
		System.out.println("Maximum number:" +Maximum);
		System.out.println("Minimum number:" +Minimum);
		sc.close();

	}

}
