package Mixs

/**
  * Created by baris on 04.12.2018.
  */
object ImplicitTest extends App{

  implicit def orderPerson: Ordering[Person] = Ordering.fromLessThan(_.name < _.name)

  case class Person(name:String, age:Int)

  val person = List(
    Person("Ali",2),
    Person("Veli",4),
    Person("Baris",6)
  )

  println(person.sorted)



}
