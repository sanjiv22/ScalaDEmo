package trial

object WhileLoop {
  def main(args: Array[String]) {

    var x = 0;
    while (x < 10) {
      println("x=" + x);
      x += 1;
    }

    var y = 10;
    do {
      println("y=" + y);
      y += 1;
    } while (y < 0);

  }
}