package slidingwindow

/**
 * Created by Sandeep Belgavi on 6/30/2021
 */
object SlidingWindow {
  def main(args: Array[String]): Unit = {
    println(
      "Sliding window problem sum of sub array of length 3==> " +
        slidingWindow(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3)
    )
  }

  def slidingWindow(array: Array[Int], subsetSize: Int): Int = {
    var maximum = 0
    for (i <- 0 to array.size) {
      var sum = 0
      var count = 0
      if (i + subsetSize <= array.size) {

        for (j <- i to i + subsetSize-1) {
          sum = sum + array(j)
          count = count + 1
        }
        println("Counter ==> " + count)
        count = 0
        println("Iteration " + i + " maximum > sum" + maximum, sum)
        if (maximum > sum) maximum = maximum else maximum = sum
      }
    }
    maximum
  }
}
