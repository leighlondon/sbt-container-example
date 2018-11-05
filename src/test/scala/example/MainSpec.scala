package example

import org.scalatest.{FlatSpec, Matchers}

class MainSpec extends FlatSpec with Matchers {

  behavior of "add"

  it should "add some numbers" in {
    Main.add(1, 2) shouldBe 3
  }
}
