/*public class Homework_2_1 {
    public static void main(String[] args) {
        height(0);
    }
    public static void height(int height) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert side height: ");
        height = scanner.nextInt();
        int space = height - 1;
        int star = 1;

        for (int i = 1; i < height * 2; i++) {
            for (int j = space; j > 0; j--) {
                System.out.print("   ");
            }
            if (i < height) {
                space--;
            } else {
                space++;
            }
            for (int k = 0; k < star; k++) {
                System.out.print(" * ");
            }
            if (i >= height) {
                star -= 2;
            } else {
                star += 2;
            }
            System.out.println();
        }
    }
}*/

       /* Second solution
       int bardzrutyun = scanner.nextInt();
        System.out.println("Insert width" );
        int width = scanner.nextInt();
        for (int i = 0; i < bardzrutyun; i++) {
            for (int j = 0; (j < width); j++) {
                if (i >=bardzrutyun) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
*/
