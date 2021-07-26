package MonotoneStack;

import java.util.Stack;

public class TrappingRainWater {
    public int solution(int[] height){
        Stack<Integer> stack = new Stack();
        int left, middleHeight = 0, ans = 0;
        for(int i = 0; i < height.length; i++){
            while(!stack.isEmpty() && height[stack.peek()] <= height[i]){
                left = stack.pop();
                ans += (height[left] - middleHeight) * (i - left - 1);
                middleHeight = height[left];
            }
            if(!stack.isEmpty()){
                ans += (height[i] - middleHeight) * (i - stack.peek() - 1);
            }
            stack.push(i);
        }
        return ans;
    }
    public static void main(String args[]){
        TrappingRainWater rainWater = new TrappingRainWater();
        System.out.println(rainWater.solution(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
