package ds.algo.binary.search

object BS_FloorOfAnElementInSortedArray {
  def main(args: Array[String]): Unit = {
    println("Floor of an element ==>"+ binarySearchAndReturnFloorElement
    (Array(2,5,6,7,11,12,15,16,18),15)) // Expecting 15

    println("Index of the floor of an element ==>"+ binarySearchAndReturnIndexOfFloorElement
    (Array(2,5,6,7,11,12,15,16,18),15)) // Expecting 6


    println("Floor of an element ==>"+ binarySearchAndReturnFloorElement
    (Array(2,5,6,7,11,12,15,16,18),13)) // Expecting 12

    println("Index of the floor of an element ==>"+ binarySearchAndReturnIndexOfFloorElement
    (Array(2,5,6,7,11,12,15,16,18),13)) // Expecting 5

  }

  def binarySearchAndReturnFloorElement(array: Array[Int],searchElement: Int)
  : Int = {
    var start = 0
    var end = array.length - 1
    var result = -1
    while(start<=end){
    val mid = start + (end-start)/2
      if(array(mid) == searchElement){
        return array(mid)
      }
     if( array(mid) < searchElement ){
        result = array(mid)
       start = mid+1
      }
      else if( array(mid) > searchElement){
       end = mid-1
      }
    }
    result
  }
  def binarySearchAndReturnIndexOfFloorElement(array: Array[Int],
                                            searchElement: Int): Int = {
    var start = 0
    var end = array.length - 1
    var result = -1
    while(start<=end){
      val mid = start + (end-start)/2
      if(array(mid) == searchElement){
        return mid
      }
      if( array(mid) < searchElement ){
        result = mid
        start = mid+1
      }
      else if( array(mid) > searchElement){
        end = mid-1
      }
    }
    result
  }

}
