package coreJava;

public class OverloadingDemo {

    public static int getData(int a)
    {
        return a;
    }
    public static int getData(int a, int b)
    {
        return a + b;
    }

    public static String getData(String b)
    {
        return b;
    }

    public static void main(String[] args) {

        int myNum1 = getData(9);
        int myNum2 = getData(6, 11);
        String myStr = getData("hello world");

        System.out.println(myNum1);
        System.out.println(myNum2);
        System.out.println(myStr);

    }
 //static methods can be used to enforce encapsulation
    // since they can only be called from within the
    // class in which they are defined

    //can be used to create utility classes that contain general-purpose methods
}
