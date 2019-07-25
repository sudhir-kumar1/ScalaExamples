package chapters.strings

object HelloWorld {
  def main(args: Array[String]) {
    val str = "Hello, World"
    println(str)

    // check the type of a Scala string

    println(str.getClass.getName)
  }
}

/*
 * Notes:
 * 
 * 1. using ; at the end of statement is optional in Scala
 * 2. str.getClass is equivalent to str.getClass() as it's 
 * optional to use () when method doesn't accept any parameter
 * 
 */

