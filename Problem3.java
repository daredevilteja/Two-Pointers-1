// Time Complexity : O(n) where n is the length of the input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, max = Integer.MIN_VALUE, temp = 0;
        while (i < j) {
            if (height[i] < height[j]) {
                temp = height[i] * (j - i);
                i += 1;
            } else {
                temp = height[j] * (j - i);
                j -= 1;
            }
            max = Math.max(max, temp);
        }
        return max;
    }
}