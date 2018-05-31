object Main extends App {
  val src: List[IndexedSeq[Double]] = io.Source.fromFile(args(0)).getLines.toList.tail.map(_.split(" ").map(_.toDouble).toIndexedSeq)

  def checkPrarallel(coords: IndexedSeq[Double]): String = {
    val slope1 = (coords(3) - coords(1)) / (coords(2) - coords(0))
    val slope2 = (coords(7) - coords(5)) / (coords(6) - coords(4))
    if (slope1 == slope2) "YES" else "NO"
  }

  for (coords <- src) println(checkPrarallel(coords))
}
