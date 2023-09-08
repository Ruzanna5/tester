import java.util.Scanner;

public class HW_3_2 {
    public static void main(String[] args) {
        int number;
        boolean harc;
        int positiveNumbers=0;
        int negativeNumbers=0;
        int zeros=0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            number = scanner.nextInt();

            if (number > 0) {
                positiveNumbers++;
            } else if (number < 0) {
                negativeNumbers++;
            } else {
                zeros++;
            }
            System.out.println("Do you want to continue");
            harc = scanner.nextBoolean();

        } while (harc);
        System.out.println("Positive = " + positiveNumbers);
        System.out.println("Negative = " + negativeNumbers);
        System.out.println("Zeros = " + zeros);
    }
}
