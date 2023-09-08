import java.util.Scanner;

public class KentZuyg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yourNumber;
        for (int i = 0; true; i++) {
            System.out.println("Please enter number: ");
            yourNumber = scanner.nextInt();

            if (yourNumber == 0) {
                System.out.println("Quit");
                break;
            }
            if (yourNumber % 2 != 0) {
                continue;
            } else {
                System.out.println("Even number: " + yourNumber);
            }

        }
    }
}
