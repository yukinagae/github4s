package core

import core.GitHub._

object Core {

  import dispatch._
  import Defaults._
  import net.liftweb.json._

  implicit val formats = DefaultFormats

  def base(path: String): Option[JValue] = {
    import scala.util.{ Try, Success, Failure }
    val u = url(path)
    val json = Http(u OK as.lift.Json)
    json() // future.get
    json.completeOption
  }

  def user(user: String): Option[User] = base(user_url(user)).map(_.extract[User])

  def main(args: Array[String]) {

    val s = user("test")
    println(s)

    Http.shutdown()
  }

}
