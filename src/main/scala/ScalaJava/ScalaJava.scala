package ScalaJava

import java.util.Optional

/**
  * Created by baris on 15.12.2018.
  */
object ScalaJava extends App{

  trait ConvertScala[T,K]{
    def convert(value:T): Option[K]
  }

  implicit object ScalaJavaOptinalStringConverter extends ConvertScala[Optional[String],String]{
    override def convert(value: Optional[String]): Option[String] = Some(value.get())
  }

  implicit class converter[T,K](value:T){
    def cov(implicit converter:ConvertScala[T,K]) = converter.convert(value)
  }

  val p = Optional.of("3")
  println(p.cov)
}
