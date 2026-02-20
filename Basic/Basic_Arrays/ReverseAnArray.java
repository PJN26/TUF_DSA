class Solution {
    public void reverse(int[] arr, int n) {
        for(int i =0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}

