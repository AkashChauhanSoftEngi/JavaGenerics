package com.project.java;

public class JavaGenericInterface implements Comparable<String>{

	public static void main(String[] args) {
		JavaGenericInterface obj = new JavaGenericInterface();
		System.out.println("Result: " + obj.compareTo("Sample"));
	}

	@Override
	public int compareTo(String o) {
		if(o.equals("Sample")){return 1;}
		return 0;
	}
}

interface Comparable<T> {
    public int compareTo(T o);
}
