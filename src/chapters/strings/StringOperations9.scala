package chapters.strings

/*
 * Problem:
 *
 * Rather than create a separate library of String utility methods, like a StringUtilities
 * class, you want to add your own behavior(s) to the String class, so you can write code
 * like this:
 * 		"HAL".increment
 * Instead of this:
 * 		StringUtilities.increment("HAL")
 *
 *
 * Solution: define an implicit class, and then define methods within that class to implement
 * the desired behavior
 */

object StringOperations9 {
  def main(args: Array[String]) {
    import chapters.strings.utils.StringUtilities.StringImprovements
    
    println("Hello".increment)
    println("SSN".hideAll)
  }
}

/*
 * Notes:
 * 1. “An implicit class must be defined in a scope where method definitions are 
 * allowed (not at the top level).” This means that your implicit class must be 
 * defined inside a class, object, or package object.
 * 
 * 2. in Scala, we can add new functionality to closed classes by writing implicit 
 * conversions and bringing them into scope when we need them. A major benefit of 
 * this approach is that we don’t have to extend existing classes to add the new functionality. 
 * For instance, there’s no need to create a new class named MyString that extends String, 
 * and then use MyString throughout our code instead of String; instead, we define the behavior 
 * we want, and then add that behavior to all String objects in the current scope when we add the import statement.
 */
