package simple.basic.questions;

import java.util.*;

/**
 * Created by Sandeep Belgavi on 7/1/2021
 */
public class ArrayListInternalImplementation {
    public static void main(String[] args) {
        int value  = 10;
        System.out.println(10 >> 1); // Gives us the 50% of the capacity
        System.out.println(10 << 1); // Double the capacity
        System.out.println(10 << 2); // Double the capacity
        System.out.println("The above were capacity");

        List<Integer> testingArrayList = new ArrayList<Integer>(10);
        testingArrayList.add(1);
        testingArrayList.add(12);
        testingArrayList.add(15);
        testingArrayList.add(13);
//            println("testing Array List ==>"+testingArrayList.foreach(x <- System.out.println(x)));
        testingArrayList.forEach(integer -> System.out.println(integer));
//            Stream<Integer> newArrayList = testingArrayList.stream().filter(integer -> integer.equals(1));
//                newArrayList.map(integer -> System.out.println(integer));
/*
        newArrayList.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return true;
            }
        });
*/
        int[] intArray = {1,2,3,5,6};
        Set<Integer> newHashSet = new HashSet<>(Arrays.asList(11,2,3,4,5));
        Set<Integer> newHashSetInteger = new HashSet<>(Arrays.asList(new Integer[]{1,2,34,5,65}));
    }
}

