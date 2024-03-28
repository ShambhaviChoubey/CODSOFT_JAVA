import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Min = 1, Max = 100;
        int randomNumber = ThreadLocalRandom.current().nextInt(Min, Max + 1);
        int userGuess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + Min + " and " + Max + ". Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;
            if (attempts > 10) {
                System.out.println("Sorry,you have exceeded the limit! better luck next time!");
                break;
            }
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }

        } while (true);

        scanner.close();
    }
}
