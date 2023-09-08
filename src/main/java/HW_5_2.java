import java.util.Scanner;

public class HW_5_2 {

    //Sort the given array in ascending order
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array");
        int num = scanner.nextInt();
        int a[] = new int[num];

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
    }
}



