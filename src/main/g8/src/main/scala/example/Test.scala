package example

import com.typesafe.scalalogging.StrictLogging

object Test extends App with StrictLogging {
  println("Test")

  def add(a: String, b: Sting): Int = {
    logger.info(s"add $a $b")
    s"$a$b"
  }
}
