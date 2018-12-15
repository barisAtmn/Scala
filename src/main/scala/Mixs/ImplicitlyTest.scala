package Mixs

/**
  * Created by baris on 15.12.2018.
  */
object ImplicitlyTest extends App{

  case class Permission(mask: String)
  implicit val defaultPermission = Permission("744")

  val standartPer = implicitly[Permission]


}
