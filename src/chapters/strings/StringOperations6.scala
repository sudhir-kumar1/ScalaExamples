package chapters.strings

/*
 * Problem: determine whether a String contains a regular expression pattern
 *
 * Solution: Create a Regex object by invoking the .r method on a String, and
 * then use that pattern with findFirstIn when you’re looking for one match,
 * and findAllIn when looking for all matches.
 */

object StringOperations6 {
  def main(args: Array[String]) {
    val numPattern = "[0-9]+".r
    val address = "123 Main Street Suite 101"

    val match1 = numPattern.findFirstIn(address)
    println(match1.get)

    val matches = numPattern.findAllIn(address)
    matches.foreach(println)

    numPattern.findAllIn("Plot no 26, Street no 4").foreach { e =>
      println(s"Found a match: $e")
    }

    // other option
    import scala.util.matching.Regex

    val numPattern2 = new Regex("[0-9]+")
    println(numPattern2.findFirstIn("64 Green Medows"))

    println(numPattern2.findFirstIn("Welmont Road").getOrElse("no match"))

  }
}

/*
 * Notes:
 * 1. An Option is a collection of zero or one elements.
 * 2. A method defined to return an Option[String] will either return a Some(String), or a None.
 * 3. The normal way to work with an Option is to use one of these approaches:
 * 		- Call getOrElse on the value.
 * 		- Use the Option in a match expression.
 * 		- Use the Option in a foreach loop.
 * 
 */
