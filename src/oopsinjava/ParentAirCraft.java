package oopsinjava;

public abstract class ParentAirCraft {

    public void engine()
    {
        System.out.println("Follow engine guidelines");
    }

    public void planeSafety()
    {
        System.out.println("Follow safety guidelines");
    }

    public abstract void planeColour(); //mandatory plane has colour but colour of plane if unknown hence abstract method

}
