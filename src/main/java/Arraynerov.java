public class Arraynerov {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        for (int element: reverse1(arr)){
            System.out.println(element+ " ");
        }

        //2       System.out.println(averageOfArray(arr));
//  1      System.out.println(averageOfArray(new int[]{1,1}));


    }

    public static int[] reverse1(int[] arr) {
        int[] b = new int[arr.length];

        for (int i = 0; i <arr.length; i++) {
            b[i] = arr[arr.length-i-1];
        }
        return b;
    }
}


  /*  2 public static int averageOfArray(int[] arr) {
        double max = arr[0];
        double min = arr[0];
        for (int member : arr) {
            if (member < min) {
                min = member;
            }
            if (member > max) {
                max = member;
            }
        }
        return (min + max)/2;
    }
}*/


/*  1   public static double averageOfArray(int[] arr) {
        double sum = 0;
*//*        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }*//*
        for (int element: arr) {
            sum+=element;
        }
        return sum / arr.length;
    }
}*/

