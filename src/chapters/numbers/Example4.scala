package chapters.numbers

// Generating Random Numbers

object Example4 {
  def main(args: Array[String]) {
    val r = scala.util.Random
    println(r.nextInt)

    // limit the random numbers to a maximum value
    println(r.nextInt(100)) // returns an Int from 0 to 99

    // returns a value between 0.0 and 1.0
    println(r.nextFloat)
    println(r.nextDouble)

    // set the seed value
    val r2 = scala.util.Random
    r2.setSeed(500L)

    println(r2.nextInt)
    println(r.nextPrintableChar)

    // create a random-length range of numbers
    val range = 0 to r.nextInt(15)
    range.foreach(println)

    println(for (i <- 0 to r.nextInt(10)) yield i * 2)

    println(for (i <- 0 to r.nextInt(10)) yield r.nextPrintableChar)
  }
}