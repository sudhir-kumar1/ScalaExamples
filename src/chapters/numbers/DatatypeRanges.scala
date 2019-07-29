package chapters.numbers

object DatatypeRanges {
  def main(args: Array[String]) {
    val byteMin = Byte.MinValue
    val byteMax = Byte.MaxValue

    val shortMin = Short.MinValue
    val shortMax = Short.MaxValue

    val intMin = Int.MinValue
    val intMax = Int.MaxValue

    val longMin = Long.MinValue
    val longMax = Long.MaxValue

    val floatMin = Float.MinValue
    val floatMax = Float.MaxValue

    val doubleMin = Double.MinValue
    val doubleMax = Double.MaxValue

    println(s"Byte range: $byteMin to $byteMax")
    println(s"Short range: $shortMin to $shortMax")
    println(s"Int range: $intMin to $intMax")
    println(s"Long range: $longMin to $longMax")
    println(s"Float range: $floatMin to $floatMax")
    println(s"Double range: $doubleMin to $doubleMax")
  }
}

/*
 * Notes:
 * 
 * In Scala, all the numeric types are objects, including Byte, Char, Double, Float, Int,
 * Long, and Short. These seven numeric types extend the AnyVal trait, as do the Unit and 
 * Boolean classes, which are considered to be “nonnumeric value types.”
 * 
 * Further readings: BigInt and BigDecimal classes, methods in scala.math package
 * 
 * check out the Spire project, which includes classes like Rational,Complex, Real, and more; 
 * and ScalaLab, which offers Matlab-like scientific computing in Scala.
 */
