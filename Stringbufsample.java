package com.hcl;
public class Stringbufsample {

	public static void main(String[] args) {
		StringBuffer a=new StringBuffer("Hello");
		System.out.println(a);
		a.append(" World");
		System.out.println(a);
		a.insert(5, "_Java");
		System.out.println(a);
		a.replace(5, 6," ");
		System.out.println(a);
		a.delete(3, 4);
		System.out.println(a);
		a.capacity();
		System.out.println(a);
		a.reverse();
		System.out.println(a);
		System.out.println(a.charAt(6));
		

	}

}
