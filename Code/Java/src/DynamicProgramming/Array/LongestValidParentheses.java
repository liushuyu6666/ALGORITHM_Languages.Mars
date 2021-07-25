package DynamicProgramming.Array;

public class LongestValidParentheses {
    public int solution(String s) {
        int ans = 0;
        int[] dp = new int[s.length()];
        if(s.length() < 2) return 0;
        dp[0] = 0;
        if(s.charAt(0) == '(' && s.charAt(1) == ')'){
            dp[1] = 2;
            ans = 2;
        }
        else{
            dp[1] = 0;
        }

        int pos;
        for(int i = 2; i < s.length(); i++){
            if(s.charAt(i) == '('){
                dp[i] = 0;
            }
            else if(s.charAt(i) == ')'){
                if(s.charAt(i-1) == '('){
                    dp[i] = dp[i-2] + 2;
                    ans = Math.max(ans, dp[i]);
                }
                else{
                    pos = i - dp[i-1] - 1;
                    if(pos >= 0 && s.charAt(pos) == '('){
                        dp[i] = dp[i-1] + 2;
                        ans = Math.max(ans, dp[i]);
                        if(pos - 1 >= 0){
                            dp[i] += dp[pos-1];
                            ans = Math.max(ans, dp[i]);
                        }
                    }
                    else{
                        dp[i] = 0;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        System.out.println(longestValidParentheses.solution(")()())"));
    }
}
