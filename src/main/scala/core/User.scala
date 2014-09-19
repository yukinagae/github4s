package core

case class User(
  login: String, //
  id: Int, //
  avatar_url: String, //
  gravatar_id: String, //
  url: String, //
  html_url: String, //
  `type`: String, //
  site_admin: Boolean, //
  score: Option[String] //
  )

case class UserSummary(total_count: Int, incomplete_results: Boolean, items: List[User])

case class Email(email: String, primary: Boolean, verified: Boolean)
