public class RecursiveMethod {
    public static void main(String[] args) {
        recursiveMethod(0);
    }

    public static void recursiveMethod(int i) {

            System.out.println(i);
            i++;
            if (i<10)
            {
                recursiveMethod(i);
            }
        }
    }

