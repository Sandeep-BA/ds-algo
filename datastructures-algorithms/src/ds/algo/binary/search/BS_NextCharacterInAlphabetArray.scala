package ds.algo.binary.search


/**
 * Created by Sandeep Belgavi on 6/30/2021
 */
object BS_NextCharacterInAlphabetArray {
  def main(args: Array[String]): Unit = {
    println("Next alphabet of an element ==>"+
      binarySearchAndReturnNextAlphavetOfSearchElement
    (Array('a','b','c','d'),'c')) // Expecting d

    println("Next alphabet of an element ==>"+
      binarySearchAndReturnNextAlphavetOfSearchElement
      (Array('a','b','c','d'),'d')) // Expecting #

  }

  def binarySearchAndReturnNextAlphavetOfSearchElement(array: Array[Char],
                                       searchElement: Char): Char = {
    var start = 0
    var end = array.length - 1
    var result = '#'
    while (start <= end) {
      val mid = start + (end - start) / 2
      if (array(mid) == searchElement) start = mid + 1
      if (array(mid) < searchElement) start = mid + 1 else if (array(mid) > searchElement) {
        result = array(mid)
        end = mid - 1
      }
    }
    result
  }
  def binarySearchAndReturnIndexOfCeilElement(array: Array[Int],
                                              searchElement: Int): Int = {
    var start = 0
    var end = array.length - 1
    var result = -1
    while (start <= end) {
      val mid = start + (end - start) / 2
      if (array(mid) == searchElement) return mid
      if (array(mid) < searchElement) start = mid + 1 else if (array(mid) > searchElement) {
        result = mid
        end = mid - 1
      }
    }
    result
  }

}
