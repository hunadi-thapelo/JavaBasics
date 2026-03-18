package angelaCodePractices;

import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numInput = scan.nextInt();
        boolean isPrime = true; // Assume that the number is a prime initially

        //1. Handle special cases: numbers <= 1 are not prime
        if (numInput <=1){
            isPrime = false;
        } else {
            // 2. Check for factors from 2 up to the square root of num
            // The loop condition 'i * i <= num' is an efficient way to check up to the square root
            for (int i = 2; i * i <= numInput; i++){
                 if (numInput % i == 0){
                     // If any number divides num evenly, it's not prime
                     isPrime = false;
                     break; // Exit the loop as soon as a factor is found
                 }
            }
        }

        if (isPrime){
            System.out.println(numInput + " is a prime number");
        } else {
            System.out.println(numInput + " is not a prime number");
        }
        scan.close();  // Close the scanner resource
    }
}
