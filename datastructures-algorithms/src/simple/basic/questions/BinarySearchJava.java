package simple.basic.questions;

public class BinarySearchJava {
    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16, 18, 189};
        System.out.println("Binary Search Algorithm ==>" + binarySearch(array, 9));
        System.out.println("Binary Search Algorithm ==>" + binarySearch(array, 2359));

    }

    private static int binarySearch(int[] array, int element) {
        int low = 0;
        int high = array.length-1;

        while (low <= high) {
            int mid = low + high-low /2 ;
//            int mid = (low + (high-low) /2) ;
            if (array[mid] == element) {
                return mid;
            } else if (element > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
