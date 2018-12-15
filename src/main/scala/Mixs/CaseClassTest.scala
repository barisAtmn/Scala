package Mixs

/**
  * No need to use new keyword in case class
  */
object CaseClassTest extends App{

  case class Person (var name: String)

  val p = Person("Fred Flinstone")

  println(p.name)
}
