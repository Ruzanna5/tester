public class HW_5_3 {
    public static void main(String[] args) {
        int[] a = {4, -9, 5, 3, 4};
        int[] b = {0, -9, 4, 0, 1};
        intersection(a, b);
    }

    public static boolean IsInArray(int[] array, int index) {
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (array[index] == array[i]) {
                count++;
            }
            if (count == 1) {
                return false;
            }
        }
        return true;
    }

    public static void intersection(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int y : b) {
                if (a[i] == y && IsInArray(a, i)) {
                    System.out.println(a[i] + " ");
                    break;
                }
            }

        }

    }
}
