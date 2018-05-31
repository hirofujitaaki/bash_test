// object Main extends App {
//   val src: Iterator[List[Int]] = io.Source.fromFile(args(0)).getLines.map(_.split(" ").map(_.toInt).toList)

//   val daysOfMonth: List[Int] = List(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

//   def figureDay(months: Int, days: Int): String = {
//     val dayReminder:Int = (daysList.take(months-1).sum + days) % 7
//     if (dayReminder == 5) "Tuesday"
//     else if (dayReminder == 6) "Wednesday"
//     else if (dayReminder == 1) "Thursday"
//     else if (dayReminder == 2) "Friday"
//     else if (dayReminder == 3) "Saturday"
//     else if (dayReminder == 4) "Sunday"
//     else "Monday"
//   }

//   for (li <- src if li != List(0, 0))
//     {
//       val List(months, days) = li
//       println(figureDay(months, days))
//     }

// }

// object Main {
//     def main(args: Array[String]) = {
//         val dates = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//         val days = List(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31).scanLeft(0)(_ + _)
//         val in = io.Source.stdin.getLines.map(_.split(" ").map(_.toInt))
//         in.takeWhile(!_.contains(0)).foreach(p => println(dates((days(p(0) - 1) + p(1) + 2) % 7)))
//     }
// }


// + 2 is a calibration because 1st of Jan start as a Thursday

object Main extends App {
  val src: Iterator[Array[Int]] = io.Source.fromFile(args(0)).getLines.map(_.split(" ").map(_.toInt))
  val days = List(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31).scanLeft(0)(_ + _)
  src.takeWhile(!._contains(0)).foreach(p=> println(dates((days(p(0) - 1) + p(1) + 2) % 7)))


}
