package JavaBasics;

public class ForLoops {
    public static void main(String[] args) {
        //our first array
        int[] arr = new int[3];
        arr[0] = 120;
        arr[1] = 130;
        arr[2] = 140;

        //our second array
        int[] arr2 = {90,30,110,83,44,152};

        //we use a FOR LOOP to iterate the elements in our array
        //for (int j = 0; j<arr.length;  j++)
        //{
        //    System.out.println(arr[j]);
        //}


        //int[] arr2 = {90,30,110,83,44,152};

        //for(int i = 0; i<arr2.length; i++)
        //{
            //    System.out.println(arr2[i]);
        //}


        //enhanced FOR LOOP statement

        String[] name = {"Koketso", "Kgoshi", "Kea", "Rakgadi"};

        for( String a: name){

            System.out.println(a);
        }



    }
}
