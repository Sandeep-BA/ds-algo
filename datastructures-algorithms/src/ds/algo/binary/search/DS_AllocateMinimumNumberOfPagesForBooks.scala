package ds.algo.binary.search

/*

Allocate minimum number of pages to the books
array = 10,20,30,40:: k == 2 ( K is number of kids/students)
one book of 20 pages, another with 30 pages et al.
We need to distribute these books to students.

If 2 kids are there we have to give atleast 1 book to each of them.

Below are the beautiful restrictions
** Whole book should be given and we can divide single book into 2.
** We cannot give all books to one kid and other kid nothing
** We will do in continous manner distribution
** Basically 10,20 to one and 30/40 to other.
We cannot give 10,30 to one and 20/40 to other as it will be discontinous

Agenda to find out what:
To find out the number/index from a given array such that we have to minimize
 the maximum number of pages a student reads.

 */
object DS_AllocateMinimumNumberOfPagesForBooks {
  def main(args: Array[String]): Unit = {
    val array: Array[Int] = Array(10,20,30,40)
    val sum = array.foldLeft(0)(_+_)
    val begin = array.reduceLeft(_ max _) // Finding the maximum element so
    // that we can start with that for our binary search.
    // This is becuase, we assume that max element is number of pages
    // assigned to one person and rest of the pages to another considering 2
    // or more..
    println("Minimum number of pages of the book which can be allocated to " +
      "student so that minimum number of pages can be allocated to given " +
      "students ==>"+ binarySearch(array, sum, 0, 2)) // 2 is number of
    // students.

  }

  def binarySearch(array: Array[Int],sum: Int, minInArray: Int,
                   numberOfStudents: Int)
  : Int = {
    val size = array.size
    if(size < numberOfStudents) return -1 // When students are more and books
    // are less then we cannot give every student atleast 1 book.
    var start = minInArray
    var end = sum
    var result = -1 // If allocation not possible, return -1
    while(start<=end){
      val mid = start + (end-start)/2
      // maximum == mid of the function. Which is our base assumpion can we
      // fit that max into given number of students
      if(isValid(array, numberOfStudents, mid) == true){
        result = mid
        end = mid - 1
      } else{
        start = mid + 1
      }

    }
    result
  }

  private def isValid(array: Array[Int], numberOfStudents: Int, maximumElement: Int): Boolean = {
    var student = 1
    var sum = 0
    array.foreach{ x =>
      sum = sum + x
      if(sum > maximumElement) {
        student += 1
        sum = x
      }
      if(student > numberOfStudents) return false // We need more students
      // than what is promised.
    }
    true
  }
}
