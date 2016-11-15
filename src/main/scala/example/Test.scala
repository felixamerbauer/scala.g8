package example

import com.typesafe.scalalogging.StrictLogging

object Test extends App with StrictLogging {
  println("Test")

  def add(a: Int, b: Int): Int = {
    logger.info(s"add $a + $b")
    a + b
  }
}
