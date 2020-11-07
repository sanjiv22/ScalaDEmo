package trial.traits

class Vehicle extends Color with Car with Bus {

  override def colorName: String = "red";

  def distanceTravelled: Double = 100;

  def speed: Double = 60;
}

object Vehicle {
  def main(args: Array[String]) {
    var vehicle = new Vehicle;
    println(vehicle.colorName)
    println(vehicle.distanceTravelled)
    println(vehicle.speed)
  }
}