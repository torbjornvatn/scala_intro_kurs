package start.oppgaver

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

class Klasser extends Spec with ShouldMatchers {
  describe("Klasser") {

    ignore("definer en person klasse med navn og alder") {
      type NavnOgAlder = {val fornavn: String; val alder: Int}

      val person: NavnOgAlder = null.asInstanceOf[NavnOgAlder] // -- fyll inn

      person.fornavn should be("aslak")
      person.alder should be(27)
    }

  }

  describe("Metoder") {

    ignore("Legg til etternavn og sett sammen for og etter-navn") {
      val person = null // -- fyll inn

      //person.fulltNavn should be ("ole aleksander filibombombom")
    }

  }
}