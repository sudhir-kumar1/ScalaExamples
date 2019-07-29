package chapters.numbers

/*
 * Problem: convert from one numeric type to another, such as from an Int to a Double.
 *
 * Solution: use the to* methods that are available on all numeric types.
 */

object Example2 {
  def main(args: Array[String]) {
    val intVal = 45
    val doubleVal = intVal.toDouble
    val floatVal = intVal.toFloat
    val longVal = intVal.toLong

    println(doubleVal)
    println(floatVal)
    println(longVal)
  }
}