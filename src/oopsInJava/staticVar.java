package oopsInJava;

public class staticVar {

    //instance variables and class variables
    String suburb;
    String city;
    static String province = "Johannesburg"; //change property to static property to be shared by object in main class

    //local variables
    staticVar(String suburb, String city)
    {
        //assign local variables to instance variables
        this.suburb = suburb;//use operator this to identify parameters to this class
        this.city = city;
        //this.province = province; // remove this variable to match number of parameters in constructor
    }

    //create method of this class 'staticVar'
    public void getSuburb(){

        System.out.println(suburb + " " + province); //print province variable
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

    }


}
