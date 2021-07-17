package Array;

import java.util.*;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums){
        Set<List<Integer>> set = new HashSet<>();
        if(nums.length < 3) return new ArrayList<>(set);
        List<Integer> ele = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0, left, right;
        while(i < nums.length && nums[i] <= 0){
            left = i + 1;
            right = nums.length - 1;
            while(left < right){
                if(nums[i] + nums[left] + nums[right] == 0){
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    do{
                        left++;
                    } while(left < nums.length && nums[left] == nums[left - 1]);
                    do{
                        right--;
                    } while (right > i && nums[right] == nums[right + 1]);
                }
                else if(nums[i] + nums[left] + nums[right] > 0){
                    do{
                        right--;
                    } while (right > i && nums[right] == nums[right + 1]);
                }
                else{
                    do{
                        left++;
                    } while(left < nums.length && nums[left] == nums[left - 1]);
                }
            }
            do {
                i++;
            }while(i < nums.length && nums[i] == nums[i-1]);
        }
        return new ArrayList<>(set);
    }

    public static void main(String args[]){
        int[] nums = new int[]{0, 0, 0};
        Sum3 sum3 = new Sum3();
        System.out.println(sum3.threeSum(nums));
    }
}
