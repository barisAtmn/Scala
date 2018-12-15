# Scala
Scala Training

 * Traits cannot have constructor parameters
 * When you have defined a class with implicit val member you also have defined a constructor with an implicit parameter
 * We can define one or more auxiliary constructors for a class to provide different ways to create objects.
 * Scala does not generate getter or setter when neither val nor var are specified on constructor parameters.
 * Should I use the final modifier when declaring case classes? 
  {
 It is not redundant in the sense that using it does change things. 
 As one would expect, you cannot extend a final case class, but you can extend a non-final one. 
 Why does wartremover suggest that case classes should be final? 
 Well, because extending them isn't really a very good idea. Consider this:
   
   scala> case class Foo(v:Int)
   defined class Foo
   
   scala> class Bar(v: Int, val x: Int) extends Foo(v)
   defined class Bar
   
   scala> new Bar(1, 1) == new Bar(1, 1)
   res25: Boolean = true
   
   scala> new Bar(1, 1) == new Bar(1, 2)
   res26: Boolean = true
   // ????
  }
  * What is type erasure?
  {
  Type erasure refers to the runtime encoding of parameterized classes in Scala. 
  It is simply performed by Scala compiler in which it removes all the generic type information after compilation.
  In Scala, generics are erased at runtime, 
  which means that the runtime type of List[Int] and List[Boolean] is actually the same. 
  }