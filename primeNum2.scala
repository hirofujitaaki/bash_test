/* sample input
 * 19
 * 3517
 *
 * sample output
 * 17 23
 * 3511 3527
 */

object Main extends App {
  val src: Iterator[Int] = io.Source.fromFile(args(0)).getLines.map(_.toInt)

  def isPrime(n: Int) = n >= 2 && (2 to math.sqrt(n).toInt).forall(n%_ != 0)
  def findPrimeOver(curr: Int): Int = if (isPrime(curr)) curr else findPrimeOver(curr + 1)
  def findPrimeUnder(curr: Int): Int = if (isPrime(curr)) curr else findPrimeUnder(curr - 1)

  for (num <- src) println(s"${findPrimeUnder(num-1)} ${findPrimeOver(num+1)}")
}
