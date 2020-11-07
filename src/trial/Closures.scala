package trial

// closures

/* A closure is a function which uses one or more variables
 *  declared outside this function */
object Closures {

  var number = 10; // number is also called free variable because the function add doesn't know the actual value of number
  //data type of number is var then function is impure closure else if val then pure closure

  val add = { x: Int } => x + number;

  def main(args: Array[String]) {
    number = 100;
    println(add(20))
  }
}