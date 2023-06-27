import scala.io.StdIn

object kg_to_g {

  def main(args: Array[String]): Unit = {

    println("enter weight in kg: ")
    val kilograms = StdIn.readDouble()

    val grams = kilograms * 1000
    println(s"${kilograms}kg is equal to ${grams}g")
  }
}
