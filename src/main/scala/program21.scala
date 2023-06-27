object program21 {
  def main(args: Array[String]): Unit = {
    val start = 10
    val end = -5

    for (num <- start to end by -1) {
      val nextNum = num - 1
      println(s"$num@$nextNum")
    }
  }

}
