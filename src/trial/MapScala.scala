package trial

object MapScala {

  val myMap: Map[Int, String] = Map(1 -> "sanjiv", 2 -> "Ram",
    3 -> "Shyam");

  val myMap2: scala.collection.mutable.Map[Int, String] = scala.collection.mutable.Map(
    1 -> "sanjiv", 2 -> "Ram", 3 -> "Shyam", 4 -> "Hari");

  def main(args: Array[String]) {

    println(myMap)

    println(myMap.get(1))

    println(myMap.get(3))

    println(myMap.keys)

    println(myMap.values)

    println(myMap.isEmpty)

    myMap.foreach {
      key =>
        println("key :" + key._1 + " value: " + key._2);
    }

    myMap.foreach {
      case (key, value) =>
        println("key :" + key + " value: " + value);
    }

    println(myMap ++ myMap2) //concat of 2 maps

    val result = if (myMap.contains(4))
      myMap(1) else "Not Found"

    println(result)

    myMap2(1) = "Zander"
    myMap2 += (5 -> "Jun", 7 -> "sita")
    myMap2 -= 2
    println(myMap2)

    for ((k, v) <- myMap2) {
      println("key: " + k + " Value: " + v)
    }

  }
}