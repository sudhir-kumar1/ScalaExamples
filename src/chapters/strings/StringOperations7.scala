package chapters.strings

/*
 * Problem: search for regular-expression patterns in a string, and replace them.
 *
 * Solution: Because a String is immutable, we can’t perform find-and-replace operations
 * directly on it, but we can create a new String that contains the replaced contents.
 */

object StringOperations7 {
  def main(args: Array[String]) {
    val address = "123 Main Street".replaceAll("[0-9]", "x")
    println(address)

    val regex = "[0-9]".r
    val maskedStr = regex.replaceAllIn("bcppk7477k", "x")
    println(maskedStr)

    val result = "123".replaceFirst("[0-9]", "x")
    println(result)

    val regex2 = "H".r
    println(regex2.replaceAllIn("Hello", "Y"))

    // regular-expression groups
    val pattern = "([0-9]+) ([A-Za-z]+)".r
    val pattern(count, fruit) = "100 Bananas"
    println(fruit + "->" + count)

    getSearchResults("movies 80301")

    getSearchResults("movies near boulder, co")

    getSearchResults("movies near boulder, co ")

    getSearchResults("movies to be released this Friday") // we didn't define a regex to match this query

  }

  def getSearchResults(searchString: String) {
    // match "movies 80301"
    val MoviesZipRE = "movies (\\d{5})".r

    // match "movies near boulder, co"
    val MoviesNearCityStateRE = "movies near ([a-z]+), ([a-z]{2})".r

    searchString.trim match {
      case MoviesZipRE(zip)                   => { println("Hush") }
      case MoviesNearCityStateRE(city, state) => { println(List("Titanic", "Troy")) }
      case _                                  => println("did not match a regex")
    }
  }
}