package leetcode;


public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }

    private static int removeDuplicates(int[] nums){
        int left = 0;
        for (int right = 0; right < nums.length - 1; right++) {
            if (nums[right] != nums[right+1]){
                left++;
                nums[left] = nums[right+1];
            }
        }
        return left+1;
    }
}
