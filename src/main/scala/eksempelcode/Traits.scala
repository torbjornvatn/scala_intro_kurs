package eksempelcode

trait HealthCheckable{
  def isOk: Boolean
}

trait Logger {
  def log(message: String){
   println(message)
  }
}

trait LoggProcessing extends FooService{
  override def process() {
    log("Starting processing")
    super.process()
    log("Stopped processing")
  }
}

class FooService extends HealthCheckable with Logger {
  def isOk: Boolean = true

  def process() {
    println("Processing!!")
  }
}

object TraitsApp extends App {
  val service = new FooService with LoggProcessing
  service.process()
}