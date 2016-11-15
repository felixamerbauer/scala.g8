package example

import com.typesafe.config.ConfigFactory

object Config {
  private val conf = ConfigFactory.load
  val foo = conf.getString("foo")
}
