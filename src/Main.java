import java.util.Scanner;
import java.util.Random;

// SLOT MACHINE!!!!!!

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("$$$$$$$$$$$$$$$$");
        System.out.println("WELCOME TO SLOTS");
        System.out.println("$$$$$$$$$$$$$$$$\n");

        System.out.print("Enter your balance: ");
        double balance = scanner.nextDouble();
        boolean playAgain = true;
        double bet;
        char symbols[] = {'$','#','@','*','%'};
        char row[] = new char[3];

        while (balance > 0 && playAgain) {
            do {
                System.out.print("Enter bet amount: ");
                bet = scanner.nextInt();
            } while (bet < 0 || bet > balance);
            balance -= bet;
            for(int i = 0; i < 3; i++) {
                row[i] = symbols[random.nextInt(symbols.length)];
            }
            for (char x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
            if (row[0] == row[1] && row[0] == row[2]) {
                System.out.println("YOU WIN");
                balance += (bet * 100);
            }
            System.out.println("Your new balance is: $" + balance);
            if (balance == 0) {
                System.out.println("YOU RAN OUT OF MONEY");
                break;
            }
            char input;
            System.out.println("Would you like to play again? (y/n)");
            input = scanner.next().charAt(0);
            if (input == 'n') {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
