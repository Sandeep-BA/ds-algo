package ds.algo.binary.search

/*
  1  2   3  4
  5  6   7  8
  9  10  11 12

Row wise as well as column wise the numbers are in the increasing order.
Similar to that of Binary Search.

With a matrix of mxn (m rows, n columns)
Start comparing with n and reduce by n-1 with every place
making a decision to go either greater or smaller.

 */
object BS_FindAnElementARowWiseColumnWiseSortedArray {


  def main(args: Array[String]): Unit = {

    val twoDArray = Array.ofDim[Int](4,4)
    var valueFiller = 1
    for(i <- 0 to 3){
      for(j <- 0 to 3){
        valueFiller = valueFiller + 1
        twoDArray(i)(j) = valueFiller
      }
    }
    twoDArray.foreach {
      x =>
        println(x.toString)
        x.foreach{
          y =>
            println(y.toString)
        }
    }
    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearch(twoDArray,15,4,4)) // Expecting (3,1)

    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearch(twoDArray,9,4,4)) // Expecting (1,3)


    println("Index of the search element via Binary Search Algorithm in the " +
      "array ==>"+ binarySearch(twoDArray,88,4,4)) // Expecting  (-1,-1)
  }

  def binarySearch(array:Array[Array[Int]], searchElement: Int,rowSize: Int,
                   columnSize: Int): (Int,Int)
    = {
    var start = 0
    var end = array.length -1
    var (i,j) = (0,columnSize-1) // To compare from first row last element
    // and come towards 0th column element

    while (i>=0 && i< rowSize && j >= 0 && j < columnSize){
      if(array(i)(j)== searchElement)  {
        return (i,j) // If the element found, return
      } else if(array(i)(j)> searchElement){
        j -= 1
      } else if(array(i)(j) < searchElement){
         i += 1
      }
    }
/*    while(start<=end){
      val mid = start + (end-start)/2

      if(array(mid) == searchElement){
        return mid
      } else if(searchElement < array(mid)){
        end = mid-1
      } else {
        start = mid+1
      }
    }
    -1*/
    return (-1,-1)
  }

}
