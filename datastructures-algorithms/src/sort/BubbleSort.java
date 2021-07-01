package sort;

// Number of rounds equals ==> number of elements - 1

/**
 * Created by Sandeep Belgavi on 7/1/2021
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{46, 23, 66, 21, 26, 17, 9, 3, 1};
        int[] sortedArray = bubbleSort(array);

        System.out.println("Bubble Sort ==> ");
        for (int elment:sortedArray) {
            System.out.print(elment+",");
        }
    }

    public static int[] bubbleSort(int[] array) {
        int temp;
        for (int i =0 ; i< array.length; i ++){
            int flag = 0;
            for (int j = 0; j< array.length-1-i; j++){
                if(flag ==0) {
                    break;
                }
                if(array[i] > array[j+1]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=1;
                }
            }
            flag=0;
        }
        return array;
    }
}

