package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HauntedRoom {
    int matrixElementsSum(int[][] matrix) {
        boolean[] noHaunted = new boolean[matrix[0].length];
        Arrays.fill(noHaunted, true);
        int total = 0;
        // System.out.print(noHaunted);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    noHaunted[j] = false;
                }
                else if(noHaunted[j]){
                    total += matrix[i][j];
                }
            }
        }
        return total;
    }
    public static void main(String args[]){
        HauntedRoom hauntedRoom = new HauntedRoom();
        int ans = hauntedRoom.matrixElementsSum(
                new int[][]{{0, 1, 1, 2}, 
                            {0, 5, 0, 0}, 
                            {2, 0, 3, 3}});
        System.out.println(ans);
    }
}
