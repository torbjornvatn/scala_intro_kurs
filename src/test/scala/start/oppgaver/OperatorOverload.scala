package start.oppgaver

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

class OperatorOverload extends Spec with ShouldMatchers {
  describe("Operator overload -- +") {

    class Henger(val vekt: Int)
    class Lastebil(val vekt: Int)

    ignore("regn total vekt på bil pluss henger") {
      val bil = new Lastebil(4000)
      val henger = new Henger(3000)

      val totalvekt: Int = 0 //henger + bil  -- fyll inn

      totalvekt should be(7000)
    }

  }
}
