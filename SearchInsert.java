public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(target == nums[i]) {
                return i;
            }
        }

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > target && target > nums[i-1]) {
                return i;
            }
        }

        if(target > nums[nums.length-1]) {
            return nums.length;
        } else if(target < nums[0]) {
            return -1;
        } else return -69;
    }
}
