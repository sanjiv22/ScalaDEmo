package trial

//Scala Options   // returns some or none
object OptionsScala extends App {

  val lst = List(1, 2, 3)
  val map = Map(1 -> "tom", 2 -> "jerry", 3 -> "micky")

  val opt: Option[Int] = Some(5);

  println(lst.find(_ > 1).get)
  println(lst.find(_ > 6))

  println(map.get(1).get)
  println(map.get(5).getOrElse("No value Found"))

  println(opt.isEmpty)
  println(opt.get)
}