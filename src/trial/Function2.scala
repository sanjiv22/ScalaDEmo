package trial

// More in Function in scala

object Function2 {

  object Math {

    def add(a: Int = 4, b: Int = 3): Int = {
      return a + b
    }

    def square(x: Int): Int = x * x;

    def -(a: Int, b: Int): Int = { a + b }

    def **(a: Int): Int = { a * a }
  }

  def print(x: Int, y: Int): Unit = {
    println(Math.add(x, y))
  }

  def main(args: Array[String]) {
    println(Math.add(5))
    println(Math square 3)

    print(40, 50)

    val sum = 10 + 10;
    println(sum)

    //anonymous function
    var add = (xx: Int, yy: Int) => xx + yy
    println(add(100, 200))

  }

}