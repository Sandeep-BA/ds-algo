package slidingwindow

/**
 * Created by Sandeep Belgavi on 6/30/2021
 */
object SlidingWindowOptimized {

  def main(args: Array[String]): Unit = {
    println("Max sum for a given window size and for an array ==> "+
      slidingWindow(Array(2,5,1,8,2,9,1),3))

  }
  def slidingWindow(array: Array[Int], windowSize: Int): Int = {
    var (i,j,maximum,windowSum) = (0,0,Int.MinValue,0)

    while (j< array.size){
        windowSum = windowSum + array(j)
      if(j-i+1 < windowSize) j = j.+(1) else if(j-i+1 == windowSize){
        maximum = scala.math.max(windowSum,maximum)
        windowSum = windowSum - array(i)
        i = i.+(1)
        j = j.+(1)
      }
    }
    maximum
  }
}
