package com.hcl;
import java.util.*;
public class Wordcount {

	public static void main(String[] args) {
				String s;
				int count=0;
				Scanner sc=new Scanner(System.in);
		        System.out.println("Enter String:");
		        s=sc.nextLine();
		        for(int i=0;i<s.length()-1;i++)
		        {
		        	if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
		        	{
		        		count++;
		        	}
		        }
		        	System.out.println("Total number of words in string are:"+(count+1));
		        
		     
		}

	

}
