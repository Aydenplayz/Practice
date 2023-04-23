package day12;
//Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number
import java.util.InputMismatchException;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Please input a number: ");
            int num = s.nextInt();

            if(num < 2) {
                System.out.println("You must input an integer >= 2");
            }
            else {
                for(int i = 2; i < num; i++) {
                    int r = num % i;

                    if(r == 0) {
                        System.out.println(num + " is not a prime number");
                        return;
                    }
                }
                System.out.println(num + " is a prime number");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("You must input an integer");
        }
    }
}
