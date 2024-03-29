package oopsinjava;

public class staticVar {

    //instance variables and class variables
    String suburb; //this is instance variable
    String city;
    static String province; //this is call class variable //change property to static property to be
                                             // shared by object in main class
                                             // it now belongs to class and not object
    static int i; //all objects share same variable by making it static

    static{ //static block // to make code more readable, easily identify static variables of class
        province = "Johannesburg";
        i = 0;
    }

    //local variables
    staticVar(String suburb, String city)
    {
        //assign local variables to instance variables
        this.suburb = suburb;//use operator this to identify parameters to this class
        this.city = city;
        //this.province = province; // remove this variable to match number of parameters in constructor
        i++;
        System.out.println(i);
    }

    //create method of this class 'staticVar'
    public void getSuburb(){

        System.out.println(suburb + " " + province); //print province variable
    }

    //static method
    public static void getProvince() {
        //static method will only accept static variables
        System.out.println(province);
    }

    public static void main(String[] args){
        //instance variables or variables in the class are activated by values by what we send from object
        //staticVar obj = new staticVar("Ferndale", "Johannesburg North", "Gauteng");
        staticVar obj = new staticVar("Ferndale", "Johannesburg North"); //remove parameter Gauteng, it is the same value
                                                                                    // - but this save memory in Java
        //staticVar obj1 = new staticVar("Oakdene", "Johannesburg South", "Gauteng");
        staticVar obj1 = new staticVar("Oakdene", "Johannesburg South"); //same for this object - refer to static instance variable

        obj.getSuburb(); //print method value of this object
        obj1.getSuburb();
        staticVar.getProvince(); // all static methods can be access with class name
        staticVar.i = 10; //can assign values at runtime to static variables
        obj.suburb = "North Riding"; //assigning values to non static variable

    }


}
