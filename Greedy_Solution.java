
public class Greedy_Solution {
	public int greedy_swingSubsequenceLength(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int current = nums[1] - nums[0];
        int count = current != 0 ? 2 : 1;
        for (int i = 2; i < nums.length; i++) {
            int diff = nums[i] - nums[i - 1];
            if ((diff > 0 && current <= 0) || (diff < 0 && current >= 0)) {
                count++;
                current = diff;
            }
        }
        return count;
    }

}
