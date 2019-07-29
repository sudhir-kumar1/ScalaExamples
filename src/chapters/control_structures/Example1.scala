package chapters.control_structures

/*
 * Looping with for and foreach
 *
 * Problem: You want to iterate over the elements in a collection, either to operate
 * on each element in the collection, or to create a new collection from the existing collection.
 *
 * Solution: There are many ways to loop over Scala collections, including for loops, while loops,
 * and collection methods like foreach, map, flatMap, and more. This solution focuses primarily
 * on the for loop and foreach method.
 */

object Example1 {
  def main(args: Array[String]) {
    val fruits = Array("apple", "orange", "banana")

    for (fruit <- fruits) println(fruit)

    // add a block for multiple lines
    for (fruit <- fruits) {
      val f = fruit.toUpperCase
      println(f)
    }

    /* Returning values from a for loop
     *
     * use the for/yield combination in case building
     *  a new collection from the input collection is required
     */

    val newArray = for (e <- fruits) yield e.toUpperCase
    newArray.foreach(println)

    // for multi-line block
    val newArray2 = for (e <- fruits) yield {
      val s = e.toUpperCase
      s
    }
    println("-----------")
    newArray2.foreach(println)

    /* for loop counters
     *
     * access array elements with a counter
     *
     */
    for (i <- 0 until fruits.length) {
      println(s"$i is ${fruits(i)}")
    }

    println("-----------")
    // using zipWithIndex method
    for ((e, count) <- fruits.zipWithIndex) {
      println(s"$count is $e")
    }

    /* Generators and guards
     *
     * using a Range to execute a loop for certain no of times
     *
     */
    val r = scala.util.Random
    for (i <- 1 to 3) println(r.nextInt(100))

    for (i <- 1 to 10 if i % 2 == 0) println(i)

    // Looping over a Map
    val names = Map(
      "fname" -> "Robert",
      "lname" -> "Goren")
    for ((k, v) <- names) println(s"key: $k, value: $v")

    val languages = List("R", "Python", "Scala", "Java")
    languages.foreach(e => println(e.toUpperCase))

    languages.foreach { e =>
      val l = e.toLowerCase
      println(l)
    }
  }
}

/*
 * Notes:
 * 
 * when we use the for/yield combination with a collection, we’re building and 
 * returning a new collection, but when we use a for loop without yield, we’re 
 * just operating on each element in the collection — we’re not creating a new 
 * collection. The for/yield combination is referred to as a for comprehension, 
 * and in its basic use, it works just like the map method.
 * 
 * How for loops are translated?
 * 1. A simple for loop that iterates over a collection is translated to a 
 * foreach method call on the collection.
 * 2. A for loop with a guard is translated to a sequence of a withFilter 
 * method call on the collection followed by a foreach call.
 * 3. A for loop with a yield expression is translated to a map method call on the collection.
 * 4. A for loop with a yield expression and a guard is translated to a withFilter 
 * method call on the collection, followed by a map method call.
 */
