import java.util.Arrays;
import java.util.Scanner;

public class HW_5_1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array 1: ");
        int num = scanner.nextInt();
        int a[] = new int[num];
        System.out.println("Enter length of array 2: ");
        int number = scanner.nextInt();
        int b[] = new int[number];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter your " + (i + 1) + " element");
            a[i] = scanner.nextInt();
        }

        int temporary = 0;

        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (a[i] > a[j]) {
                    temporary = a[i];
                    a[i] = a[j];
                    a[j] = temporary;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + ", ");
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Enter your " + (i + 1) + " element");
            b[i] = scanner.nextInt();
        }

        int temp = 0;

        for (int i = 0; i < number; i++) {
            for (int j = i + 1; j < number; j++) {
                if (b[i] > b[j]) {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.print(b[i] + ", ");
        }

        boolean[] arr = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    arr[i] = true;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}



