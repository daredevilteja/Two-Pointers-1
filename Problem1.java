// Time Complexity : O(n) where n is the length of the input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        int i = 0, j = nums.length - 1, k = 0;
        while (k <= j) {
            if (nums[k] == 0) {
                swap(i, k, nums);
                i += 1;
                k += 1;
            } else if (nums[k] == 2) {
                swap(k, j, nums);
                j -= 1;
            } else {
                k += 1;
            }
        }
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}