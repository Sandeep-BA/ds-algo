package slidingwindow

/**
 * Created by Sandeep Belgavi on 6/30/2021
 */
object CouintOfAnagramsSlidingWIndow {
  def main(args: Array[String]): Unit = {
    //    println("First non negative number for each window of fixed size ==> "+
    //      slidingWindow(Array(1,-1,-7,8,-15,30,16,28),3))

    println(
      "Count of anagrams for a given string ==> " +
        slidingWindow("aabaaabaaaba", "aaba") // Output should be 9 :)
    )

  }
  def slidingWindow(array: String, anagramString: String): Int = {
    var (i, j) = (0, 0)
    var mappingAnagrams = scala.collection.mutable.Map[Char, Integer]()

    anagramString.foreach { x =>
      if (!mappingAnagrams.contains(x)) mappingAnagrams.put(x, 1) else mappingAnagrams.put(x, mappingAnagrams.get(x).get + 1)
    }
    var sum = 0

    // Keeping the count of distinct characters. When this is 0 ==> we found
    // anagram
    var count = mappingAnagrams.keySet.size

    while (j < array.size) {
      if (mappingAnagrams.contains(array(j))) {
        mappingAnagrams.put(array(j), mappingAnagrams.get(array(j)).get - 1)
        if (mappingAnagrams.get(array(j)).get == 0) count = count - 1
      }

      if (j - i + 1 < anagramString.size) j = j.+(1) else if (j - i + 1 == anagramString.size) {

        if (count == 0) sum = sum + 1

        if (mappingAnagrams.contains(array(i))) {
          count = count + 1
          mappingAnagrams.put(array(i), mappingAnagrams.get(array(i)).get + 1)
        }
        // Sliding window to keep it constant
        i = i.+(1)
        j = j.+(1)

      }
    }
    sum
  }
}
