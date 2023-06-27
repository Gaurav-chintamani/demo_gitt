object program29 {
  def main(args: Array[String]): Unit = {
    val start = 0.5
    val end = 5.1
    val step = 0.2

    var num = start
    while (num <= end) {
      println(s"$num^2")
      num += step
    }
  }
}