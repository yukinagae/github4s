package core

import core.GitHub._
import net.liftweb.json.DefaultFormats

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

  def issue_search(query: String): Option[IssueSummary] = base(repository_search_url(query)).map(_.extract[IssueSummary])
  def repository(owner: String, repo: String): Option[Repository] = base(repository_url(owner, repo)).map(_.extract[Repository])
  def repository_search(query: String): Option[RepositorySummary] = base(repository_search_url(query)).map(_.extract[RepositorySummary])
  def user(user: String): Option[User] = base(user_url(user)).map(_.extract[User])
  def user_repositories(user: String): List[Repository] = base(user_repositories_url(user)).map(_.extract[List[Repository]]).getOrElse(Nil)
  def user_search(query: String): Option[UserSummary] = base(user_search_url(query)).map(_.extract[UserSummary])

  def main(args: Array[String]) {

    try {
      val s = issue_search("hoge")
      println(s)
    } finally {
      Http.shutdown()
    }

  }

}
