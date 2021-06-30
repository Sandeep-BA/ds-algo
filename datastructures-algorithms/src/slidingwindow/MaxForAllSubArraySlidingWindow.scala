package slidingwindow

import scala.collection.mutable.ListBuffer

/**
 * Created by Sandeep Belgavi on 6/30/2021
 */
object MaxForAllSubArraySlidingWindow {
  def main(args: Array[String]): Unit = {
    //    println("First non negative number for each window of fixed size ==> "+
    //      slidingWindow(Array(1,-1,-7,8,-15,30,16,28),3))
/*

    println("First non negative number for each window of fixed size ==> "+
      maxOfSubArray(Array(1,-1,7,8,15,30,-16,28),3))
*/

    println("First non negative number for each window of fixed size ==> "+
      maxOfSubArray(Array(1,3,-1,-3,5,3,6,7),3))

/*    println("Max of all sub arrays for size k 3 ==> "+
      maxOfSubArray(Array(5,3,10,11,16,2,3),3))*/
  }
  def maxOfSubArray(array: Array[Int], windowSize: Int): ListBuffer[Integer] = {
    var (i,j) = (0,0)
    var maxForEachSubArray = ListBuffer[Integer]()
    var max = 0
    while (j< array.size){
      max = scala.math.max(max,array(j))
      if(j-i+1 < windowSize) j = j.+(1) else if(j-i+1 == windowSize){
        max = scala.math.max(max,array(j))
        maxForEachSubArray += max
        // Sliding window to keep it constant
        i = i.+(1)
        j = j.+(1)

      }

    }
    maxForEachSubArray
  }
}
