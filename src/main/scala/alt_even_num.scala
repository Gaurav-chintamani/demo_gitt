object alt_even_num {
  def main(args: Array[String]): Unit = {

    for (i <- 20 to 140 by 4) {
      if (i % 2 == 0) {
        println(i)
      }
    }
  }

}
