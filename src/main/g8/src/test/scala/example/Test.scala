package example

import org.scalatest.FunSuite
import org.scalatest.Matchers._

class TestSuite extends FunSuite {

  test("a + b = ab") {
    Test.add("a","b") shouldBe "ab"
  }
}