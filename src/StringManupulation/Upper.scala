package StringManupulation

object Upper {
  def upper(strings: String*): Seq[String] = {
    strings.map((s: String) => s.toUpperCase())
  }

  def main(args: Array[String]): Unit = {
    println(upper("sanjiv"));

    var a: Int = 10
    println(a + 40)
    val b: Int = 20
    println(b + 20)
    a = 30
    println(b)
    var c = true
    println(c)
    val x = { val a: Int = 200; val b: Int = 300; a + b }
    println(x)
    val y = {
      val a: Int = 200
      val b: Int = 300
      a + b
    }
    println(y)
    val aa:Int=x*30
  }
}