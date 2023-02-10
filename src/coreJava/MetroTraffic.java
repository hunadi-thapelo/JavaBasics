package coreJava;

public class MetroTraffic implements CentralTraffic,NationalTraffic {

    public static void main(String[] args)
    {
        //Create object of the class that will implement interface method/s
        CentralTraffic a = new MetroTraffic();
        a.greenGo();
        a.yellowWait();
        a.redStop();

        NationalTraffic nt = new MetroTraffic(); //object of class to implement second interface
        nt.tollGateSign();

        MetroTraffic mt = new MetroTraffic(); //object of class to implement methods that belong to the class and not interface
        mt.crossingLine();

    }

    public void crossingLine()
    {
        System.out.println("Cross line implementation");
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

    @Override
    public void tollGateSign() {
        System.out.println("Toll gate sign implementation");
    }

}
