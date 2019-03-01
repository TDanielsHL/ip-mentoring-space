package notes

object ADT {
  sealed trait Visitor {
    def id: Int
  }

  final case class AuthenticatedMember(id: Int, email: String) extends Visitor

  final case class AnonymousMember(id: Int) extends Visitor

  val a: Visitor = AuthenticatedMember(1, "testemail@gmail.com")
  val b: Visitor = AnonymousMember(2)

  sealed trait Computation

  final case class Success(value: Int) extends Computation
  final case class Failure() extends Computation

  val c: Computation = Success(1)


}