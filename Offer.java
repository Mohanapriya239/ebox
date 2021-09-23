package com.hcl;

import java.util.Scanner;

public class Offer {

	public static void main(String[] args) {
		int p1,p2,p3,total,offer1,offer2;
		Scanner s=new Scanner(System.in);
		System.out.println("Cost of p1:");
		p1=s.nextInt();
		System.out.println("Sost of p2:");
		p2=s.nextInt();
		System.out.println("Cost of p3:");
		p3=s.nextInt();
		total=p1+p2+p3;
		offer1=total*(int)0.2;
		if(p1<p2 && p1<p3)
		{
			offer2=p1;
		}
		else if(p2<p3)
		{
			offer2=p3;
		}
		else
		{offer2=p3;

	}
		if(offer1>offer2)
		{
			System.out.println("Go to offer1");
		}
		else
		{
			System.out.println("Go to offer2");
		}

}
}