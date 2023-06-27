object program25 {
  def main(args: Array[String]): Unit = {
    val start = 4
    val end = -12
    val step = -1

    for (num <- start to end by step) {
      print(s"5*$num, ")
    }

    for (num <- start to end by step) {
      val res = 5 * num
      println(res)
    }
  }

}
