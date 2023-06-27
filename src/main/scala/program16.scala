object program16 {
  def main(args: Array[String]): Unit = {
    val start = 382
    val end = 582
    var sum = 0

    for (i <- start to end) {
      if (i % 2 == 0) {
        sum = sum + i
      }
    }

    println(sum)
  }

}
