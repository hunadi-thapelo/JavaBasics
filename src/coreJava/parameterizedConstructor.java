package coreJava;

public class parameterizedConstructor {
    //has not return type example 'void' like a method
    //NB: name of constructor should be class name
    public parameterizedConstructor() //defined constructor - code in the block{} will be executed in main class
    {
        System.out.println("I am a constructor!");
        System.out.println("I am the second constructor!");
        //this block is used to define variable or initiate properties
    }

    public parameterizedConstructor(int a, int b){
        System.out.println("I am the parameterized constructor");
        int c=a+b;
        System.out.println(c);
    }

    public parameterizedConstructor(String thisString){
        System.out.println(thisString);
    }
    public void getData(){
        System.out.println("I am the method under parameterized constructor");
    }

    public static void main(String[] args)
    {
        //constructor is a block of code when object is created/instantiated
        //compiler calls implicit constructor when constructor is not defined
        parameterizedConstructor demoThis=new parameterizedConstructor(); //default constructor

        //parameterized constructors
        parameterizedConstructor demoThisTwo = new parameterizedConstructor(100,50);
        parameterizedConstructor demoThisString = new parameterizedConstructor("Hello string constructor");

        demoThis.getData(); //calls class method
        demoThisTwo.getData();
        demoThisString.getData();
    }

}
