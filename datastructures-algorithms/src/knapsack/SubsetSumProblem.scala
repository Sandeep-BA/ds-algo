package knapsack

/*
Given an item array, can you find that is there any subset which is equals to
 the given sum.
 Hence the name subset sum problem.
 This is a similar variant of knapsack problem.
 Initialization and Condition( To either choose or not to )

 */

/**
 * Created by Sandeep Belgavi on 6/30/2021
 */
object SubsetSumProblem {
  def main(args: Array[String]): Unit = {
    println(
      "Subset Sum Problem Algorithm ==> " + subsetSumProblem(
        Array(2, 3, 7, 8, 10),
        11
      )
    )

    println(
      "Subset Sum Problem Algorithm ==> " + subsetSumProblem(
        Array(2, 3, 7, 8, 10),
        45
      )
    )
  }
  def subsetSumProblem(itemsArray: Array[Int], sum: Int): Boolean = {
    val (m, n) = (itemsArray.length + 1, sum + 1)
    val kanpsackArray = Array.ofDim[Boolean](m, n)
    for (i <- 0.until(m)) {
      for (j <- 0 until n) {
        if (i == 0) kanpsackArray(i)(j) = false
        if (j == 0) kanpsackArray(i)(j) = true
      }
    }

    for (i <- 1 until m) {
      for (j <- 1 until n) {
        if (itemsArray(i-1) <= j) kanpsackArray(i)(j) = kanpsackArray(i)(j - itemsArray(i-1)) ||
          kanpsackArray(i - 1)(j) else kanpsackArray(i)(j) = kanpsackArray(i - 1)(j)
      }
    }

    kanpsackArray(m - 1)(n - 1)
  }
}
