object program28 {
  def main(args: Array[String]): Unit = {

    for (num <- 1 to 25) {
      if (num % 5 == 0) {
        println("divisible by five")
      }
      else if (num%2!=0) {
        println(num)
      }
    }
  }
}
