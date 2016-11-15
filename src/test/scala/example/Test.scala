package example

import org.scalatest.FunSuite
import org.scalatest.Matchers._

class TestSuite extends FunSuite {

  test("1 + 1 = 2") {
    Test.add(1,1) shouldBe 2
  }
}