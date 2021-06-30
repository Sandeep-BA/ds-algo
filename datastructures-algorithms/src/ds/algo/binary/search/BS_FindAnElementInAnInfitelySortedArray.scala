package ds.algo.binary.search

object BS_FindAnElementInAnInfitelySortedArray {
  def main(args: Array[String]): Unit = {
    println("Welcome to Binary Search Algorithm Problems for finding an " +
      "element in an Infitely sorted array!!! :)")
    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearchOnInfiniteArray
    (Array(2,5,6,7,11,12,15,16,18),15)) // Expecting 6

    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearchOnInfiniteArray
    (Array(2,5,6,7,11,12,15,16,18),13)) // Expecting -1

    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearchOnInfiniteArray
    (Array(2,5,6,7,11,12,15,16,18),130)) // Expecting Array Index out of bound
    // exception as it cannot be infintely sorted array locally :)
  }

  def binarySearchOnInfiniteArray(array: Array[Int], searchElement: Int): Int
  = {
    var start = 0
    var end = 1
    // In an infintely sorted array, we don't get array index out of bound
    // exception. However in the above case, we can expect as we cannot
    // create infinite sorted array and try to find an element.
    while(array(end) < searchElement){
      start = end
      end = end * 2
    }
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
