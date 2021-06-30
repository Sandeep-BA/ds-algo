package knapsack

/**
 * Created by Sandeep Belgavi on 6/30/2021
 */
object KnapSackProblem {
  def main(args: Array[String]): Unit = {
    //    println("Knapsack value ==> "+knapsack(Array(1,2,3,4,5),Array(1,2,3,4,5),10,5))
    //    println("Knapsack value ==> "+knapsack(Array(10,20,30),Array(60,100,120),
    //    println("Knapsack value ==> "+knapsack(Array(5,5,5,5,5),Array(20,30,60,50,50),

    println(
      "Knapsack value ==> " + knapsack(
        Array(1, 2, 3, 4),
        Array(8, 7, 6, 5),
        5,
        4
      ))
  }

  def knapsack(weight: Array[Int],
               value: Array[Int],
               weightOfKnapsack: Int,
               numberOfItemsInArray: Int): Int = {
    println("Iteration ==> " + numberOfItemsInArray)
    if (numberOfItemsInArray == 0 || weightOfKnapsack == 0)
      return 0

    if (weight(numberOfItemsInArray - 1) <= weightOfKnapsack) scala.math.max(value(numberOfItemsInArray - 1) + knapsack(
      weight,
      value,
      weightOfKnapsack - weight(numberOfItemsInArray - 1),
      numberOfItemsInArray - 1
    ), knapsack(weight, value, weightOfKnapsack, numberOfItemsInArray - 1)
    ) else {
      //    if (weight(numberOfItemsInArray-1) > weightOfKnapsack){
      knapsack(weight, value, weightOfKnapsack, numberOfItemsInArray - 1).toInt
    }
  }
}
