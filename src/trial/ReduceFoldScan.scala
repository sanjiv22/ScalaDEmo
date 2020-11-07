package trial

//scala - Reduce , Fold, or Scan (Left/Right)
object ReduceFoldScan extends App {

  val lst1 = List(1, 2, 3, 5, 7, 9, 10, 11)
  val lst2 = List("A", "B", "C")

  println(lst1.reduceLeft(_ + _))
  println(lst2.reduceLeft(_ + _))

  println(lst1.reduceLeft((x, y) => {
    println(x + "," + y); x + y;
  }))

  println(lst1.reduceRight(_ - _))

  println(lst1.reduceRight((x, y) => {
    println(x + "," + y); x - y;
  }))

  println(lst1.foldRight(100)(_ + _))
  println(lst1.foldLeft(100)(_ - _))

  println(lst1.foldRight(100)((x, y) => {
    println(x + "," + y); x + y;
  }))

  println(lst2.foldRight("Z")(_ + _))

  println(lst1.scanLeft(100)(_ + _))
  println(lst2.scanLeft("Z")(_ + _))

}