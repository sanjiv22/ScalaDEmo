package trial

class Users(var name: String, val age: Int) {
  //  def pintName { println(name) }
  //  def printAge { println(age) }

  def this() {
    this("Tom", 30)
  }

  def this(name: String) {
    this(name, 32);
  }

  def getName(): String = {
    this.name;
  }

  def getAge(): Int = {
    this.age;
  }

  override def toString(): String = {
    return "name: " + this.name + "age: " + this.age;
  }
};

object AuxilarryConstructor {
  def main(args: Array[String]) {

    var user1 = new Users("Max", 28)
    println(user1)
    var user2 = new Users()
    println(user2)
    var user3 = new Users("Jerry")
    println(user3)
  }
}

