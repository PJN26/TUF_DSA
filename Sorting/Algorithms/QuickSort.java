class Solution {
    public int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;

        while(i < j) {
            while(nums[i] <= pivot && i <= high - 1) {
                i++;
            }

            while(nums[j] > pivot && j >= low + 1) {
                j--;
            }

            if(i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
            nums[low] = nums[j];
            nums[j] = temp;
        return j;
    }
    public void quickSortHelper(int[] nums, int low, int high) {
        if(low < high) {
            int pIndex = partition(nums, low, high);
            quickSortHelper(nums, low, pIndex - 1);
            quickSortHelper(nums, pIndex + 1, high);
        }
    }
    public int[] quickSort(int[] nums) {
        quickSortHelper(nums, 0, nums.length - 1);
        return nums;
    }
}