package keywords;


public class finalKeywordWithVariable {
    public static void main(String[] args){

        //important interview question
        //final is reserved keyword in java
        //can be used with variables, methods, classes

        //VARIABLE EXAMPLE
        int a = 10; //non-constant variable
        final int b = 15; //constant variable value

        System.out.println(a);
        System.out.println(b);

        //modifying the non-final variable
        a++;
        System.out.println(a);

        //modifying the final variable
        //will give compile time error
        //b++;
        //System.out.println(b);

    }
}
