object program27 {
  def main(args: Array[String]): Unit = {

    for (num <- 1 to 24) {
      if (num % 3 == 0) {
        println("Factor of three")
      }
      else {
        println(num)
      }
    }
  }
}
