import java.util.HashMap;

public class LongestSubarraySumK {

    public static int longestSubarray(int[] arr, int k) {
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: subarray starts from index 0
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Case 2: subarray starts after index 0
            int need = sum - k;
            if (map.containsKey(need)) {
                maxLen = Math.max(maxLen, i - map.get(need));
            }

            // Store first occurrence of prefix sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;

        int result = longestSubarray(arr, k);
        System.out.println("Longest subarray length with sum " + k + " = " + result);
    }
}