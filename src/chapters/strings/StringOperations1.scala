package chapters.strings

object StringOperations1 {
  def main(args: Array[String]) {

    val s = "Hello, world"
    println(s.length); // s.length is equivalent to s.length()

    val firstName = "Sudhir"
    val lastName = "Kumar"

    println(firstName + " " + lastName)

    "Scala".foreach(println)

    for (c <- "India") println(c)

    "July".getBytes.foreach(println)

    val result = "Jelly".filter(_ != 'y')
    println(result)
    
    println("Scala".drop(2).take(2).capitalize)  // drop and take are collection methods
  }
}

/*
 * Notes:
 * 
 * 1. since a Scala String is a Java String, we can use all the normal Java string methods.
 * 2. since Scala offers the magic of implicit conversions, String instances also have access
 * to all the methods of the StringOps class, so we can do many other things with them, such
 * as treating a String instance as a sequence of characters. As a result, we can iterate over
 * every character in the string using the foreach method.
 * 3. we can treat it as a sequence of bytes.
 * 4. Because there are many methods available on sequential collections, we can also use other
 *  functional methods like 'filter'.
 * 5. implicit conversion from String to StringOps happens in the Predef object 
 * 6. A Scala String has both string and collection features
 *  
 * important String classes: StringContext, StringOps, StringView, WrappedString, StringBuilder 
 */
