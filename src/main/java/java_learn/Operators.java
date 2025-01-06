package java_learn;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Enter 1st number: ");
        Scanner num1 = new Scanner(System.in);
        int a = num1.nextInt();

        System.out.println("Enter 2nd number: ");

        Scanner num2 = new Scanner(System.in);
        int b = num2.nextInt();

        System.out.println("The sum is : "+ a+b);
    }
}
