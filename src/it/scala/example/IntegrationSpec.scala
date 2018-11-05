package example

import org.scalatest.{FlatSpec, Matchers}

class IntegrationSpec extends FlatSpec with Matchers {

  behavior of "Main"

  it should "run properly" in {
    Main.main(Array[String]()) shouldBe ()
  }
}
