package headFirstExcercises;


public class PhraseOMatic {

    public static void main (String[] args)
    {
        String[] wordListOne = {"24/7","Multi-Tier", "30,000 foot", "B-to-B", "front-end", "web-based", "critical path"};
        String[] wordListTwo = {"value-added", "oriented", "positioned", "branded", "outside-the-box", "aligned", "accelerated", "networked"};
        String[] wordListThree = {"tipping-point", "architecture","core competency", "solution", "mind share", "virtual", "vision", "space","strategy"};

        //find number of words in each list
        int one = wordListOne.length;
        //System.out.println(one);

        int two = wordListTwo.length;
        //System.out.println(two);

        int three = wordListThree.length;
        //System.out.println(three);

        //generate three random numbers
        int ranOne = (int) (Math.random() * one);
        int ranTwo = (int) (Math.random() * two);
        int ranThree  = (int) (Math.random() * three);

        String phrase = wordListOne[ranOne] + " " + wordListTwo[ranTwo] + " " + wordListThree[ranThree];
        System.out.println("What we need is " + phrase);


    }
}
