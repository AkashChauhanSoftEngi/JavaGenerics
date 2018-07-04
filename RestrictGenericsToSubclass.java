package com.project.java;

import java.util.ArrayList;
import java.util.List;

public class RestrictGenericsToSubclass {
	public static void main(String[] args) {
        ListGeneric<Integer> myListInteger = new ListGeneric<Integer>();
        myListInteger.add(1);
        myListInteger.add(2);
        System.out.println("MyListGeneric<Integer>: " + myListInteger.get(0) + "," + myListInteger.get(1));
        
        //RestrictGenericsToSubclass<String> restrictedStringList = 
        //new RestrictGenericsToSubclass<String>();//COMPILER ERROR, because T extends Number
	}
}

class ListGeneric<T extends Number> {
    private List<T> values = new ArrayList<T>();;

    void add(T value) {
        values.add(value);
    }

    void remove(T value) {
        values.remove(value);
    }

    T get(int index) {
        return values.get(index);
    }
}