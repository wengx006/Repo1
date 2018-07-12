
public class Dynamic_solution {
	public int dynamic_swingSubsequenceLength(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int[] increase = new int[nums.length];
        int[] decrease = new int[nums.length];
        increase[0] = decrease[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                increase[i] = decrease[i - 1] + 1;
                decrease[i] = decrease[i - 1];
            } else if (nums[i] < nums[i - 1]) {
            	decrease[i] = increase[i - 1] + 1;
                increase[i] = increase[i - 1];
            } else {
            	decrease[i] = decrease[i - 1];
                increase[i] = increase[i - 1];
            }
        }
        return Math.max(decrease[nums.length - 1], increase[nums.length - 1]);
    }

}
