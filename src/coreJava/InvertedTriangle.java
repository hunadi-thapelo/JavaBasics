package coreJava;

public class InvertedTriangle {

    public static void main (String[] args)
    {
        //Loop to run 4 times:
        //1
        //2 3
        //4 5 6
        //7 8 9 10

        int k = 1;
        for(int i=0; i<4;i++) //outer loop: 4 because loop to run 4 times
        {
            for(int j=0; j<=i;j++) //inner loop: j<=i because at same loop run - to start print triangle
            {
                System.out.print(k);
                System.out.print(" ");
                k++; //1st loop k=1...increments to 2 in second loop(outer loop)
            }
            System.out.println(" ");//to move to next row/ line
        }
    }

}
