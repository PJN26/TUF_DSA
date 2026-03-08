import java.util.*;;

class Solution {
    public void merge(int[] nums, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high) {
            if(nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            }
            else {
                temp.add(nums[right]);
                right++;
            }
        }

        while(left <= mid) {
            temp.add(nums[left++]);
        }

        while(right <= high) {
            temp.add(nums[right++]);
        }

        for(int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }

    public void ms(int[] nums, int low, int high) {
        if(low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;

        ms(nums, low, mid);
        ms(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public int[] mergeSort(int[] nums) {
        ms(nums, 0, nums.length - 1);
        return nums;
    }
}