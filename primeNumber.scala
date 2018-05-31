/* sample input
 * 10
 * 3
 * 11
 *
 * sample output
 * 4
 * 2
 * 5
 */


object Main extends App {
  val src = io.Source.fromFile(args(0)).getLines.map(_.toInt)

  def isPrime(n: Int): Boolean = n>1 && (2 to (math.sqrt(n).toInt)).forall(n%_ != 0)

  for (i <- src) println(List.range(1, i+1).filter(isPrime(_)).length)
}
