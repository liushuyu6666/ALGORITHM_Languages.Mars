package DynamicProgramming.Matrix;

import java.util.Arrays;

public class SumOfSubmatrix {
    public int[] solution(int[][] matrix, int[][] range){
        int row = matrix.length, col = matrix[0].length;

        int[][] dp = new int[row+1][col+1];
        for(int i = 0; i < row+1; i++){
            for(int j = 0; j < col+1; j++){
                if(i > 0 && j > 0){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1] + matrix[i-1][j-1] - dp[i-1][j-1];
                }
                else {
                    dp[i][j] = 0;
                }
            }
        }

        int x1, y1, x2, y2;
        int[] ans = new int[range.length];
        for(int i = 0; i < range.length; i++){
            x1 = range[i][0]-1;
            y1 = range[i][1]-1;
            x2 = range[i][2]-1;
            y2 = range[i][3]-1;
            System.out.println(dp[x2+1][y2+1] + ", " + dp[x1][y2+1] + ", " + dp[x2+1][y1] + ", " + dp[x1][y1]);
            System.out.println("x1: " + x1 + " y1: " + y1 + " x2: " + x2 + " y2: " + y2);;
            ans[i] = dp[x2+1][y2+1] - dp[x1][y2+1] - dp[x2+1][y1] + dp[x1][y1];
        }
        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
        }
        return ans;
    }

    public static void main(String args[]){
        int[][] m = {{-587,-796,718,-834,285,-924,-34,841,-327,-570
                    },{753,-252,987,-875,-704,660,768,-483,304,8
                    },{-827,863,-135,-362,548,746,671,-887,-537,665
                    },{762,245,-616,116,735,83,-213,-633,260,-955
                    },{610,-105,670,-237,-481,-842,-629,-630,188,-365
                    },{-970,807,-78,-923,-885,792,56,-452,-352,-349
                    },{344,582,-880,-865,561,335,-726,769,-210,-216
                    },{-720,-549,266,676,272,-550,41,-763,-504,895
                    },{806,-96,-834,-84,-783,-143,-131,397,222,-571
                    },{-463,-146,989,-181,-122,747,961,-377,-808,806}};
        int[][] t = {{5,5,10,10
                    },{5,5,10,10
                    },{5,1,10,9
                    },{5,5,10,10
                    },{2,2,8,7
                    },{1,2,9,9
                    },{5,1,10,6
                    },{2,5,8,10
                    },{3,2,9,7
                    },{4,5,10,10
                    },{4,2,10,10
                    },{4,2,10,10
                    },{2,2,8,9
                    },{5,5,10,10
                    },{5,3,10,8}};
        SumOfSubmatrix sumOfSubmatrix = new SumOfSubmatrix();
        int[] ans = sumOfSubmatrix.solution(m, t);
        System.out.println(Arrays.toString(ans));
    }

}
