package Mixs

import scala.concurrent.duration._

/**
  * Created by baris on 05.12.2018.
  */
object PimpTest extends App {

  // AnyVal is the common super type of all primitives in scala
  implicit class RichInt(val value: Int) extends AnyVal {
    def sqrt: Double = math.sqrt(value)

    def rocks: Unit = {
      def multi(v: Int): Unit = {
        if (v == 0) ()
        else {
          println("UUU")
          multi(v - 1)
        }
      }

      multi(3)
    }
  }

  3.seconds
  println(3.sqrt)

  trait Serializer[T]{
    def serialize(value:T):String
  }

  implicit object IntSerializer extends Serializer[Int] {
    override def serialize(value: Int): String = value.toString + "aq"
  }

  implicit class s[T](value: T) {
    def uuu(implicit serializer:Serializer[T]) = serializer.serialize(value)
  }

  println(3.uuu)

  3.rocks

}
