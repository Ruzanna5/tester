public class ForArray {
    public static void main(String[] args) {
        int[] array10 = {1,-2,-3,40,};
        for (int element : array10) {
            if (element < 0 ) {
                System.out.println("Ayo");
                break;
            }
        }
    }
}
