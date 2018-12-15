package Mixs
import scala.concurrent.{Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Try
/**
  * Created by baris on 03.12.2018.
  */
object FutureTest extends App{

  val test: Int = {
    println( "Hello")
    2
  }

  val threadFuture = Future {
     test
  }// (global) as implicit executor

  //println(threadFuture.value) // Option[Try[Int]] --> None

  val p:Promise[Int] = Promise[Int]
  println(p.completeWith(threadFuture).future.value.get match {case c: Try[Int] => c.get})

}
