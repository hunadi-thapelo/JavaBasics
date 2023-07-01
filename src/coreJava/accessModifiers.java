package coreJava;


public class accessModifiers {

    //RS Section 34:Lesson 304
    //Default class methods can be used anywhere within the package
    //Public class methods can be accessed within same package and between packages

    public static void main(String[] args)
    {
        constructorDemo obj = new constructorDemo();
        obj.myABC();
        obj.getData();
        //System.out.println("My access modifier");

    }
}
