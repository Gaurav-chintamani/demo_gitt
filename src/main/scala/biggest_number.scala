object biggest_number {
  def main(args: Array[String]): Unit = {

    val num1 = 8
    val num2 = 13
    val num3 = 7

    val biggestnumber = if (num1>=num2 && num1>=num3) {
      num1
    } else if (num2>=num3 && num2>=num1) {
      num2
    } else {
      num3
    }
    println(s"the biggest number is $biggestnumber")
  }
}
