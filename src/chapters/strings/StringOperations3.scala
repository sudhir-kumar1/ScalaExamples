package chapters.strings

object StringOperations3 {
  def main(args: Array[String]) {

    // split a string into parts based on a field separator

    val line = "Sudhir,29-7-2019,HYD-PNQ,7:30pm"
    line.split(",").foreach(println)

    val foodItems = "eggs, milk, butter, Coco Puffs"
    foodItems.split(',').map(_.trim).foreach(println)

    val msg = "hello world, this is     Al".split("\\s+")
    msg.map(_.trim).foreach(println)

  }
}

/*
 * Notes:
 * 1. The string that the split method takes can also be a regular expression.
 * 2. The split method is overloaded, with some versions of the method coming from the 
 * Java String class and some coming from the Scala StringLike class. For instance, if 
 * we call split with a Char argument instead of a String argument, we’re using the 
 * split method from StringLike.
 * 
 */
