import scala.io.Source

object Main extends App {
  val src = Source.fromFile(args(0)).getLines.map(_.toInt).toList
  val top3: List[Int] = src.sortWith(_>_).take(3) // li.slice(0, 3)
  top3.foreach(println)
}
