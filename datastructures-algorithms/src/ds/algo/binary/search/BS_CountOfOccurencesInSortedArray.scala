package ds.algo.binary.search

/*

Basically find the 1st and last occurences and + 1 will give you number of
times the element present in the array.
 */
object BS_CountOfOccurencesInSortedArray {
  def main(args: Array[String]): Unit = {
    val firstOccurence =
      binarySearchFirstOccurences(Array(2, 4, 10, 10, 10,10,10, 20, 30, 50), 10)
    val lastOccurence =
      binarySearchLastOccurences(Array(2, 4, 10, 10, 10,10,10, 20, 30, 50), 10)

    println(
      "Number of times the elment present in the sorted array ==> " +
        (lastOccurence - firstOccurence + 1)
    ) // Expecting 5

  }

  def binarySearchFirstOccurences(array: Array[Int],
                                  searchElement: Int): Int = {
    var start = 0
    var end = array.length - 1
    var result = -1

    while (start <= end) {
      val mid = start + (end - start) / 2

      if (array(mid) == searchElement) {
        result = mid
        end = mid - 1
      } else if (searchElement < array(mid)) {
        end = mid - 1
      } else {
        start = mid + 1
      }
    }
    result
  }

  def binarySearchLastOccurences(array: Array[Int], searchElement: Int): Int = {
    var start = 0
    var end = array.length - 1
    var result = -1

    while (start <= end) {
      val mid = start + (end - start) / 2

      if (array(mid) == searchElement) {
        result = mid
        start = mid + 1
      } else if (searchElement < array(mid)) {
        end = mid - 1
      } else {
        start = mid + 1
      }
    }
    result
  }
}
