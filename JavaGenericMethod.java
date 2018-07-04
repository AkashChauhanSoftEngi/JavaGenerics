package com.project.java;

public class JavaGenericMethod {

	public static void main(String[] args) {
		Integer[] integers = {1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0};
		int count = count(integers, 0);
		System.out.println("#occurrences of zeros: " + count);
	}
	
	public static <T> int count(T[] array, T item) {
	    int count = 0;
	 
	    if (item == null) {
	        for (T element : array) {
	            if (element == null) count++;
	        }
	    } else {
	        for (T element : array) {
	            if (item.equals(element)) {
	                count++;
	            }
	        }
	    }
	    return count;
	}

}
