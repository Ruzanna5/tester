import java.util.Scanner;

public class HW_3_1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number");
            int number = scanner.nextInt();
            int reversedNumber = 0;
            while (number!=0)
            { int mnacord = number%10;
                reversedNumber = reversedNumber*10+mnacord;
                number /= 10;
        }
        System.out.println("The reversed number is :  "+ reversedNumber);

    }
}

