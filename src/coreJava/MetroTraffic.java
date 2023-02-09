package coreJava;

public class MetroTraffic implements CentralTraffic {

    public static void main(String[] args)
    {
        //Create object of the class that will implement interface method/s
        CentralTraffic a = new MetroTraffic();
        a.GreenGo();
        a.YellowWait();
        a.RedStop();
    }

    @Override
    public void GreenGo() {
        System.out.println("Green for Go implementation");
    }

    @Override
    public void YellowWait() {
        System.out.println("Yellow for Wait implementation");

    }

    @Override
    public void RedStop() {
        System.out.println("Red for Stop implementation");
    }
}
