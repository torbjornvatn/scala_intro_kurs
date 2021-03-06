package start.oppgaver

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

class Utvidbarhet extends Spec with ShouldMatchers {

  describe("Utvidbart"){

    ignore("Hent ut første elementet i listen"){
      val liste = List("første", "andre", "tredje")
      val første = "siste" // -- fyll inn

      første should be ("første")
    }

    ignore("Implementer en egen 1 indexert liste -- implementere apply"){
      val egenListe = List("en", "to", "tre") // -- fyll inn

      egenListe(2) should be ("to")
    }
  }
}
