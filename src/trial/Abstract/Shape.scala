package trial.Abstract

abstract class Shape {
  def area: Double;
}

object Shape {
  def main(args: Array[String]): Unit = {

    var cir = new Circle(4.5);
    printArea(cir)

    var squ = new Square(4.5, 5.0);
    printArea(squ)
  }

  def printArea(p: Shape) {
    println("Shape Area" + p.area)
  }
}