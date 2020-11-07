package trial

//Scala Sets
object SetsScala {
  //immutable Set
  val mySet: Set[Int] = Set(1, 2, 3, 4, 4)
  val mySet3: Set[Int] = Set(11, 2, 33, 4, 64)
  val names: Set[String] = Set("sanjiv", "ram", "ram")

  //mutable Set
  var mySet2 = scala.collection.mutable.Set(1, 2, 3, 4, 5)

  def main(args: Array[String]) {

    println(mySet)
    println(names)
    println(mySet + 10 + 20)
    println(mySet(4)) // to check if set contains 4

    println(mySet.head)
    println(mySet.tail)
    println(mySet.isEmpty)

    println(mySet ++ mySet3) // concat two sets
    println(mySet.++(mySet3))

    println(mySet.&(mySet3)) // intersect
    println(mySet.intersect(mySet3))

    println(mySet.max)
    println(mySet.min)

    mySet.foreach(println)

    for (name <- (names)) {
      println(name)
    }
    
    
    println(mySet2)

  }
}