object Main extends App {
  println(io.Source.fromFile(args(0)).getLines.next.reverse)

  def myReverse(str: String) = str match {
    case h :: tail => println(h)
  }

  def myReverse(str: String): String = {
    if (str.isEmpty) ""
    else myReverse(tail) + str.head
  }

  def myReverse2(str: String) = ("" /: str)((acc, b) => b + acc)

  def myReverse3(str: String) = str.reduceLeft((acc: Char, b: Char) => b + acc)

}
