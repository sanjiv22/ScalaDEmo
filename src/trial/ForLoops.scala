package trial

object ForLoops {
  def main(args: Array[String]) {

    for (i <- 1 to 5) {
      println("i using to: " + i)
    }

    for (i <- 1.to(5)) {
      println("i using to: " + i)
    }

    for (i <- 1.until(6)) {
      println("i using until: " + i)
    }

    for (i <- 1 until 6) {
      println("i using until: " + i)
    }

    for (i <- 1 to 5; j <- 1 to 3) {
      println("i using multiple ranges: " + i + " j = " + j)
    }

    val lst = List(1, 2, 3, 4, 5, 6);

    for (i <- lst) {
      println("using list " + i);
    }

    for (i <- lst; if i > 5) {
      println("using list with filter: " + i);
    }

    val result = for { i <- lst; if i < 5 } yield {
      i * i;
    }

    println("result: " + result);

    val result2 = for {
      i <- lst
      if i < 4
    } yield {
      i * i;
    }

    println("result2: " + result2);

  }
}