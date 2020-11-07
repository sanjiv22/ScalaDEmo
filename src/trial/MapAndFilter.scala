package trial

//scala map and filter

object MapAndFilter extends App {
  val lst = List(1, 2, 3, 5, 7, 10, 13)
  val mymap = Map(1 -> "tom", 2 -> "jerry", 3 -> "micky")

  println(lst.map(_ * 2))
  println(lst.map(x => x * 2))
  println(lst.map(x => "hi " * 2))
  println(lst)

  println(mymap.map(x => "hi" * 2))
  println(mymap.mapValues(x => "hi " + x));

  println("hello".map(_.toUpper))

  println(List(List(1, 2, 3), List("sanjiv", 5, 6)).flatten);

  println(lst.flatMap(x => List(x, x * x)))

  println(lst.map(x => List(x, x * x)))

  println(lst.filter(_ > 2))

  println(lst.filter(x => x % 2 == 0))

  println(lst.filter(x => x % 2 != 0))

}