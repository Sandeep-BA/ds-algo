package ds.algo.binary.search

/*
If the array is sorted in descending order
how do we find an element.
 */
object BinarySearchOnReverseSortedArray {
  def main(args: Array[String]): Unit = {
    println("Welcome to Binary Search Algorithm Problems!!! :)")
    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>" + binarySearch
    (Array(30, 28, 25, 10, 9, 5, 4, 2, 1), 28)) // Expecting 1

    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>" + binarySearch
    (Array(30, 28, 25, 10, 9, 5, 4, 2, 1), 2)) // Expecting 7

    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>" + binarySearch
    (Array(30, 28, 25, 10, 9, 5, 4, 2, 1), 200)) // Expecting -1


    def binarySearch(array: Array[Int], searchElement: Int): Int = {
      var start = 0
      var end = array.length - 1
      while (start <= end) {
        val mid = start + (end - start) / 2

        if (array(mid) == searchElement) {
          return mid
        } else if (searchElement < array(mid)) {
          start = mid + 1
        } else {
          end = mid - 1
        }
      }
      -1
    }

  }
}

