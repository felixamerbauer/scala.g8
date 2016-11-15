package example

import org.scalatest.FunSuite
import org.scalatest.Matchers._

class ConfigSuite extends FunSuite {

  test("read config") {
    Config.foo shouldEqual "bar"
  }
}