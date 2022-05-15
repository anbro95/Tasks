import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        if(nums.length == 1) {
            return nums[0];
        }

        if(nums[nums.length-1] != nums[nums.length-2]) {
            return nums[nums.length-1];
        }

        if(nums[0] != nums[1]) {
            return nums[1];
        }

        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1] && nums[i] != nums[i-1]) {
                return nums[i];
            }
        }


        return -1;

    }
}
