import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a time (s): ");
        int duration = scanner.nextInt();
        while (duration != 0) {
            System.out.println(duration);
            duration--;
            Thread.sleep(1000);
        }

        System.out.println("TIMER IS OVER");

        scanner.close();
    }
}
