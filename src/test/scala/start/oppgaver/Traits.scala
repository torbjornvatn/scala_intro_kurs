package start.oppgaver

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

class Traits extends Spec with ShouldMatchers {

  describe("Multipel arv -- traits"){

    abstract class Kjøretøy(val antallHjul: Int) {
      def motor = "Bensin"
    }

    ignore("Lag en bil, altså kjøretøy med 4 hjul -- arv"){
      val bil: Kjøretøy = null // -- fyll inn

      bil.antallHjul should be (4)
    }


    ignore("Lag en kranbil, en bil med en kran -- mixin med Trait"){
      val kranBil: Kjøretøy = null

      kranBil should be('harKran)
    }

    ignore("Lag en bil med dieselmotor -- overskrive egenskaper med Trait"){
      val bil: Kjøretøy = null

      // -- fyll inn  

      bil.motor should be("Diesel")
    }
  }
}