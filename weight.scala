object Main extends App {
  val src: Iterator[Int] = io.Source.fromFile(args(0)).getLines.map(_.toInt)
  val weightList: List[Int] = for (i <- List.range(9, -1, -1)) yield (math.pow(2, i).toInt)

  def weightPairs(n: Int) = {
    weightList.reverse.zip(((n, Nil) /:[(Int, List[Int])] weightList) { case ((a, b), c) => (a % c, (a / c) :: b )}._2)
  }

  for (n <- src) {
    val weightPairList = weightPairs(n)
    // println(weightPairList.map { case (a, b) => if (b == 1) a else 0 }.filter(_ != 0).mkString(" "))
    println(weightPairList.collect { case (a, b) if b == 1 => a }.mkString(" "))
  }
}

// import scala.io.Source.stdin

// object Main {
//   val w = List(1,2,4,8,16,32,64,128,256,512)
//   def main(args:Array[String]) =
//     println(stdin.getLines.map(_.toInt).map { i=>w.filter(y=>(y & i)>0).mkString(" ") }.mkString("\n"))
// }

/*
 * 5
 * 7
 * 127
 *
 */




