/* sample input
 * 2
 * 9
 * 0
 *
 * sample output
 * 5
 * 100
 */


object Main extends App {
  val src = io.Source.fromFile(args(0)).getLines.map(_.toShort)

  def isPrime(n: Short): Boolean = n >= 2 && (2 to math.sqrt(n).toShort).forall(n%_ != 0)

  def findPrimes(count: Short): List[Short] = {

    @annotation.tailrec
    def loop(num: Short, count: Short, acc: List[Short]): List[Short] = {
      if (count <= 0) acc
      else if (isPrime(num)) loop((num+1).toShort, (count-1).toShort, num :: acc)
      else loop((num+1).toShort, count, acc)
    }

    loop(2, count, Nil)
  }

  for (num <- src if num != 0) println(findPrimes(num).sum)

}
