package DynamicProgramming.Array;

public class TrappingRainWater {
    public int solution(int[] height){
        if(height.length < 1) return 0;
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        leftMax[0] = height[0];
        rightMax[height.length-1] = height[height.length-1];

        // fill the leftMax
        for(int i = 1; i < height.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        // fill the rightMax
        for(int i = height.length - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        int ans = 0;
        for(int i = 0; i < height.length; i++){
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;
    }
    public static void main(String args[]){
        int[] height = new int[]{4,2,0,3,2,5};
        TrappingRainWater rainWater = new TrappingRainWater();
        System.out.println(rainWater.solution(height));
    }
}
