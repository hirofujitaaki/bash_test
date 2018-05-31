/* sample input
 * 123,10
 * 56,12
 * 34,14
 *
 * 123,3
 * 56,4
 * 123,5
 *
 * sample output
 * 56 2
 * 123 3
 */

object Main extends App {

  val src = io.Source.fromFile(args(0)).getLines.flatMap(_.split(",")).toList
  val (as, bs) = src.splitAt(src.indexOf(""))
  val xs = as.collect { case x if as.indexOf(x) % 2 == 0 => x.toInt }
  val ys = bs.collect { case y if bs.indexOf(y) % 2 != 0 => y.toInt }

  for (num <- xs.intersect(ys).sorted) println(s"${num} ${src.count(_ == num.toString)}")
}
