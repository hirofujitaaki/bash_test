import scala.io.Source

def widthOfLength(str: String) = s.length.toString.length

if (args > 0) {
  val lines = Source.fromFile(args(0)).getLines.toInt

  val longestLine = lines.reduceLeft((a, b) => if (a.length > b.length) a else b )

  val maxWidth = widthOfLength(longestLine)

  for (line <- lines) {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    println(padding + line.length + " | " + line)
  }
}
else Console.err.println("Please enter filename")

def fib(n: Int): Int = {
  def loop(prev: Int, curr: Int, iter: Int): Int = {
    if (iter == 0) curr
    else loop(curr, prev+curr, iter-1)
  }

  loop(0, 1, n)
}
