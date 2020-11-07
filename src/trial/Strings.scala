package trial

//Strings

object Strings {

  val str1: String = "hello world";

  val num1 = 75;
  val num2 = 60.77;

  def main(args: Array[String]) {
    println(str1)
    println(str1.length())
    println(str1.charAt(4))

    println(str1.concat(" max"))
    println(str1 + " max")

    val res = printf("(%d -- %f -- %s)", num1, num2, str1);
    println(res)

    val res1 = ("(%d -- %f -- %s)".format(num1, num2, str1));
    println(res1)

    printf("(%d -- %f -- %s)", num1, num2, str1);
  }
}