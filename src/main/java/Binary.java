import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your number");
        int a = scanner.nextInt();
        int[] arr1 = new int[a];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 10;
            System.out.println(arr1[i] + " ");
        }
        System.out.println();
        int num = scanner.nextInt();
        binaryBySearchElement(arr1, 0, arr1.length - 1, num);

    }

    public static int binaryBySearchElement(int[] arr1, int start, int end, int num) {
        while (end > start + 1) {
            int mid = (start + end) / 2;
            if (arr1[end + start] / 2 == num) {
                return mid;
            } else if (arr1[mid] < num) {
                return binaryBySearchElement(arr1, mid + 1, end, num);}
                else if (arr1[mid] < num) {
                return binaryBySearchElement(arr1, mid + 1, end, num);}
                else if (arr1[mid]>num){
                    return binaryBySearchElement(arr1, start, mid - 1, num);
                }

            }
        return -1;
    }
}
