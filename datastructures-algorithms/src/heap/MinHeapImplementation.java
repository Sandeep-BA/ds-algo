package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * This class gives Kth smallest element in a array
 *
 */

/**
 * Created by Sandeep Belgavi on 7/1/2021
 */
public class MinHeapImplementation {
    public static void main(String[] args) {
        System.out.println("Printing the Kth minimum elment in a sorted array");
        int[] array = {5,2,12,6,7,235,24,2,1};
        System.out.println(findKthSmallestElement(new int[]{5,2,3},3));
        System.out.println(findKthSmallestElement(array,3));
        System.out.println(findKthSmallestElement(new int[]{},3));
    }


    public static int findKthSmallestElement(int[] array, int k) {

        if(array.length == 0 ){
            throw new RuntimeException("Size should be greater than 0");
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int i =0; i< k;i++){
            maxHeap.add(array[i]);
        }
        for(int j=k; j<array.length;j++){
            if(maxHeap.peek() > array[j]){
                maxHeap.add(array[j]);
                System.out.println("Removing top of the element ==>"+maxHeap.poll());
            }
        }

        return maxHeap.poll();
    }
}