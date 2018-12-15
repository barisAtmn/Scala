package Mixs

/**
  * Created by baris on 04.12.2018.
  */
object TypeClassTest extends App{

  case class Person(name:String, age:Int)

  val person = List(
    Person("Ali",2),
    Person("Veli",4),
    Person("Baris",6)
  )


  trait myTypeClass[T]{
    def compare(value:T,value2:T): Boolean
  }

  object myTypeClass{
    def apply[T](implicit instance:myTypeClass[T]) = instance

    implicit object personAgeMyTypeClass extends myTypeClass[Person]{
      override def compare(value: Person,value2: Person): Boolean = value.age == value2.age
    }
  }

  implicit object personNameMyTypeClass extends myTypeClass[Person]{
    override def compare(value: Person,value2:Person): Boolean = value.name.equalsIgnoreCase(value2.name)
  }

  println(myTypeClass[Person].compare(Person("Ali", 2), Person("Ali", 21)))



}
