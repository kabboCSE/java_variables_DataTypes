package java_learn;

public class DataTypes {

    public static void main (String[] args) {
        // Primitive Data Types
        // Syntax: variable_type variable_name = variable_value

        int number = 100;
        float number2 = 10.45F;
        double number3 = 24353533;
        char letter = 'a';
        boolean bool = true;

        System.out.println("The Number is: "+ number);
        System.out.println("The Number is: "+ number+", Float is: "+ number2);

        //Non Primitive  data types

        String name = "Shahriar";
        int[] num = {1,2,3,4,5};

        System.out.println("The Name is: "+ name);
        System.out.println("The Number is: "+ num[2]);

    }
}
