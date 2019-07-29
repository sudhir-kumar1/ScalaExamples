package chapters.strings

/*
 * Problem: get a character at a specific position in a string
 * Solution: We can treat a String as an Array, and access each character with the array notation
 */

object StringOperations8 {
  def main(args: Array[String]) {

    // Java way
    val char1 = "Hello".charAt(0)
    println(char1)

    // Scala way
    val char2 = "Hello"(1) // short-hand for "hello".apply(1)
    println(char2)

    val char3 = "Hello".apply(2)
    println(char3)
  }
}