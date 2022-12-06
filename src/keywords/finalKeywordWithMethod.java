package keywords;

class finalKeywordWithMethod {
    final void myMethod() {} //final method

    public static void main(String[] args){}
}
    //class MM extends finalKeywordWithMethod {

        // We get compile time error
        // since can't extend myMethod since it is final
        //void myMethod() {}
    //}

//important interview question
//final is reserved keyword in java
//can be used with variables, methods, classes
//final methods prevents method overriding

