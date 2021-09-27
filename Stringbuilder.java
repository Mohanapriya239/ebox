package com.hcl;

public class Stringbuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
		sb.append(" World");
		System.out.println(sb);
		sb.insert(5,"_java");
		System.out.println(sb);
		sb.replace(5,6," ");
		System.out.println(sb);

		
		//ex
		System.out.println(sb.append(" World"));
		System.out.println(sb.insert(5,"_JAVA"));
		System.out.println(sb.replace(5,6,"$"));
		
	}

}
