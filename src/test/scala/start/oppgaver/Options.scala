package start.oppgaver

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

class Options extends Spec with ShouldMatchers {
  describe("Options") {

    val team = List("Egon", "Benny", "Kjell")

    ignore("skal returnere at vi ikke har det elementet"){
      def teamMedlem(navn: String): Option[String] = null.asInstanceOf[Option[String]]
      val element = teamMedlem("Anders")

      element match {
        case None => "pass"
        case _ => fail()
      }
    }

    ignore("skal returnere (ingen) eller navnet på medlemmet"){
      val benny = Some("Benny")
      val valborg = None

      def navnPåMedlem(medlem : Option[String]) = {
        "test"
      }

      navnPåMedlem(benny) should be("Benny")
      navnPåMedlem(valborg) should be("(ingen)")
    }
  }
}