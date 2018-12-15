package Mixs

/**
  * Created by baris on 25.11.2018.
  */
object MySetExercise extends App{

  val mySetExample = new MySet[Int] {

    override def contains(elem: Int): Boolean = ???

    override def +(elem: Int): MySet[Int] = ???

    override def ++(anotherSet: MySet[Int]): MySet[Int] = ???

    override def map[B](f: (Int) => B): MySet[B] = ???

    override def flatMap[B](f: (Int) => MySet[B]): MySet[B] = ???

    override def filter(predicate: (Int) => Boolean): MySet[Int] = ???

    override def foreach(f: (Int) => Unit): Unit = ???

    override def apply(v1: Int): Boolean = ???

    override def -(elem: Int): MySet[Int] = ???

    override def --(anotherSet: MySet[Int]): MySet[Int] = ???

    override def &(anotherSet: MySet[Int]): MySet[Int] = ???

    override def unary_! : MySet[Int] = ???
  }
}
