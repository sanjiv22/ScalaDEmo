package trial

import java.util.Date

// Partially applied functions

object PartiallyAppliedFunctions {

  def log(date: Date, message: String) = {
    println(date + " " + message);
  }

  def history(date: Date, table: String) = {
    println(date + " INSERT  " + " on: " + table);
  }

  def main(args: Array[String]) {

    val sum = (a: Int, b: Int, c: Int) => a + b + c; // fully applied function

    val f = sum(10, _: Int, _: Int); // partially applied functions

    println(sum(10, 20, 30));

    println(f(200, 100));

    val date = new Date;
    val newLog = log(date: Date, _: String);
    newLog("error message");
    newLog("info message");
    newLog("warn message");

    var hist = history(_: Date, _: String);

    for (i <- 1 to 5) {
      var dateTime = new Date;
      hist(dateTime, "employee " + i);

    }

  }
}