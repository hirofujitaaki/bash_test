object Main extends App {
  val src = io.Source.fromFile(args(0)).getLines.toList.map(_.toInt)

  def checkComb(n: Int): IndexedSeq[Int] =
    for {
      a <- 0 to 9
      b <- 0 to 9
      c <- 0 to 9
      d <- 0 to 9
      if a + b + c + d == n
    } yield n

  for (i <- src) println(checkComb(i).length)
}
