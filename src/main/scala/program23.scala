object program23 {
  def main(args: Array[String]): Unit = {

    for (i <- 5 to 25) {
      if (i % 2 != 0) {
        println(s"$i^2")
      }
    }
  }
}