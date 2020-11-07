package trial

object hello {
  def main(args: Array[String]): Unit = {
    println("Hello world")

    val name = "mark"
    val age = 18.5

    println(name + " is " + age + " years old")
    println(s"$name is $age years old")
  /*  println(f"$name%s is $age%f years old")
    println(s"hello \nworld")*/
  //  println(raw"hello \nworld")
  }
}