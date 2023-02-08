package coreJava;

public class InvertedTriangle2 {

    public static void main(String[] args)
    {
        //Loop to run 4 times:
        //1
        //1 2
        //1 2 3
        //1 2 3 4

        for(int y=1;y<5;y++)//controls number of rows
        {
            for(int z=1;z<=y;z++)//controls number of times loop will process logic inside inner loop
            {
                System.out.print(z);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
