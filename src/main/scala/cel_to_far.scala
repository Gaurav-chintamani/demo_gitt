import scala.io.StdIn

object cel_to_far {
  def main(args: Array[String]): Unit = {

    println("enter temp in celcius: ")
    val celcius = StdIn.readDouble()

    val fahrenheit = celcius * 9/5 + 32
    print(s"${celcius}Degree Celcius is equal to ${fahrenheit}Fahrenheit")
  }
}