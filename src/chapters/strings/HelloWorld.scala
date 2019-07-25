package chapters.strings

object HelloWorld {
  def main(args: Array[String]) {
    val str = "Hello, World"
    println(str)

    // check the type of a Scala string

    println(str.getClass.getName)
  }
}