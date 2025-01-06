package java_learn;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
         System.out.println("My name is: "+name);
       System.out.println("Enter age Plz");
         double age = input.nextDouble();

        System.out.print("My age is: "+age);
    }
}
