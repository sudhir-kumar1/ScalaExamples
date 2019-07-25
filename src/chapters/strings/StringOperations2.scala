package chapters.strings

object StringOperations2 {
  def main(args: Array[String]) {

    // String equality test
    val s1 = "Hello"
    val s2 = "Hello"

    val s3 = "H" + "ello"

    println(s1 == s2)
    println(s1 == s3)

    val s4: String = null

    println(s3 == s4)
    println(s4 == s3)

    val s5 = "Japan"
    val s6 = "japan"

    println(s5.toUpperCase == s6.toUpperCase) // case-insensitive comparison

    println(s5.equalsIgnoreCase(s6)) // Java style comparison
  }
}

/*
 * Notes:
 * 
 * 1. A pleasant benefit of the == method is that it doesn’t throw a NullPointerException 
 * on a basic test if a String is null.
 * 2. In Scala, we test object equality with the == method. This is different than Java, where 
 * we use the equals method to compare two objects.
 * 3. In Scala, the == method defined in the AnyRef class first checks for null values, and then 
 * calls the equals method on the first object (i.e., this) to see if the two objects are equal. 
 * As a result, we don’t have to check for null values when comparing strings.
 *  
 */

