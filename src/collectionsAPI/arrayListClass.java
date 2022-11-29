package collectionsAPI;

import java.util.ArrayList;

public class arrayListClass {
    public static void main(String[] args)
    {
        //ArrayList is a dynamic array for storing elements. It has no size limit.
        //ArrayList is a Java util package
        //<> to pass the argument
        ArrayList<String> a = new ArrayList<>();
        //to add element to ArrayList
        //.add is method of 'a' object
        a.add("Learn");
        a.add(1,"Test"); //add element at index location
        a.add("Automation");
        a.add(3,"Framework");
        System.out.println(a);
        System.out.println(a.get(1)); // to get unknown element at index location
        a.remove(3);//remove element at index location
        System.out.println(a);
        System.out.println(a.contains("Java")); //.contains method check for match and returns response - false
        System.out.println(a.contains("Learn"));//.contains method check for match and returns response - true





    }
}
