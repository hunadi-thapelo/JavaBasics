package JavaBasics;

public class RemoveWhiteSpaces {

    public static void main(String[] args){

        String str = "   Na  le d   i";
        String newStr = str.replaceAll("\\s", "");
        String trimmedString = newStr.trim();

        System.out.println("Original String: " + str);
        System.out.println("After removing white spaces: "+ newStr);
        System.out.println("After removing leading spaces: "+ trimmedString);
    }
}
