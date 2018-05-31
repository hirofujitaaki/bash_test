// object Main {
//   def main(args: Array[String]): Unit = {
//     val li = List.range(1, 10)

//     for { i <- li
//           j <- li
//     } println(s"${i}x${j}=${i*j}")
//   }
// }


object Main extends App {
  for { i <- 1 to 9
        j <- 1 to 9
  } println(s"${i}x${j}=${i*j}")
}

