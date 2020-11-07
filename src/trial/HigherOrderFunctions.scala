package trial

// higher order functions

object HigherOrderFunctions {

  def math(x: Double, y: Double, func: (Double, Double) => Double): Double = func(x, y);

  def math1(x: Double, y: Double, z: Double, func: (Double, Double) => Double): Double = func(func(x, y), z);

  def main(args: Array[String]) {
    val result = math(10, 20, (x, y) => x min y)
    val result1 = math(10, 20, (x, y) => x max y)
    val result2 = math(10, 20, (x, y) => x + y)

    val result3 = math1(10, 20, 30, (x, y) => x + y)

    val result4 = math1(10, 20, 30, _ max _) // _ as wildCard

    println(result)
    println(result1)
    println(result2)

    println(result3)
    println(result4)
  }
}