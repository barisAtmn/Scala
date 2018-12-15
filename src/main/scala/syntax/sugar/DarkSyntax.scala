package syntax.sugar

/**
  * Created by baris on 25.11.2018.
  */
object DarkSyntax extends App{

  class MyStream[T]{
    def -->:(value:T): MyStream[T]= this
  }
  val myStream = 1 -->: 2 -->: new MyStream[Int]



}
