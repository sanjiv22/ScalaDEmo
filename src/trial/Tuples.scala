package trial

//scala -Tupes
object TuplesScala extends App {

  val myTuple = (1, 2.33, "address", true);

  val myTuple1 = new Tuple4(11, 4.32, "name", false); // 4 means 4 element in tuple
  //max 22 value in Tuple

  val myTuple3 = new Tuple3(1, "hello", (2, 3))
  println(myTuple);
  println(myTuple1);

  println(myTuple._2) // to access 2nd element of myTuple
  println(myTuple1._4);

  myTuple.productIterator.foreach(println)
  myTuple.productIterator.foreach {
    i => println(i)
  }
  println(1 -> "Top" -> true) // only valid for 2 elements

  println(myTuple3._2)
  println(myTuple3._3._2)
}