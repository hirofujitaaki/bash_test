/* sample input
 * 100,20
 * 50,10
 * 70,35
 *
 * sample output
 * 4950
 * 22
 */

object Main extends App {
  val src = io.Source.fromFile(args(0)).getLines.map(_.split(",").map(_.toInt).toList).toList

  val sum = (0 /: src){ (num, li) => num + li(0) * li(1) }
  val avg = math.round(((for (li <- src) yield (li(1))).sum / src.length.toDouble))

  println(s"${sum}\n${avg}")
}
