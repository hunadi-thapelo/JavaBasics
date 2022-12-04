package JavaBasics;

public class CreateMethodClasses {
    public static void main(String[] args)
    {
        CreateMethodClasses d = new CreateMethodClasses();
        d.getData();
        int b = d.getData();
        System.out.println("Test "+b);

        //my second method
        CreateMethodClasses2 a = new CreateMethodClasses2();
        a.getUserData();

        //call static method - no need to create an object with new keyword
        getData2();

    }

    //public = it can be accessed by anyone / other classes
    //void = the method does not return a value
    public int getData(){ //to return a value - specify the data type e.g int in place of void

        System.out.println("My new first method");
        return 45; //to return declare a type
    }

    public static int getData2(){ //to return a value - specify the data type e.g int in place of void

        System.out.println("Static method to move to class level");
        return 45; //to return declare a type
    }


}
