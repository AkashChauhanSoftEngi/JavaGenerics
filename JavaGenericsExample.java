package com.project.java;

import java.util.ArrayList;
import java.util.List;

public class JavaGenericsExample {

	public static void main(String[] args) {
		MyList myList = new MyList();
        myList.add("One");
        myList.add("Two");
        myList.get(0);
        System.out.println("MyList: " + myList.get(0) + "," + myList.get(1));
        
        MyListGeneric<String> myListString = new MyListGeneric<String>();
        myListString.add("One");
        myListString.add("Two");
        System.out.println("MyListGeneric<String>: " + myListString.get(0) + "," + myListString.get(1));
        

        MyListGeneric<Integer> myListInteger = new MyListGeneric<Integer>();
        myListInteger.add(1);
        myListInteger.add(2);
        System.out.println("MyListGeneric<Integer>: " + myListInteger.get(0) + "," + myListInteger.get(1));
	}

}

class MyList {
    private List<String> values = new ArrayList<String>();

    void add(String value) {
        values.add(value);
    }

    void remove(String value) {
        values.remove(0);
    }
    
    String get(int index){
    	return values.get(index);
    }
}

class MyListGeneric<T> {
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
