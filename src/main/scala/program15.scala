object program15 {
  def main(args: Array[String]): Unit = {
    for (num1 <- 2 to 16) {
      val num2 = num1 + 1
      println(s"$num1*$num2")
    }

  }
}