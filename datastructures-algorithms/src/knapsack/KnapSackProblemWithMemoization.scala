package knapsack

object KnapSackProblemWithMemoization {
  val dynamicProgrammingArray = Array.ofDim[Int](5, 5) // Creating a 2
  val dynamicProgrammingArrayWithPrefilledValue = Array.ofDim[Int](5, 5) //
  val twoDArray = Array.fill(6,5)(-1)
  // Creating a 2
  // dimensional array
  // Just make sure to pass on the arguments into comma seaprated values
  def main(args: Array[String]): Unit = {
    //    println("Knapsack value ==> "+knapsack(Array(1,2,3,4,5),Array(1,2,3,4,5),10,5))
    //    println("Knapsack value ==> "+knapsack(Array(10,20,30),Array(60,100,120),
    //    println("Knapsack value ==> "+knapsack(Array(5,5,5,5,5),Array(20,30,60,50,50),
    println(
      "Knapsack value ==> " + knapsack(
        Array(1, 2, 3, 4),
        Array(8, 7, 6, 5),
        5,
        4,
        twoDArray
      )
    )
    println("Value of 2 D Array ==> "+twoDArray)
    dynamicProgrammingArray.foreach { x =>
      println(x)
      println("           ")
      x.foreach { y =>
        println(y)
        println("\n")
      }
    }
  }

  def knapsack(weight: Array[Int],
               value: Array[Int],
               weightOfKnapsack: Int,
               numberOfItemsInArray: Int, twoDArray: Array[Array[Int]]): Int = {
    println("Iteration ==> " + numberOfItemsInArray)
    if (numberOfItemsInArray == 0 || weightOfKnapsack == 0)
      return 0
    if((twoDArray(weightOfKnapsack)(numberOfItemsInArray)) != 0 )
      return twoDArray(weightOfKnapsack)(numberOfItemsInArray)

    if (weight(numberOfItemsInArray - 1) <= weightOfKnapsack) {
      twoDArray(weightOfKnapsack)(numberOfItemsInArray) = scala.math.max(
        value(numberOfItemsInArray - 1) + knapsack(
          weight,
          value,
          weightOfKnapsack - weight(numberOfItemsInArray - 1),
          numberOfItemsInArray - 1,
          twoDArray
        ),
        knapsack(weight, value, weightOfKnapsack, numberOfItemsInArray - 1,twoDArray)
      )
      twoDArray(weightOfKnapsack)(numberOfItemsInArray)
    } else {
      //    if (weight(numberOfItemsInArray-1) > weightOfKnapsack){
      twoDArray(weightOfKnapsack)(numberOfItemsInArray) = knapsack(weight,
        value, weightOfKnapsack, numberOfItemsInArray - 1,twoDArray)
      twoDArray(weightOfKnapsack)(numberOfItemsInArray)
    }
  }
}
