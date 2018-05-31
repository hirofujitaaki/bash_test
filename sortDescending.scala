object Main extends App {
  val src = io.Source.fromFile(args(0)).getLines.next.split(" ").map(_.toInt).toList

  def sortDescending(li: List[Int]): List[Int] = li match {
    case Nil => Nil
    case h :: tail => insert(h, sortDescending(tail))
  }

  def insert(n: Int, li: List[Int]): List[Int] = li match {
    case Nil => List(n)
    case h :: tail => if (n > h) n :: li
                      else h :: insert(n, tail)
  }

  println(sortDescending(src).mkString(" "))
}

