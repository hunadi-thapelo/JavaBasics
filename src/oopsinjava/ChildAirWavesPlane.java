package oopsinjava;

public class ChildAirWavesPlane extends ParentAirCraft{

    public static void main(String[] args) {

        ChildAirWavesPlane awp = new ChildAirWavesPlane();
        awp.planeColour();
        awp.engine();
        awp.planeSafety();
    }

    @Override
    public void planeColour() {
        System.out.println("Red is AirWaves aircraft colour");
    }
}
