package miscellaneous;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class HandlingURLEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String str1 = "903&redirect_uri=https%3A%2F%2Fsaudiam%2Ehandlingstring%2Ecom%2F_forms%2Fdefualt";

        //URL decoding of special characters in str1
        //The first one is the safe encoding: the second is not, and therefore does not work
        String s1 = URLDecoder.decode(str1, StandardCharsets.ISO_8859_1);
        System.out.println(s1);
        String s2 = URLDecoder.decode(str1, StandardCharsets.UTF_8);
        System.out.println(s2);
        String s3 = URLDecoder.decode(str1, StandardCharsets.UTF_8);
        System.out.println(s3);


    }
}
