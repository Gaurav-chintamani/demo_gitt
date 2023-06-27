object program22 {
  def main(args: Array[String]): Unit = {
    val start = 100
    val end = 10000
    val step = 100

    for (num <- start to end by step) {
      println(num)
    }
  }

}
