package ds.algo.binary.search

object BS_FindPeakElement {
  def main(args: Array[String]): Unit = {
    // Return peak element in the array.
    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearch
    (Array(5,10,20,15))) // Expecting 6

    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearch
    (Array(2,5,6,7,11,12,15,16,18))) // Expecting -1


    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearch
    (Array(2,5,6,7,11,99,12,15,16,45,18))) // Expecting -1


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
       else if( array(mid-1)> array(mid)){
        end = mid-1
      } else {
        start = mid+1
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
