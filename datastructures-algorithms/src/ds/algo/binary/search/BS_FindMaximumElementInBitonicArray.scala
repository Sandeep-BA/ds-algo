package ds.algo.binary.search

/*

Bitonic Array ==> An array which incresease continously and then after peak
element it decreses. Also, Array(i) != Array(i+1)

You will have only one peak element in this bitonic array.
 */
object BS_FindMaximumElementInBitonicArray {
  def main(args: Array[String]): Unit = {
    // Return peak element in the array.
    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearch
    (Array(5,10,20,15))) // Expecting 20 // Index: 2

    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearch
    (Array(2,5,6,7,11,12,15,16,18))) // Expecting 18 // Index : 8


    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearch
    (Array(10,20,30,45,32,23,12))) // Expecting 90 // Index: 3

  }

  def binarySearch(array: Array[Int]): Int = {
    var start = 0
    val size = array.length - 1 // Last index of the array
    var end = size
    while(start<=end){
      val mid = start + (end-start)/2

      if(mid>0 && mid<size){
        if(array(mid) > array(mid-1) && array(mid) > array(mid+1)){
          return mid
        }
        else if( array(mid+1)> array(mid)){
          start = mid+1
        } else {
          end = mid-1
        }
      } else if( mid ==0 ){
        if(array(mid)> array(mid+1)){
          return mid
        }else{
          return mid +1
        }
      } else if(mid == size){
        if(array(mid)> array(mid-1)){
          return mid
        } else{
          return mid-1
        }
      }
    }
    -1
  }

}
