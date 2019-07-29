package chapters.numbers

/*
 * Problem: convert a String to one of Scala’s numeric types.
 *
 * Solution: Use the to* methods that are available on a String.
 */

object Example1 {
  def main(args: Array[String]) {
    val byteVal = "2".toByte
    val intVal = "1".toInt
    val floatVal = "100".toFloat
    val doubleVal = "215".toDouble

    val bigInt = BigInt("34")
    val bigDecimal = BigDecimal("786.5254")

    println(byteVal)
    println(intVal)
    println(floatVal)
    println(doubleVal)

    println(bigInt)
    println(bigDecimal)

    // Handling a base and radix
    val a = Integer.parseInt("100", 2)
    println(s"100 in binary is equal to $a in decimal")

    // using implicit class for conversion
    import chapters.strings.utils.StringUtilities.StringToInt
    println("101".toInt(2)) // prints 5 in decimal
    println("A5".toInt(16)) // prints 165 in decimal
    println("56".toInt(8)) // prints 46 in decimal

    // handling exception in parsing number from string

    println(toInt("12P").getOrElse("can't be parsed"))
    println(toInt("12").getOrElse("can't be parsed"))

    toInt("78x") match {
      case Some(n) => println(n)
      case None    => println("Boom! That wasn't a number.")
    }

    val result = toInt("401") match {
      case Some(x) => x
      case None    => 0
    }
    
    println(s"result = $result")
  }

  def toInt(s: String): Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case e: NumberFormatException => None
    }
  }

}

/*
 * Notes:
 * 
 * Scala doesn’t have checked exceptions. toInt handled the situation using Option/Some/None pattern
 */
