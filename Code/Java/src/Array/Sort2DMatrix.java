package Array;

import java.util.Arrays;

public class Sort2DMatrix {
    public int[][] accordingTheSecondColumn(int[][] arrays){
        Arrays.sort(arrays, (a, b) -> Integer.compare(a[1], b[1]));
        return arrays;
    }
    public int[][] advancedSecondColumn(int[][] arrays){
        Arrays.sort(arrays, (a, b) -> {
            if(Integer.compare(a[1], b[1]) != 0){
                return Integer.compare(a[1], b[1]);
            }
            else{
                return Integer.compare(a[0], b[0]);
            }
        });
        return arrays;
    }

    public static void main(String args[]){
        int[][] arr = new int[][]{{3, 1}, {9 ,4}, {6, 0}, {2, 1}};
        Sort2DMatrix sort2DMatrix = new Sort2DMatrix();
        int[][] arr1 = sort2DMatrix.accordingTheSecondColumn(arr);
        int[][] arr2 = sort2DMatrix.advancedSecondColumn(arr);
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.toString(arr1));
    }
}
