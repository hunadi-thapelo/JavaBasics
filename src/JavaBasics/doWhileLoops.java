package JavaBasics;

public class doWhileLoops {
    public static void main(String[] args)
    {

        int i = 0;
        //do-while loop is an exit control loop
        //check for the condition after executing the statements of the loop body

        do{
            System.out.println("Print statement " + i);
            i++;
        }
        while (i<6);

    }
}
