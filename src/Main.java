import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randInt = random.nextInt(1, 1001);

        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-1000");
        int guess;
        int attempts = 0;
        do {
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            if (guess > randInt) {
                System.out.println("Lower!");
            }
            else if (guess < randInt) {
                System.out.println("Higher!");
            }
            attempts++;
        } while (guess != randInt);

        System.out.println("You won in " + attempts + " attempts!");
    }
}
