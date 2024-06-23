import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a random object to generate a random number
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        
        // Variable to store the user's guess
        int userGuess = 0;
        
        // Welcome message
        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have generated a random number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        
        // Loop until the user guesses the correct number
        while (userGuess != randomNumber) {
            // Prompt the user for their guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            
            // Compare the user's guess to the random number
            if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
