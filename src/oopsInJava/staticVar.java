package oopsInJava;

public class staticVar {

    //instance variables and class variables
    String suburb;
    String city;
    String province;

    //local variables
    staticVar(String suburb, String city, String province)
    {
        //assign local variables to instance variables
        this.suburb = suburb;//use operator this to identify parameters to this class
        this.city = city;
        this.province = province;
    }

    //create method of this class 'staticVar'
    public void getSuburb(){

        System.out.println(suburb);
    }

    public static void main(String[] args){
        //instance variables or variables in the class are activated by values by what we send from object
        staticVar obj = new staticVar("Ferndale", "Johannesburg North", "Gauteng");
        staticVar obj1 = new staticVar("Oakdene", "Johannesburg South", "Gauteng");
        obj.getSuburb(); //print method value of this object
        obj1.getSuburb();

    }


}
