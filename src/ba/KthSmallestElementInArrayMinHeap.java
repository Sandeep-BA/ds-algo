package ba;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


/*
Whenever kth and smallest, use Heap Implementation
Smallest ==> Max Heap
Largest ==> Min Heap


 */
class KthSmallestElementInArrayMinHeap
{
    // Function to find the k'th smallest element in an
    // array using max-heap
    public static int findKthSmallest(List<Integer> A, int k)
    {
        // create a max-heap using the `PriorityQueue` class and
        // insert the first `k` array elements into the heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.addAll(A.subList(0, k));

        // do for remaining array elements
        for (int i = k; i < A.size(); i++)
        {
            // if the current element is less than the root of the heap
            if (A.get(i) < pq.peek())
            {
                // replace root with the current element
                pq.poll();
                pq.add(A.get(i));
            }
        }

        // return the root of max-heap
        return pq.peek();
    }

    public static void main(String[] args)
    {
        List<Integer> integerList = Arrays.asList(7,10,4,3,20,15);
//        List<Integer> A = Arrays.asList(17, 34, 26, 3, 9, 1);
        int k = 5;

        System.out.println("K'th smallest array element is " + findKthSmallest(integerList, k));
    }
}