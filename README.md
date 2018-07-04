# JavaGenerics

>What is a Generic?
* The idea is to allow type (Integer, String, … etc and user defined types) to be a parameter to methods, classes and interfaces. For example, classes like HashSet, ArrayList, HashMap, etc use generics very well.
* Generics are used to create Generic Classes and Generic methods which can work with different Types(Classes).

>What is a Generic Type Parameter?
* A generic type parameter is when a type can be used as a parameter in a class, method or interface declaration.
public interface Consumer {
    public void consume(String parameter)
}

public interface Consumer<T> {
    public void consume(T parameter)
}

When we implement our Consumer, we need to pass type
public class IntegerConsumer implements Consumer<Integer> {
    public void consume(Integer parameter)
}

>Advantages of Using Generic Types?
* Avoid code duplication
* By using generics we have a compile type check which prevents ClassCastExceptions and removes the need for casting.
	List<String> list = new ArrayList<>();
	list.add("foo");
	String o = list.get(1);    // No cast
	Integer foo = list.get(1); // Compilation error

>declare a Generic Class?
* class MyListGeneric<T>

