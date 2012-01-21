package eksempelcode

case class Sykkel(val farge:String, val hjul:Int)

object CaseClassApp extends App {
  assert(Sykkel("rød", 2).equals(new Sykkel("rød", 2)))
}