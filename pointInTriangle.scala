object Main extends App {
  val src: List[List[Double]] = io.Source.fromFile(args(0)).getLines.map(_.split(" ").toList.map(_.toDouble)).toList

  def format(li: List[Double]): List[(Double, Double)] = {
    li.sliding(2, 2).toList.map { case List(x, y) => (x, y) }
  }

  for (li <- src) {
    println(format(li))
  }

}
