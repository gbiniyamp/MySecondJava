/*
variousVariables: a program to teach us about variables.
 */

public class MySecondJava {
    public static void main ( String [] args) {

        //declare variables ere before we us them
        int x, y, answer;
        //all three variables will be declared as integer
        double temprature;
        float Temprature;   // a float uses less memory

        String firstName, lastName;
        String question = "unknown";

        // ssign values to variable here
        x = 99;
        y = 2147483647;
        answer= 42;
        firstName = "Bini";
        lastName = "G Michael";
        temprature= 98.6;
        Temprature= 32.0f;

        //use the variables here
        System.out.println("the variable x cotains a valu of " + x );
        System.out.println( "The value " + y + " is the largest value ");
        System.out.println( " you can store in an integer." );
        System.out.println( " the answer to the question is: " + answer );
        System.out.println( " And the question has long since been " + question);
        System.out.println( " If you are not sick your temprature is: " + temprature);
        System.out.println( " If you are an ice cube your tempratre is: " + Temprature);
        System.out.println(" The variable Temprature is not " + "the same as temprature");
        System.out.println("The founder of java is " + firstName + lastName);


    }
}
