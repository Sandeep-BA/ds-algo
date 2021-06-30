package ds.algo.binary.search

/*

number of times the sorted array is sorted is equal to index of the minmum
element in the array!

 */
object BS_NumberOfTimesASortedArrayIsRotated {
  def main(args: Array[String]): Unit = {
    println("Number of times sorted array is rotated via Binary Search " +
      "Algorithm in" +
      " the " +
      "array ==>"+ binarySearchNumberOfTimesRotated
    (Array(2,5,6,8,11,12,15,18))) // Expecting 0

    println("Number of times sorted array is rotated via Binary Search " +
      "Algorithm in" +
      " the " +
      "array ==>"+ binarySearchNumberOfTimesRotated(Array(11,12,15,18,2,5,6,
      8)) ) // Expecting 4


    println("Number of times sorted array is rotated via Binary Search " +
      "Algorithm in" +
      " the " +
      "array ==>"+ binarySearchNumberOfTimesRotated(Array(11,12,15,18,2,
      5,6,8,9,10)) ) // Expecting 4


    println("Number of times sorted array is rotated via Binary Search " +
      "Algorithm in" +
      " the " +
      "array ==>"+ binarySearchNumberOfTimesRotated(Array(8,9,10,11,12,13,14,1,
      2,3,4,5,6,7))
    ) // Expecting 8
  }

  def binarySearchNumberOfTimesRotated(array: Array[Int])
  : Int = {
    var start = 0
    var end = array.length -1
    val n = array.length
    while(start<=end){
      val mid = start + (end-start)/2
      val prev = ( mid + n - 1 ) % n
      val next = (mid + 1) % n
      if(array(mid) <= array(prev)  && array(mid) <= array(next)){
//        in a sorted array there has to be an element if it's rotated, which
        //        is less than the previous and next. That's the index and
        //        adding 1 to it gives the number of rotation :)
        return mid
       } else if(array(mid) <= array(end)){
        end = mid - 1
      }
      else if(array(start) <= array(mid-1)){
        start = mid+1
      }
    }
    -1
  }

}
