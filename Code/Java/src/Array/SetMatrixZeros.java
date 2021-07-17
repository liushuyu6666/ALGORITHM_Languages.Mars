package Array;

import java.util.Arrays;

public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        boolean row = false, col = false, origin = false;
        if(matrix[0][0] == 0) origin = true;
        for(int i = 1; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                col = true;
                break;
            }
        }
        for(int j = 1; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                row = true;
                break;
            }
        }
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j < matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j = 1; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                for(int i = 1; i < matrix.length; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        if(col){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        if(row){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
        if(origin){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
            for(int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
    }
    public static void main(String args[]){
        int[][] matrix1 = new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        SetMatrixZeros setMatrixZeros = new SetMatrixZeros();
        setMatrixZeros.setZeroes(matrix1);
        for(int i = 0; i < matrix1.length; i++){
            System.out.println(Arrays.toString(matrix1[i]));
        }
    }
}
