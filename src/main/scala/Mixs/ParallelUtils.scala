package Mixs
/**
  * Created by baris on 04.12.2018.
  */
object ParallelUtils extends App{

  val list = List(1,2,3).par

  println(list)


  val l:List[Int] = (1 to 100000).toList
}
