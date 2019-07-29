package chapters.numbers

/*
 * Problem: You want to format numbers or currency to control decimal places and commas,
 * typically for printed output.
 *
 * Solution: For basic number formatting, use the f string interpolator
 */

object Example6 {
  def main(args: Array[String]) {
    val pi = scala.math.Pi
    println(f"$pi%1.5f")
    println(f"$pi%1.2f")
    println(f"$pi%05.2f")

    import java.util.{ Currency, Locale }
    val de = Currency.getInstance(new Locale("de", "DE"))

    val formatter = java.text.NumberFormat.getCurrencyInstance
    println(formatter.format(123.456789))

    formatter.setCurrency(de)
    println(formatter.format(123456.789))
  }
}