package core

import java.util.Date

case class Milestone(number: Int, state: String, title: String, description: String, open_issues: Int, closed_issues: Int, created_at: Date, due_on: Option[Date])
