package ds.algo.binary.search

/*
Basically if an element is present in ith index in a sorted array, we can use
 Binary Search. However, if it's present in i-1/i/i+1 this we call as nearly
 sorted array.
 Hence modify the binary search to search in all 3 index so that it can work
 out easily.

 */


/**
 * Created by Sandeep Belgavi on 6/30/2021
 */
object BS_FindAnElementInNearlySortedArray {
  def main(args: Array[String]): Unit = {
    println("Welcome to Binary Search Algorithm Problems!!! :)")
    println("Index of the search element in nearly sorted array via Binary " +
      "Search Algorithm in the " +
      "array ==>"+ binarySearch
    (Array(5,10,30,20,40),20)) // Expecting 3

    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearch
    (Array(2,5,6,7,11,12,15,16,18),105)) // Expecting -1
  }

  def binarySearch(array: Array[Int], searchElement: Int): Int = {
    var start = 0
    var end = array.length -1
    while(start<=end){
      val mid = start + (end-start)/2
    // To handle array index out of bound exception

      if(array(mid) == searchElement)
        return mid
      if(mid-1 >= start && array(mid-1) == searchElement)  return mid-1
        if(mid+1 <= end && array(mid+1) == searchElement) return mid+1 else if(searchElement< array(mid)) end = mid-2 else start = mid+2
    }
    -1
  }

}
