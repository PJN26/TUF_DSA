class BubbleSort {
    public int[] bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            boolean isSwap = false;
            for(int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j+1] < nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    isSwap = true;
                }
            }
            if(isSwap) {
                break;
            }
        }
        return nums;
    }
}