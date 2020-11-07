package trial

// Scala Match Expression

object MatchExpression {
  def main(args: Array[String]) {

    val age = 20;

    age match {
      case 20 => println("age: " + age);
      case 18 => println("age: " + age);
      case 30 => println("age: " + age);
      case 25 => println("age: " + age);
      case _  => println("Default: variable value doesnot match");

    }

    val name = "harry";

    name match {
      case "harry"  => println("name: " + name);
      case "marry"  => println("name: " + name);
      case "carry"  => println("name: " + name);
      case "sherry" => println("name: " + name);
      case _        => println("Default: variable value doesnot match");

    }

    val result = age match {
      case 20 => age;
      case 18 => age;
      case 30 => age;
      case 25 => age;
      case _  => "default";
    }

    println(result);

    val i = 7;
    i match {
      case 1 | 3 | 5 | 7 | 9  => println("odd")
      case 2 | 4 | 6 | 8 | 10 => println("even")
    }
  }
}