package chapters.strings

object StringOperations4 {
  def main(args: Array[String]) {

    // perform variable substitution into a string

    val name = "Fred"
    val age = 34
    val weight = 70

    println(s"$name is $age years old, and weighs $weight kg.") // using "s string interpolator"

    // Using expressions in string literals

    println(s"$name will be ${age + 1} next year.")
    println(s"Fred is 34 years old: ${age == 34}")

    // printing object fields

    case class Student(name: String, score: Int)

    var hannah = Student("Hannah", 95)
    println(s"${hannah.name} has a score of ${hannah.score}.")

    println(s"$hannah.name has a score of $hannah.score") // just putting $hannah would call toString method

    // The f string interpolator (printf style formatting)
    val interestRate = 34.5
    println(f"$interestRate%.2f")

    // The raw interpolator
    println(raw"foo\nbar")

    // prior to version 2.10
    println("%s is %d years old".format(name, age))
  }
}

/*
 * Notes:
 * 1. To use basic string interpolation in Scala, precede your string with the letter s and 
 * include your variables inside the string, with each variable name preceded by a $ character.
 * 2. Prepending the string with letter s, creates a processed string literal.
 * 3. s, f and raw are string interpolation functions. We can define our own interpolators.
 * 
 */
