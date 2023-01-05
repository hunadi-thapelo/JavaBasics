package JavaBasics;

public class StringInteger {
    public static void main(String[] args){


        String s,reverse, digit;
        s = "3";
        reverse = "My String";
        digit = "Melody 47";


        //Convert string to integer
        System.out.println(Integer.parseInt(s) + 6);

        //String with integer and we want to grab the digit
        digit = digit.replaceAll("\\D+", "");
        int digit1 = Integer.parseInt(digit);
        System.out.println(digit1 + 3);


        //Print String in reverse
        for(int i = reverse.length()-1; i >=0; i--){
            System.out.println(reverse.charAt(i));
        }



    }
}
