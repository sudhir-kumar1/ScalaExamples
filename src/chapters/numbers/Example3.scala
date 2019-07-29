package chapters.numbers

/*
 * Problem: Scala automatically assigns types to numeric values when you assign them, 
 * and you need to override the default type it assigns as you create a numeric field.
 */

object Example3 {
  def main(args: Array[String]) {
    val num1 = 56
    println(num1.getClass.getName)
    
    val num2 = 25d
    println(num2.getClass.getName)
    
    val num3 = 25f
    println(num3.getClass.getName)
    
    val num4 = 40L
    println(num4.getClass.getName)
    
    // overriding the default type
    val num5 = 85 : Byte
    println(num5.getClass.getName)
    
    val num6:Short = 10
    println(num6.getClass.getName)
  }
}