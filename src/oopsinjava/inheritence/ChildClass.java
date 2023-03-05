package oopsinjava.inheritence;

public class ChildClass extends ParentClass{ //childclass inherits parentclass methods

    public void camera(){

        System.out.println("new hd camera (from child class)");
    }

    public void captureScreen(){

        System.out.println("child capture screen implementation");
    }

    public static void main(String[] args) {

        ChildClass cc = new ChildClass();
        System.out.println(cc.label);
        cc.answerCall();
        cc.camera();
        cc.captureScreen(); //method override implemented //output from child class
                            //give preference to local captureScreen method only
    }

}
