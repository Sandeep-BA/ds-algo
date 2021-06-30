package ds.algo.binary.search

object BS_FindMinimumDifferenceElementInASortedArray {
  def main(args: Array[String]): Unit = {
    println("Minimum difference element in array which gives difference less " +
      " ==>" +
      binarySearchFindingMinimumDifferenceElementInSortedArray
      (Array(2, 5, 6, 7, 11, 12, 15, 16, 18), 17))


    println("Minimum difference element in array which gives difference less " +
      " ==>" +
      binarySearchFindingMinimumDifferenceElementInSortedArray
      (Array(2, 5, 6, 7, 11, 12, 15, 16, 18), 10))

    println("Minimum difference element in array which gives difference less " +
      " ==>" +
      binarySearchFindingMinimumDifferenceElementInSortedArray
      (Array(2, 5, 6, 7, 11, 12, 15, 16, 18), 18))
    // If the element is present, return the same element itself

  }

  def binarySearchFindingMinimumDifferenceElementInSortedArray(array: Array[Int], searchElement: Int)
  : Int = {
    var start = 0
    var end = array.length - 1
    var result = -1
    while (start <= end) {
      val mid = start + (end - start) / 2
      if (array(mid) == searchElement) {
        return array(mid)
      }
      if (array(mid) < searchElement) {
        result = array(mid)
        start = mid + 1
      }
      else if (array(mid) > searchElement) {
        end = mid - 1
      }
    }
    val lower = scala.math.abs(array(start) - searchElement)
    val higher = scala.math.abs(array(end) - searchElement)
    if (lower < higher) return array(start) else return array(end)
  }
}