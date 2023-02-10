package coreJava;

public class MetroTraffic implements CentralTraffic {

    public static void main(String[] args)
    {
        //Create object of the class that will implement interface method/s
        CentralTraffic a = new MetroTraffic();
        a.greenGo();
        a.yellowWait();
        a.redStop();
    }

    @Override
    public void greenGo() {
        System.out.println("Green for Go implementation");
    }

    @Override
    public void yellowWait() {
        System.out.println("Yellow for Wait implementation");

    }

    @Override
    public void redStop() {
        System.out.println("Red for Stop implementation");
    }
}
