import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Quickmaths {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input, first number: ");
        int userInput1 = input.nextInt();
        System.out.println("Please input, second number: ");
        int userInput2 = input.nextInt();

        /** calls start method, which contains sum and average*/
        start(userInput1, userInput2);



    }
    /** average method takes average of the 2 inputted numbers*/
    public static int average(int userInput1, int userInput2) {

        int averageResult = (userInput1 + userInput2) / 2;



        return averageResult;

    }
    /**sum method, finds the sum of userInput1 and userInput2*/
    public static int sum(int userInput1, int userInput2) {

        int sumResult = (userInput1 + userInput2);

        return sumResult;
    }
    /**Start method, takes the sum and average and runs the loop 10 times */
    public static void start(int userInput1, int userInput2) {

        /** Runs loop 10 times */
        for (int i = 0; i < 10; i++) {

            System.out.println("The average of input numbers "+ "= " + average(userInput1, userInput2));
            System.out.println("The sum of input numbers " + "= " + sum(userInput1, userInput2));

        }

    }

    //TODO Klassediagram + Tests

}
