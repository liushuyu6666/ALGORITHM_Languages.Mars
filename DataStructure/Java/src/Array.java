import java.util.*;

public class Array {
    public static void main(String args[]){
        // 1, new
        int[] arrInt1 = new int[]{1, 3, 2, 5, 4};
        int[] arrInt2 = new int[5];
        int[] copyOfInt2;
        System.out.println("1.1: " + Arrays.toString(arrInt1));
        System.out.println("1.2: " + Arrays.toString(arrInt2));

        // 2, get
        System.out.println("2.1: " + arrInt1[3]);

        // 3, update
        arrInt1[3] = 100;
        System.out.println("3.1: " + arrInt1[3]);

        // 4, copy
        copyOfInt2 = Arrays.copyOf(arrInt1, 2);
        System.out.println("4.1: " + Arrays.toString(copyOfInt2));
        copyOfInt2 = Arrays.copyOfRange(arrInt1, 1, 3);
        System.out.println("4.2: " + Arrays.toString(copyOfInt2));

        // 5, print
        System.out.println("5.1: " + Arrays.toString(copyOfInt2));

        // 6, sort
        Arrays.sort(arrInt1, 2, 4); // toIndex is exclusive
        System.out.println("6.1: " + Arrays.toString(arrInt1));
        Arrays.sort(arrInt1); // sort in ascending
        System.out.println("6.2: " + Arrays.toString(arrInt1));

        // in order to sort descending, convert primitive type to Integer
        Integer[] arrInteger1 = new Integer[arrInt1.length];
        for(int i = 0; i < arrInt1.length; i++){
            arrInteger1[i] = arrInt1[i];
        }
        Arrays.sort(arrInteger1, Collections.reverseOrder());
        System.out.println("6.3: " + Arrays.toString(arrInteger1));

        // 7, convert, for loop always work
        // to List
        List<Integer> listInteger = Arrays.asList(arrInteger1);
        System.out.println("7.1: " + listInteger);
        // to set
        Set<Integer> setInteger = new HashSet<>(Arrays.asList(arrInteger1));
        System.out.println("7.2: " + setInteger);


    }
}
