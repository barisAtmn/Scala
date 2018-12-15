package syntax.sugar

/**
  * Created by baris on 25.11.2018.
  */
object AdvancedPatternMatching extends App{

  val n: Int = 10

  object single {
    def unapply(arg: Int): Option[Boolean] = if (arg < 10) Some(true) else None
  }

  object even {
    def unapply(arg: Int): Option[Boolean] = if (arg % 2 == 0) Some(true) else None
  }

  val mathProperty = n match {

    case single(_) => "Single Digit"
    case even(_) => "Even"
    case _ => "no property"
  }

  println(mathProperty)

}
