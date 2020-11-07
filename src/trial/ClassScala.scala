package trial

//Scala Class

class User(var userName: String, val age: Int) {
  def printName {
    println(userName)
  }
};

object ClassScala extends App {
  var user = new User("sanjiv", 25);
  user.printName
  println(user.age)

  user.userName = "Hari"

  user.printName
  println(user.age)

}