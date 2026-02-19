class Solution {
    public int secondLargestElement(int[] nums) {
        if(nums.length < 2) {
            return-1;
        }
        int largest = nums[0];
        int slargest = Integer.MIN_VALUE;
        boolean isSlargest = false;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > largest) {
                slargest = largest;
                largest = nums[i];
                isSlargest = true;
            }
            else if(nums[i] < largest && nums[i] > slargest) {
                slargest = nums[i];
                isSlargest = true;
            }
            else if(slargest == nums[i]) {
                isSlargest = true;
            }
        }
        if(isSlargest) {
            return slargest;
        }
        else {
            return -1;
        }
    }
}