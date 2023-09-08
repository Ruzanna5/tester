import java.util.Scanner;

public class HW_4_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = fib(a);
        System.out.println(fib(a));
    }
    public static int fib(int a){
        if (a <= 2){
            return a-1;
        } else {
            return fib(a-1)+fib(a-2);
        }

    }
}
