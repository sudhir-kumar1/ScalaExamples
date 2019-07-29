package chapters.strings.utils

object StringUtilities {
  implicit class StringImprovements(val s: String) {
    def increment = s.map(c => (c + 1).toChar)
    def hideAll = s.replaceAll(".", "*")
  }

  implicit class StringToInt(s: String) {
    def toInt(radix: Int) = Integer.parseInt(s, radix)
  }
}