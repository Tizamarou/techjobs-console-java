package demos;

import java.util.Scanner;

/**
 * Created by LaunchCode
 */
public class HelloWorld {

    public static void main(String[] args) {

        // Prompt user for input
        System.out.println("What's your name? ");

        // Get input
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        // Print a friendly message
        System.out.println("Hello, " + name + "!");
    }
}
