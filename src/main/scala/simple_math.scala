import scala.io.StdIn

object simple_math {
  def main(args: Array[String]): Unit = {

    println("enter num1: ")
    val num1 = StdIn.readDouble()

    println("enter num2: ")
    val num2 = StdIn.readDouble()

    println("enter operator(+,*,-,/): ")
    val operator = StdIn.readLine()

    val res = operator match {
      case "+" => num1 + num2
      case "-" => num1 - num2
      case "/" => num1 / num2
      case "*" => num1 * num2
    }
    println(s"Result is $res")
  }

}
