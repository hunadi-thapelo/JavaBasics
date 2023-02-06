package coreJava;

public class NestedLoops {

    public static void main(String[] args) {
        // 5
        //-1
        int k = 1;
        for (int a=0; a<4; a++)
        {
            System.out.println("");
            for(int b =1; b<5-a; b++)
            {
                //loop
                System.out.print(k);
                System.out.print(" ");
                k++;
            }

        }

    }
}
