package trial

// Function in scala

object Function {

  object Math {

    def add(a: Int, b: Int): Int = {
      return a + b
    }

    def square(x: Int): Int = x * x;
  }

  def add(a: Int, b: Int): Int = {
    return a + b
  }

  def sub(a: Int, b: Int): Int = a - b

  def mul(a: Int, b: Int): Int = a * b

  def div(a: Int, b: Int) = {
    a / b
  }

  def main(args: Array[String]) {
    println(add(4, 6))
    println(sub(4, 6))
    println(mul(4, 6))
    println(div(4, 6))

    println(Math.add(4, 9))

    println(Math square 4) // if function has single argument
  }
}