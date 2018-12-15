package Mixs

/**
  * Created by baris on 05.12.2018.
  */
object AuxiliaryConstructorTest extends App{

  val book1 = new Book
  val book2 = new Book("Clojure")
  val book3 = new Book("Scala", 3333)

  class Book (var title :String, var ISBN: Int) {
    def this(title: String) {
      this(title, 2222)
    }
    def this() {
      this("CSS")
      this.ISBN = 1111
    }
    override def toString = s"$title ISBN- $ISBN"
  }
}

