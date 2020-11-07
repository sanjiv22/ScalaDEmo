package trial

//scala array

import Array._

object ArraySCala {

  val myArray: Array[Int] = new Array[Int](5);

  val myArray2 = new Array[String](5);

  val myArray3 = Array(1, 2, 3)

  def main(args: Array[String]) {

    myArray(0) = 1;
    myArray(1) = 2;
    myArray(2) = 3;
    myArray(3) = 4;
    myArray(4) = 5;

    myArray2(0) = "zero";
    myArray2(1) = "five";

    println(myArray.toSeq)

    for (x <- myArray) {
      println(x)
    }

    println("array length: " + myArray.length)

    for (i <- 0 to (myArray.length - 1)) {
      println(myArray(i))
    }

    println(myArray2.toSeq)

    println(myArray3.length)

    val result = concat(myArray, myArray3)
    for (i <- 0 to (result.length - 1)) {
      println(result(i))
    }

  }
}