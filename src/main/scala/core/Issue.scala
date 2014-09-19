package core

import java.util.Date

case class Issue( //
  number: Int, //
  state: String, //
  title: String, //
  body: String, //
  comments: Int, //
  milestone: Option[Milestone], //
  closed_at: Date, //
  created_at: Date, //
  updated_at: Date //
  )

case class IssueSummary(total_count: Int, incomplete_results: Boolean, items: List[Repository])
