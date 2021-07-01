package simple.basic.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Sandeep Belgavi on 7/1/2021
 */
public class TreeMapInternalImplementation {
    public static void main(String[] args) {
        System.out.println("Internal Implementation of Tree Map which internally uses Red Black Trees!");
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(5000, "Sandeep");
        treeMap.put(4000, "Belgavi");
        treeMap.put(3000, "Lockdown");
        treeMap.put(1000, "Workout");
        System.out.println(treeMap);
        treeMap.forEach((key, value) -> System.out.println("Key ==> " + key + " Value ==> " + value));
        Map<Integer,String> hasMap = new HashMap<Integer,String>();
        hasMap.put(100,"Sandeep");
        hasMap.put(200,"Belgavi");
        hasMap.put(300,"Outgoing");
//    hasMap.foreach((key,value) -> System.out.println("Key ==> "+key + " Value ==> "+value));
        /**/      hasMap.forEach((key,value) -> System.out.println("Key ==> "+key + " Value ==> "+value));
/*
        for(Map.Entry<Integer,String> entryIterator : hasMap.entrySet()){
            System.out.println("Key ==> "+entryIterator.getKey());
            System.out.println("Value ==> "+entryIterator.getValue());
        }*/
        // As Tree map is sorted, it always gives me last Key(Highest wrt to sorted key and 1st Will give me lowest in sorted Key)
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
//        Give me all those values less than 300
        System.out.println("Printing all those keys which are less than 3000");
        treeMap.headMap(4000).keySet().forEach((x) -> System.out.println(x));
        System.out.println("Printing all those keys which are greater than 3000");

        treeMap.tailMap(4000).keySet().forEach((x) -> System.out.println(x));
    }
}
