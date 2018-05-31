object Main extends App {
  val src: List[List[Int]] = io.Source.fromFile(args(0)).getLines.map(_.split(" ").map(_.toInt).toList).toList

  val intList: List[Int] = List.range(0, 10)

  for { List(a, b) <- src if (b != 0) } {
            for { i <- intList
                  j <- intList
                  n <- intList
                  if (i + j + n == b)
                  if (i < j && j < n)
            } println(s"$i + $j + $n == $b")
  }
}

import scala.io.StdIn.readLine

object Main {
  def sum(n:Int, s:Int, x:Int):Int = {
    if(n==1) { if(s >= 0 && s<=9 && s > x ) 1 else 0 }
    else { for(i <- x+1 to 9 if s>=i ) yield sum(n-1,s-i,i) }.sum
  }

  def getSum(sb:StringBuilder):Unit = {
    val r = readLine.split(" ").map(_.toInt)

    if(r(0)==0 && r(1)==0) print(sb.result)
    else {
      println(sum(r(0),r(1),-1))
      getSum(sb)
    }
  }

  def main(args:Array[String]) = getSum(new StringBuilder)
}
