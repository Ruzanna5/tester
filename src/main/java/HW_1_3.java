/*
import java.util.Scanner;

public class Homework_1_3 {
    */
/*public static int main(String[] args) {
        public static int greatestDivisor() {*//*

            Scanner scanner = new Scanner(System.in);

            System.out.print("Insert first number: ");
            int one = scanner.nextInt();

            System.out.print("Insert second number: ");
            int two = scanner.nextInt();

            if (one < 0) {
                one *= -1;
            }
            if (two < 0) {
                two *= -1;
            }


            if (one == 0 && two != 0) {
                return two;
            }
            if (two == 0 && one != 0) {
                return one;
            }


            int greatestDivisor = 1;

            int minimum;


            if (one < two) {
                minimum = one;
                if (two % one == 0) {
                    return one;
                }
            } else {
                minimum = two;
                if (one % two == 0) {
                    return two;
                }
            }

            for (int i = minimum / 2; i > 1; i--) {
                if (one % i == 0 && two % i == 0) {
                    greatestDivisor = i;
                    return greatestDivisor;
                }
            }
            return greatestDivisor;
        }
    }
}

*/
