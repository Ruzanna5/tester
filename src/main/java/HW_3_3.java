import java.util.Random;
import java.util.Scanner;

public class HW_3_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input lower bound :");
        int lowerBound = scanner.nextInt();
        System.out.println("Input upper bound : ");
        int upperBound = scanner.nextInt();
        int randomDigit = random.nextInt(lowerBound, upperBound);
        int enteredNumber;
        System.out.println("Guess the number");
        do {
            enteredNumber = scanner.nextInt();
            if (enteredNumber < randomDigit) {
                System.out.println("Too low, try again");
            } else if (enteredNumber > randomDigit) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Du demq es");
            }
        }
        while (enteredNumber != randomDigit);

    }
}
