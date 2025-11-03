package JavaBasics;

public class ReverseString {

    public static void main(String[] args){

        //Reverse string without using built-in Java functions

        //1. Declare our String variable
        String str = "November";

        //2. Convert String to Char Array - data structure used to store a sequence of characters
        char[] arr = str.toCharArray();

        //3. Declare null String to store the reversed Original string
        String reversedStr = "";

        //Create a For Loop to stored reversed characters in reversed String Variable
        for(int i = arr.length-1; i >=0; i--){

            reversedStr += arr[i];
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: "+ reversedStr);
    }

}
