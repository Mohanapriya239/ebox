package com.hcl;
//import java.util.*;
public class Evenfibo {
		
		static int fibo(int N)
		    {
		        int a = 1;
		        int b = 2;
		        int temp = 0;
		        int sum = 0;
		        while(a < N)
		        {
		            if(a % 2 == 0)
		                sum += a;
		            temp = b;
		            b = b + a;
		            a = temp;
		         }
		         return sum;
		    }

			public static void main (String[] args) 
			{
				int N = 4000000;
				int sum = fibo(N);
				System.out.println(sum);
			}
	}

 
   
