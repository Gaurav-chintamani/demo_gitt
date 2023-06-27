object odd_num {
  def main(args: Array[String]): Unit = {
    for (num <- 251 to 51 by -1){
      if (num % 2 == 1){
        println(num)
      }
    }
  }

}
