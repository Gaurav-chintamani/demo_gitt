import scala.io.StdIn

object program5 {
  def main(args: Array[String]): Unit = {
    println("Enter num: ")
    val num = StdIn.readDouble()

    if (num<0 && num>100) {
      println("Invalid Input")
    }else if (num>=90 && num<=100) {
      println("Super Smart")
    }else if (num>=80 && num<=90) {
      println("Smart")
    }else if (num>=70 && num<=80) {
      println("Smart Enough")
    }else if (num>=60 && num<=70) {
      println("Just Smart")
    }else if (num>=35 && num<=60) {
      println("No Smart")
    }else{
      println("Dump")
    }

  }

}
