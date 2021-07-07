import java.util.Arrays;

class FountainCoverage{
    public int Solution(int[] fountain){
        int[] dp = new int[fountain.length];
        Arrays.fill(dp, -1);
        for(int i = 0; i < fountain.length; i++){
            if(i - fountain[i] >= 0){
                dp[i - fountain[i]] = Math.max(dp[i - fountain[i]], i + fountain[i] + 1);
            }
        }

        int cnt = 1, rightRange = dp[0], nextRange = 0;
        for(int i = 0; i < dp.length; i++){
            nextRange = Math.max(nextRange, dp[i]);
            if(rightRange == i){
                cnt++;
                rightRange = Math.max(nextRange, i);
                nextRange = i;
            }
        }
        return cnt;
    }

    public static void main(String args[]){
        FountainCoverage fountainCoverage = new FountainCoverage();
        int f[] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int cnt = fountainCoverage.Solution(f);
        System.out.println(cnt);
    }
}