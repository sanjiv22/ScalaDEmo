package trial
import scala.collection.immutable._

object ListScala {

  val myList = List(1, 3, 6, 8, 9)

  val myList2: List[Double] = List(3.4, 5.5, 6.6)

  val mylist1: List[String] = List("Geeks", "GFG",
    "GeeksforGeeks", "Geek123")

  val mylist2 = List("C", "C#", "Java", "Scala",
    "PHP", "Ruby")

  val whenn = "AM" :: "PM" :: List()
  def main(args: Array[String]) {

    println(whenn.size)

    println(myList)
    println(mylist1(1))

    println(0 :: myList) //cons
    println(myList)

    println(1 :: 3 :: 5 :: Nil) //nil

    println(mylist2.head)
    println(mylist2.tail)
    println(mylist2.isEmpty)
    println(mylist2.reverse)
    println(List.fill(2)("sanjiv"))

    println(mylist2.max)
    println(mylist2.min)

    for (str <- mylist2) {
      println(str)
    }
    
    mylist1.foreach(println)
    var sum: Double = 0
    myList2.foreach(sum += _)
    println(sum)

    println(myList(0))
  }
}