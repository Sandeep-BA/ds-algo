package ds.algo.binary.search

/*
This problem is a combination of finding 1st element in a sorted array and
finding an element in a infinite sorted array along with keeping simple
structure of adding Binary which means 0/1
 */
object BS_FindtheIndexOfFirst1InAInfinitelyBinarySortedArray {
  def main(args: Array[String]): Unit = {
    println("Welcome to Binary Search Algorithm Problems for finding an " +
      "element in an Infitely sorted array!!! :)")
    println("Index of the search element via Binary Search Algorithm in " +
      "infinite sorted binary array ==>" + binarySearchOnInfiniteArray
    (Array(0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1), 1))
    // Expecting index 11 to be returned

    println("Index of the search element via Binary Search Algorithm in " +
      "infinite binary sorted array" +
      " " +
      "array ==>" + binarySearchOnInfiniteArray
    (Array(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0), 1))
  }

  def binarySearchOnInfiniteArray(array: Array[Int], searchElement: Int): Int
  = {
    var start = 0
    var end = 1
    var result = -1
    // In an infintely sorted array, we don't get array index out of bound
    // exception. However in the above case, we can expect as we cannot
    // create infinite sorted array and try to find an element.
    while (array(end) < searchElement) {
      start = end
      end = end * 2
    }
    while (start <= end) {
      val mid = start + (end - start) / 2

      if (array(mid) == searchElement) {
        result = mid
        end = mid-1
      } else if (searchElement < array(mid)) {
        end = mid - 1
      } else {
        start = mid + 1
      }
    }
    result
  }
}