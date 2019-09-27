import org.scalatest._

class Example1ScalaTest extends FlatSpec with Matchers {
  "Example1" should "sum two numbers" in {
    Example1Scala.sum(1, 5) shouldBe 6
  }
}
