package Mixs

/**
  * Created by baris on 03.12.2018.
  */
object LazyEva extends App{

  // lazy DELAY the evaluation of values
  lazy val i = throw new RuntimeException


  val rs:List[Int] = for {
    a:Int <- List(1,2,3,4,5,6,7,8,9,10)
    if a % 2 == 0 // use withFilter
  } yield a + 1

  List(1,2,3,4,5,6,7,8,9,10).withFilter(_ % 2 == 0).map(_ + 1)

  println(rs)

}
