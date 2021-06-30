package ds.algo.binary.search

/*
Provided: Here the array is sorted. Catch is whether is ascending or
descending not sure. But as arary is sorted, we will go for binary serach
algorithm so that it can gets computed in O(logN) instead of O(n2)
 */
object BinarySearchSortingAgonisticAlgorithm {
  def main(args: Array[String]): Unit = {
    println("Welcome to Binary Search Algorithm Problems where sorting " +
      "order is agnostic!!! :)")

    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>" + binarySearch
    (Array(2, 5, 6, 7, 11, 12, 15, 16, 18), 15)) // Expecting 6

    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>" + binarySearch
    (Array(30, 28, 25, 10, 9, 5, 4, 2, 1), 2)) // Expecting 7
  }

  def binarySearch(ints: Array[Int], i: Int): Int = {
    if(ints.size == 1) {
      // If array size 1 then we cannot determine the order asc/desc
      var index = -1
      if(ints(0) == i) return 0 else -1
    }else if(ints.size > 1) {
      if(ints(0)> ints(1)){
        return binarySearchDesc(ints,i)
      }else if(ints(0)<ints(1)){
        return binarySearchAsc(ints,i)
      }
    }
    -1
  }
    def binarySearchAsc(array: Array[Int], searchElement: Int): Int = {
      var start = 0
      var end = array.length - 1
      while (start <= end) {
        val mid = start + (end - start) / 2

        if (array(mid) == searchElement) {
          return mid
        } else if (searchElement < array(mid)) {
          end = mid - 1
        } else {
          start = mid + 1
        }
      }
      -1
    }
  def binarySearchDesc(array: Array[Int], searchElement: Int): Int = {
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

