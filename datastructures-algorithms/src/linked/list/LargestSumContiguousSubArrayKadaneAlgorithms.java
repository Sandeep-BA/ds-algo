package linked.list;

/**
 * Created by Sandeep Belgavi on 7/1/2021
 */
public class LargestSumContiguousSubArrayKadaneAlgorithms {
    public static void main(String[] args) {
        System.out.println("Kadane's Algorithm");
        System.out.println("Finding out the Maximum contiguous Sub Array ==>");
        int[] array = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        // Max sub array sum ==> 7
        kadaneAlgorithmMaxSumContiguousSubArray(array);

    }

    static int kadaneAlgorithmMaxSumContiguousSubArray(int[] array) {
        int arrayLength = array.length;
        int subArraySum = 0;
        int maxSubArraySum = Integer.MIN_VALUE;
        if (arrayLength == 0) {
            maxSubArraySum = -1;

        }
        for (int i = 0; i < arrayLength; i++) {
            subArraySum = subArraySum + array[i];
            if (subArraySum < 0) {
                subArraySum = 0;
            }
            if (maxSubArraySum < subArraySum) {
                maxSubArraySum = subArraySum;
            }
        }

        System.out.println("Max subarray sum ==>"+maxSubArraySum);
        return maxSubArraySum;
    }
}

