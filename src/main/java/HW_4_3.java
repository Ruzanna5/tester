import java.util.Scanner;

public class HW_4_3 {


    public static void main(String[] args) {
    }

    public static int reverseRecursion(int num) {
        if (num < 10) {
            return num;
        }
        int i = 1;
        while (i <= num / 10) {
            i *= 10;
        }
        return (num % 10) * i + reverseRecursion( num / 10);
    }
}

