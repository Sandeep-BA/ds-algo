package slidingwindow

import scala.collection.mutable.ListBuffer

/**
 * Created by Sandeep Belgavi on 6/30/2021
 */
object FirstNegativeForEachWindow {
  def main(args: Array[String]): Unit = {
//    println("First non negative number for each window of fixed size ==> "+
//      slidingWindow(Array(1,-1,-7,8,-15,30,16,28),3))

    println("First non negative number for each window of fixed size ==> "+
      slidingWindow(Array(1,-1,7,8,15,30,-16,28),3))

  }
  def slidingWindow(array: Array[Int], windowSize: Int): Unit = {
    var (i,j) = (0,0)
    var firstNegative = ListBuffer[Integer]()
    while (j< array.size){
      if(array(j)<0) firstNegative += array(j)
      if(j-i+1 < windowSize) j = j.+(1) else if(j-i+1 == windowSize){
        if(!firstNegative.isEmpty){
          println("First Non Negative for window "+i+" is ==> "+firstNegative.head)
          if(array(i) == firstNegative.head) firstNegative = firstNegative.tail
        }else println("Oops.. sorry we did not find any negatvie number for " +
          "window" +
          " "+i+" hence as per requirement giving an output of 0" )
        // Sliding window to keep it constant
        i = i.+(1)
        j = j.+(1)

      }
    }
  }
}
