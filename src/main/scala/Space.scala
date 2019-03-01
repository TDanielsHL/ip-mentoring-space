package notes

object Space extends App {
  println("Hello World")

  // OR - Cat OR Dog OR Pig (no additional parameters) - Sum Type
  // AND - Cat Permutations * Dog Permutations * Pig Permutations - Product Type
  sealed trait Animal

  final case class Cat(friendly: Boolean) extends Animal
  final case class Dog(friendly: Boolean) extends Animal
  final case class Pig(friendly: Boolean = false) extends Animal

  val a: Animal = Cat(true)
  val b: Animal = Dog(true)
  val c: Animal = Pig()
  val d: Int = 1
}
