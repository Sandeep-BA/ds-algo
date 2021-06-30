package ds.algo.binary.search

object BinarySearch {
  def main(args: Array[String]): Unit = {
    println("Welcome to Binary Search Algorithm Problems!!! :)")
    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearch
    (Array(2,5,6,7,11,12,15,16,18),15)) // Expecting 6

    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearch
    (Array(2,5,6,7,11,12,15,16,18),105)) // Expecting -1
  }

  def binarySearch(array: Array[Int], searchElement: Int): Int = {
    var start = 0
    var end = array.length -1
    while(start<=end){
      val mid = start + (end-start)/2

      if(array(mid) == searchElement){
        return mid
      } else if(searchElement< array(mid)){
        end = mid-1
      } else {
        start = mid+1
      }
    }
    -1
  }

}
