package chapters.strings

object StringOperations5 {
  def main(args: Array[String]) {

    // iterate through each character in a string, and perform an operation on each character
    val upper = "hello, world".map(c => c.toUpper)
    println(upper)

    val lower = upper.map(_.toLower)
    println(lower)

    val streetNo = "sector-   25".filter(_ != ' ')
    println(streetNo)

    // using for loop
    for (c <- "hello") println(c.toUpper)

    val upper2 = for (c <- "hello, world") yield c.toUpper // equivalent to map
    println(upper2)

    "August".foreach(println)

    // map examples
    val lower2 = "HELLO".map(c => (c.toByte + 32).toChar)
    println(lower2)

    val lower3 = "HELLO".map { c =>
      (c.toByte + 32).toChar
    }
    println(lower3)

    // custom method that would work on the char
    def toLower(c: Char): Char = (c.toByte + 32).toChar
    println("TOKYO".map(toLower))
    
    val city = for (c <- "PUNE") yield toLower(c)
    println(city)
  }
}

/* 
 * Notes:
 * 1. To write a for loop to work like a map method, add a yield statement to the end of the loop.
 * 2. Adding yield to a for loop essentially places the result from each loop iteration into a 
 * temporary holding area. When the loop completes, all of the elements in the holding area are 
 * returned as a single collection.
 * 3. Whereas the map or for/yield approaches are used to transform one collection into another, 
 * the foreach method is typically used to operate on each element without returning a result. 
 * This is useful for situations like printing.
 * 4. map treats a String as a sequential collection of Char elements. The map method has an 
 * implicit loop, and in that loop, it passes one Char at a time to the algorithm it’s given.
 * 
 */
