object program19 {
  def main(args: Array[String]): Unit = {
    val start = 5
    val end = 102
    var sum = 0

    for (num <- start to end) {
      sum += num * num
    }

    println(sum)
  }

}
