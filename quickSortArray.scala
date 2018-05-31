def sort(xs: Array[Int]): Array[Int] = {
  println(xs.mkString(" "))

  if (xs.length <= 1) xs
  else {
    val pivot = xs(xs.length / 2)
    Array.concat(sort(xs.filter(_ < pivot)),
                 xs.filter(_ == pivot),
                 sort(xs.filter(_ > pivot)))
  }
}
