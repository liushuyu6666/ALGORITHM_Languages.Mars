package DynamicProgramming.StringMatching;

import java.util.Arrays;

public class EditDistance {
    public int minDistance(String word1, String word2) {
        if(word1.length() < 1) return word2.length();
        if(word2.length() < 1) return word1.length();
        int row = word1.length() + 1, col = word2.length() + 1;
        int diagonal, left, above;
        int[][] dp = new int[row][col];
        // init the matrix
        for(int i = 1; i < row; i++){
            dp[i][0] = i;
        }
        for(int j = 1; j < col; j++){
            dp[0][j] = j;
        }
        dp[0][0] = 0;

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                above = dp[i-1][j] + 1;
                left = dp[i][j-1] + 1;
                diagonal = (word1.charAt(i-1) == word2.charAt(j-1))? dp[i-1][j-1]:dp[i-1][j-1]+1;
                dp[i][j] = Math.min(Math.min(above, left), diagonal);
            }
        }
//        System.out.println(Arrays.deepToString(dp));
        return dp[row-1][col-1];
    }
    public static void main(String args[]){
        EditDistance editDistance = new EditDistance();
        System.out.println(editDistance.minDistance("intention", "execution"));
    }
}
