package heap;

import java.util.PriorityQueue;

/**
 * Created by Sandeep Belgavi on 7/1/2021
 */
public class MaxHeapImplementation {
    public static void main(String[] arguments) {
        System.out.println("Printing the Kth maximum elment in a sorted array");
        int[] array = {5,2,12,6,7,235,24,2,1};
        System.out.println(findKthLargestElementInArray(new int[]{5,2,3},3));
        System.out.println(findKthLargestElementInArray(array,3));
        System.out.println(findKthLargestElementInArray(new int[]{},3));
    }

    public static int findKthLargestElementInArray(int[] array,int k){
        if(array.length == 0){
            throw new RuntimeException("Length of the array should be greater than 0");
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            minHeap.offer(array[i]);
        }
        for(int j=k;j<array.length;j++){
            minHeap.offer(array[j]); //Offer is similar to add
            if(minHeap.size()> k){
                System.out.println("Removing element ==>" +minHeap.poll());
            }
        }
        return minHeap.poll();

    }
}
