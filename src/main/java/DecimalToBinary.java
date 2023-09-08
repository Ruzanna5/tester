import java.sql.SQLOutput;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert any decimal number: ");
        int a = scanner.nextInt();
        System.out.println(convertToBinary(a));
    }

    public static int convertToBinary(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return i % 2 + convertToBinary(i / 2) * 10;

    }
}

