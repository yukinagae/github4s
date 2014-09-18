package core

import java.util.Date

case class Issue(number: Int, state: String, title: String, body: String, comments: Int, milestone: Option[Milestone], closed_at: Date, created_at: Date, updated_at: Date)
