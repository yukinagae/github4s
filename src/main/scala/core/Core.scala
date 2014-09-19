package core

import core.GitHub._
import net.liftweb.json.DefaultFormats

object Core {

  import dispatch._
  import Defaults._
  import net.liftweb.json._

  implicit val formats = DefaultFormats

  /**
   * base access
   */
  def base(path: String): Option[JValue] = {
    val request = url(path)
    val json = Http(request OK as.lift.Json)
    json() // future.get
    json.completeOption
  }

  /**
   * auth
   */
  val token = "test" // FIXME get token
  def auth(url: String): String = s"${url}?access_token=${token}"

  /**
   * Require Auth APIs
   */
  def current_user(): Option[User] = base(auth(current_user_url())).map(_.extract[User])
  // TODO authorizations
  def emails(): List[Email] = base(auth(emails_url())).map(_.extract[List[Email]]).getOrElse(Nil)
  // TODO following
  // TODO keys
  // TODO notifications
  def current_user_repositories(): List[Repository] = base(auth(current_user_repositories_url())).map(_.extract[List[Repository]]).getOrElse(Nil)
  // TODO starred
  // TODO starred_gists
  def issues(): List[Issue] = base(auth(issues_url())).map(_.extract[List[Issue]]).getOrElse(Nil)
  def organization_repositories(org: String): List[Repository] = base(auth(organization_repositories_url(org))).map(_.extract[List[Repository]]).getOrElse(Nil)
  def organization(org: String): Option[Organization] = base(auth(organization_url(org))).map(_.extract[Organization])
  def team(): Option[Team] = base(auth(team_url())).map(_.extract[Team])
  def user_organizations(): List[Organization] = base(auth(user_organizations_url())).map(_.extract[List[Organization]]).getOrElse(Nil)

  /**
   * Not Require Auth APIs
   */
  // TODO emojis
  // TODO events
  // TODO gists
  def issue_search(query: String): Option[IssueSummary] = base(repository_search_url(query)).map(_.extract[IssueSummary])
  // TODO public_gists
  // TODO rate_limit
  def repository(owner: String, repo: String): Option[Repository] = base(repository_url(owner, repo)).map(_.extract[Repository])
  def repository_search(query: String): Option[RepositorySummary] = base(repository_search_url(query)).map(_.extract[RepositorySummary])
  def user(user: String): Option[User] = base(user_url(user)).map(_.extract[User])
  def user_repositories(user: String): List[Repository] = base(user_repositories_url(user)).map(_.extract[List[Repository]]).getOrElse(Nil)
  def user_search(query: String): Option[UserSummary] = base(user_search_url(query)).map(_.extract[UserSummary])

  /**
   * Validation Failed APIs
   */
  // TODO code_search

  /**
   * Not Understand APIs
   */
  // TODO feeds
  // TODO hub

  def main(args: Array[String]) {

    try {
      val s = user_organizations()
      println(s)
    } finally {
      Http.shutdown()
    }

  }

}
