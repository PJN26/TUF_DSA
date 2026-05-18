//https://leetcode.com/problems/minimize-max-distance-to-gas-station/description/

class Solution {

  public int numberOfGasStationRequired(double dist, int[] arr) {
    int n = arr.length;
    int count = 0;

    for (int i = 1; i < n; i++) {
      int numberInBetween = (int) ((arr[i] - arr[i - 1]) / dist);

      if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {
        numberInBetween--;
      }

      count += numberInBetween;
    }

    return count;
  }

  public double minimiseMaxDistance(int[] arr, int k) {
    double low = 0, high = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length - 1; i++) {
      high = Math.max(high, arr[i + 1] - arr[i]);
    }

    double diff = 1e-6;

    while (high - low > diff) {
      double mid = low + (high - low) / 2.0;
      int count = numberOfGasStationRequired(mid, arr);

      if (count > k) {
        low = mid;
      } else {
        high = mid;
      }
    }
    return high;
  }
}
