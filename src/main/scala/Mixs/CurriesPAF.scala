package Mixs

/**
  * Created by baris on 02.12.2018.
  */
object CurriesPAF extends App{

  val superAdder : Int => Int => Int = x => y => x + y  // curried function

  def superAdderMethod(x:Int)(y:Int) : Int = x+y  // curried method

  println(superAdder(3)(5))

  val add2: Int => Int = superAdderMethod(3)
  // Lifting - ETA Expansion


  val simpleAddFunction = (x:Int, y: Int) => x + y
  def simpleAddMethod(x:Int, y: Int) = x + y
  def simpleCurriedMethod(x:Int)(y:Int) = x + y


  val add7 : Int => Int = y => simpleAddFunction(7,y)

  val add9 = simpleCurriedMethod(3)(_)

  println(add9(4))

}
