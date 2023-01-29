package headFirstExcercises;

public class BeerSong {
    public static void main (String[] args)
    {
        int beerNum = 99;
        String word = "bottles";

        while(beerNum > 0){

            if(beerNum == 1)
            {
                word = "bottle";
            }

            beerNum = beerNum - 1; //original code fix - to set while boolean to false

            System.out.println(beerNum +" "+word +" of beer on the wall");
            System.out.println(beerNum+ " "+ word + " of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");

            if(beerNum > 0)
            {
                System.out.println(beerNum +" "+word +" of beer on the wall");
            } else {
                System.out.println("No more beer bottles on the wall");
            }

        }

    }
}
