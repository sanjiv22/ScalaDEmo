package trial.inheriatnce

object PolygonExample {
  def main(args: Array[String]): Unit = {
    var poly = new Polygon;

    var rect = new Rectange(4.5, 5.0);
    printArea(rect)

    var tri = new Triangle(4.5, 5.0);
    printArea(tri)
  }

  def printArea(p: Polygon) {
    println("poly" + p.area)
  }
}