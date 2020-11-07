package trial

//scala Lazy Evaluation

class Strict {
  var e = {
    println("Strict")
    9
  }
}

class LazyEval {
  lazy val l = {
    println("Lazy Eval")
    10
  }
}

object LazyEvaluation {

  def method1(n: Int) { //callbtname
    println("Method 1")
    println(n)
  }

  def method2(n: => Int) { //callbyvalue   // lazy eval 
    println("Method 2")
    println(n)
  }

  def main(args: Array[String]) {
    val x = new Strict;
    val y = new LazyEval

    println(x.e)
    println(y.l)

    val add = (a: Int, b: Int) => {
      println("add")
      a + b
    }

    method1(add(5, 6))
    method2(add(5, 6))

  }
}