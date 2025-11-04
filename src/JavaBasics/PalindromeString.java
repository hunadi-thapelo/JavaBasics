package JavaBasics;

public class PalindromeString {

    public static void main (String[] args){
        //Palindrome String is a string that remains the same when its characters are reversed

        //1. Declare our String variable
        String str = "LeveL";

        //2. Declare null String to store the reversed string
        String reversedStr = "";
        char ch;

        //3. For Loop: to iterate original string and store char in reverse string variable
        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            reversedStr = ch + reversedStr;
        }

        //4. If statement -- return True is both variables are the same
        if(str.equalsIgnoreCase(reversedStr)){
            System.out.println(str + " is a palindrome string");
        } else{
            System.out.println(str + " is NOT a palindrome string");
        }

    }
}
