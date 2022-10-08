package JavaBasics;

public class StringObjectsMethod {
    public static void main(String[] args)
    {
        //Practice 1: string literal and new
        String s = "My Java";
        //String s1 = "This is a string2";

        //System.out.println(s1);

        //String s3 = new String("String using new keyword");
        //String s4 = new String("String using new keyword");

        //split method
        //String[] splittedArrayValues1 = s.split(" ");
        //System.out.println(splittedArrayValues1[0]);



        String[] splittedArrayValues2 = s.split("string");
        //System.out.println(splittedArrayValues2[0]);
        //System.out.println(splittedArrayValues2[1].trim());

        //loop through array and print characters
        //for(int i = 0; i < s.length(); i++)
        //{
            //System.out.println(splittedArrayValues1[i]);
            //System.out.println(s.charAt(i));
        //}

        //reverse - popular interview question

            for(int i = s.length()-1; i >= 0; i--)
            {
                System.out.println(s.charAt(i));
            }

    }
}
