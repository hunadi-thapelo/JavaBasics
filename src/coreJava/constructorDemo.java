package coreJava;

public class constructorDemo {

    //has not return type example 'void' like a method
    //NB: name of constructor should be class name
    public constructorDemo() //defined constructor - code in the block{} will be executed in main class
    //public void constructorDemo() //with 'void' method is not executed when accessed by another class e.g accessModifier class
    {
        System.out.println("I am a constructor!");
        System.out.println("I am the second constructor!");
        //this block is used to define variable or initiate properties
    }

    public void getData(){
        System.out.println("I am the method");
    }

    void myABC(){
        System.out.println("I am the default method from constructorDemo class/program");
    }

    public static void main(String[] args)
    {
        //constructor is a block of code when object is created/instantiated
        //compiler calls implicit constructor when constructor is not defined
        constructorDemo demoThis=new constructorDemo();
        demoThis.getData(); //calls class method
        //demoThis.constructorDemo();
    }

}
