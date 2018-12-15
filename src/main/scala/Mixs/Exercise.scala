package Mixs

/**
  * Created by baris on 25.11.2018.
  */
object Exercise extends App{

  val anonymousFunction:PartialFunction[String,Unit] = {
    case "Hello" => println("You said : Hello")
    case "World" => println("You said : World")
  }

   scala.io.Source.stdin.getLines().foreach(anonymousFunction.lift)

  val anonymousFunction2 = new PartialFunction[Int,Int] {
    override def isDefinedAt(x: Int): Boolean = ???

    override def apply(v1: Int): Int = ???
  }

}
