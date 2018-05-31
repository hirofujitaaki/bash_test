/*
 /sample input
 / 1,1,1,1,1,1,1,1,1,1,40,60
 / 1,1,1,1,1,3,3,3,3,3,50,50
 / 10,10,10,10,10,10,10,10,10,10,50,49
 /
 / sample output
 / 4
 / 7
 / 6
 */

// object Main extends App {
//   val src: List[List[Int]] = io.Source.fromFile(args(0)).getLines.map(_.split(",").map(_.toInt).toList).toList

//   def whereToMeet(li: List[Int]): Int = {
//     val numOfStations = 10
//     val (spans, ratio) = li.splitAt(10)

//     val distanceFromHead = spans.sum * ((ratio(0): Double) / (ratio(0) + ratio(1)))

//     def findThePoint(spans: List[Int], distanceFromHead: Double): List[Int] = {
//       if (distanceFromHead <= 0) spans
//       else findThePoint(spans.tail, distanceFromHead - spans.head)
//     }

//     numOfStations - findThePoint(spans, distanceFromHead).length
//   }

//   for (list <- src) println(whereToMeet(list))
// }

// object Main {
//     def main(args: Array[String]) = {
//         val in = io.Source.stdin.getLines.map(_.split(",").map(_.toInt).splitAt(10))
//         for ((l, v) <- in) println(l.scanLeft(0)(_ + _).indexWhere(v(0).toDouble * l.sum / v.sum <= _))
//     }
// }

object Main extends App {
  val src: Iterator[(Array[Int], Array[Int])] = io.Source.fromFile(args(0)).getLines.map(_.split(",").map(_.toInt).splitAt(10))

  for ((l, v) <- src) println(l)
}


object Main extends App {
  val li1 = List.range(1, 11)
  val li10 = List.range(10, 101, 10)

  println(li.map { i => li10.map { ii => i*ii }})

  println(for { i <- li1; ii <- li10 } yield (i * ii))
}
