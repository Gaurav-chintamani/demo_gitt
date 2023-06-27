object divisible_by_11 {
  def main(args : Array[String]): Unit = {

    val range = 250 to 550

    for (i <- range) {
      if (i % 11 == 0){
        println(i)
      }
    }

  }

}
