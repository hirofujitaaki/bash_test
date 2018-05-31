object Main extends App {
  val src = io.Source.fromFile(args(0)).getLines

  def checkRTriangle(a: Int, b: Int, c: Int): String = {
    if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) "YES"
    else "NO"
  }

  for (i <- 1 to src.next.toInt) {
    val Array(a, b, c) = src.next.split(" ").map(_.toInt)
    println(checkRTriangle(a, b, c))
  }

  // for (str <- src; if str.length != 1) {
  //   val Array(a, b, c) = str.split(" ").map(_.toInt)
  //   println(checkRTriangle(a, b, c))
  // }
}
