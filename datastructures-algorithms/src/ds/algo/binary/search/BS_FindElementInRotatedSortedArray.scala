package ds.algo.binary.search

object BS_FindElementInRotatedSortedArray {
  def main(args: Array[String]): Unit = {
    val array = Array(11, 12, 15, 18, 2, 5, 6, 8)
    val indexOfStartingPoint = binarySearchNumberOfTimesRotated(array)
    val firstPart = binarySearch(array, 0, indexOfStartingPoint - 1, 6)
    val secondPart = binarySearch(array, indexOfStartingPoint, array.length, 6)
    var index =
      if (firstPart == secondPart == -1) -1
      else if (firstPart >= 0) firstPart
      else secondPart
    println(
      "Find an element(6) in sorted array which is rotated via " +
        "Binary Search " +
        "Algorithm  ==>" + index
    ) // Expecting 6
  }

  def binarySearchNumberOfTimesRotated(array: Array[Int]): Int = {
    var start = 0
    var end = array.length - 1
    val n = array.length
    while (start <= end) {
      val mid = start + (end - start) / 2
      val prev = (mid + n - 1) % n
      val next = (mid + 1) % n
      if (array(mid) <= array(prev) && array(mid) <= array(next)) {
        //        in a sorted array there has to be an element if it's rotated, which
        //        is less than the previous and next. That's the index and
        //        adding 1 to it gives the number of rotation :)
        return mid
      } else if (array(mid) <= array(end)) {
        end = mid - 1
      } else if (array(start) <= array(mid - 1)) {
        start = mid + 1
      }
    }
    -1
  }
  def binarySearch(array: Array[Int],
                   startPoint: Int,
                   endPoint: Int,
                   searchElement: Int): Int = {
    var start = startPoint
    var end = endPoint
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

}
