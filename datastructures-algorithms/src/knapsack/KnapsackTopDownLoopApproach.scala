package knapsack

/**
 * Created by Sandeep Belgavi on 6/30/2021
 */
object KnapsackTopDownLoopApproach {
  def main(args: Array[String]): Unit = {
    println("Hello Knapsack")
    println(
    "Max profit via knapsack algorithm ==> " + knapsack(
          Array(1, 2, 3, 4),
          Array(8, 7, 6, 5),
    5,
    4
      )
    )

    println(
      "Max profit via knapsack algorithm ==> " + knapsack(
        Array(10, 20, 30),
        Array(60,100,120),
        50,
        3
      )
    )
  }

  def knapsack(weight: Array[Int],
               value: Array[Int],
               weightOfKnapsack: Int,
               numberOfItemsInArray: Int): Int = {
    val m = numberOfItemsInArray + 1
    val n = weightOfKnapsack + 1 // Number of rows would be number of
    // itesm + 1 as we initialize all 0,0 combination to 0 value
    val twoDArray = Array.fill(m,n)(-1)

    for (i <- 0 until m) {
      for (j <- 0 until n) {
        if (i == 0 || j == 0)
          twoDArray(i)(j) = 0
      }
    }
    for (i <- 1 until m) {
      for (j <- 1 until n) {

        if(weight(i-1) <= j) twoDArray(i)(j) = scala.math.max(value(i-1) + twoDArray(i-1)
        (j-weight(i-1)),twoDArray(i-1)(j)) else twoDArray(i)(j) = twoDArray(i-1)(j)
      }
    }
    twoDArray(m-1)(n-1)
  }
}
