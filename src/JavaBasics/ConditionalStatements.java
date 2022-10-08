package JavaBasics;

public class ConditionalStatements {
    public static void main(String[] args) {

        int[] arr2 = {17, 3, 90,30,11,83,44,152};

        for(int i = 0; i<arr2.length; i++)
        {
            if( arr2[i] % 2 == 0)
            {
                System.out.println(arr2[i]);
                break; //execution exits for loop at first iteration when if statement is satisfied //optimises scripting
            }
            else
            {
                System.out.println( arr2[i] + " is not a multiple of 2");
            }
        }


    }
}
