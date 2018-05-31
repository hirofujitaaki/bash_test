object Main extends App {
  val src = io.Source.fromFile(args(0)).getLines.toList
  println((0 /: src)((acc, str) => if (str == str.reverse) acc + 1 else acc))
}
