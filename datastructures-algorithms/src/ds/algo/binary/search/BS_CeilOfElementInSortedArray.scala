package ds.algo.binary.search

/**
 * Created by Sandeep Belgavi on 6/30/2021
 */
object BS_CeilOfElementInSortedArray {
  def main(args: Array[String]): Unit = {
    println("Ceil of an element ==>"+ binarySearchAndReturnCeilElement
    (Array(2,5,6,7,11,12,15,16,18),15)) // Expecting 15

    println("Index of the Ceil of an element ==>"+ binarySearchAndReturnIndexOfCeilElement
    (Array(2,5,6,7,11,12,15,16,18),15)) // Expecting 6


    println("Ceil of an element ==>"+ binarySearchAndReturnCeilElement
    (Array(2,5,6,7,11,12,15,16,18),13)) // Expecting 15

    println("Index of the Ceil of an element ==>"+ binarySearchAndReturnIndexOfCeilElement
    (Array(2,5,6,7,11,12,15,16,18),13)) // Expecting 6

  }
    def binarySearchAndReturnCeilElement(array: Array[Int],searchElement: Int)
    : Int = {
      var start = 0
      var end = array.length - 1
      var result = -1
      while(start<=end){
        val mid = start + (end-start)/2
        if(array(mid) == searchElement) return array(mid)
        if( array(mid) < searchElement ) start = mid+1
        else if( array(mid) > searchElement){
          result = array(mid)
          end = mid-1
        }
      }
      result
    }
    def binarySearchAndReturnIndexOfCeilElement(array: Array[Int],
                                                 searchElement: Int): Int = {
      var start = 0
      var end = array.length - 1
      var result = -1
      while(start<=end){
        val mid = start + (end-start)/2
        if(array(mid) == searchElement) return mid
        if( array(mid) < searchElement ) start = mid+1
        else if( array(mid) > searchElement){
          result = mid
          end = mid-1
        }
      }
      result
    }
}
