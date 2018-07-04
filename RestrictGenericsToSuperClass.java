package com.project.java;

import java.util.ArrayList;
import java.util.List;

public class RestrictGenericsToSuperClass {
	public static void main(String[] args) {
		List<Number> list = new ArrayList<Number>();
		RestrictGenericsToSuperClass.addNumbers(list);
		System.out.println(list.toString());
	}
	
	/*list of any type that is a super type of Integer*/
	/*List<? super Integer> is a unbounded List that accepts any value that is a Integer or a superclass of Integer*/
	public static void addNumbers(List<? super Integer> list) {
	    for (int i = 1; i <= 10; i++) {
	        list.add(i);
	    }
	}
}
