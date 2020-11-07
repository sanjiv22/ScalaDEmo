package trial

/*
 * currying is the technique of transforming a function
 * that takes multiple argument into a function
 * that takes a single argument
 */

object Currying {

  def add(x: Int, y: Int) = x + y;

  def add2(x: Int) = (y: Int) => x + y; // currying function

  def add3(x: Int)(y: Int) = x + y // currying function

  def main(args: Array[String]) {
    println(add(20, 30))
    println(add2(20)(30)) // calling currying function method 1

    val sum40 = add2(40) // calling currying function method 2
    println(sum40(30))

    println(add3(10)(20));

    val sum50 = add3(20)(_: Int); // partial application
    println(sum50(30));

  }
}