/* sample input
 * Thereare100yenonthetable.Iam17yearsold.
 * Ishouldgohomeat6pm.
 *
 * sample output
 * 123
 */

object Main extends App {
  val pattern = "([0-9]+)".r

  val matches = for (str <- io.Source.fromFile(args(0)).getLines)
                  yield pattern.findAllIn(str)

  println(matches.flatten.map(_.toInt).sum)
}
