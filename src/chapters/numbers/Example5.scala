package chapters.numbers

/*
 * Problem: create a range, list, or array of numbers, such as in a for loop, or for testing purposes.
 */

object Example5 {
  def main(args: Array[String]) {
    val r = 1 to 10 // 1 to 10 is equivalent to 1.to(10)
    r.foreach(println)

    for (i <- 1 to 10 by 2) println(i)

    for (i <- 1 to 10 by 3) println(i)

    for (i <- 1 to 5) println(i)

    for (i <- 1 until 5) println(i) // prints till 4

    // convert a Range to other sequences, such as an Array or List
    val arr1: Array[Int] = 1 to 10 toArray
    val arr2 = (1 to 10).toList

    println(arr1)
    println(arr2)

    // range of doubles
    println(for (i <- 1 to 5) yield i.toDouble)
  }
}