package ds.algo.binary.search

/**
 * Created by Sandeep Belgavi on 6/30/2021
 */
object BinarySearchFirstAndLastOccurenceOfElement {
  def main(args: Array[String]): Unit = {
    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearchFirstOccurences
    (Array(2,5,10,10,10,25,63,99),10)) // Expecting 2

    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearchLastOccurences
    (Array(2,5,10,10,10,25,63,99),10)) // Expecting 4

    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearchFirstOccurences
    (Array(2,4,10,10,10,20,30,50),100)) // Expecting -1


    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearchLastOccurences
    (Array(2,4,10,10,10,20,30,50),100)) // Expecting -1

  }
  def binarySearchFirstOccurences(array: Array[Int], searchElement: Int): Int
  = {
    var start = 0
    var end = array.length -1
    var result = -1

    while(start<=end){
      val mid = start + (end-start)/2

      if(array(mid) == searchElement){
        result = mid
        end = mid-1
      } else if(searchElement< array(mid)) end = mid-1 else start = mid+1
    }
    result
  }

  def binarySearchLastOccurences(array: Array[Int], searchElement: Int): Int
  = {
    var start = 0
    var end = array.length -1
    var result = -1

    while(start<=end){
      val mid = start + (end-start)/2

      if(array(mid) == searchElement){
        result = mid
        start = mid+1
      } else if(searchElement< array(mid)) end = mid-1 else start = mid+1
    }
    result
  }
}
