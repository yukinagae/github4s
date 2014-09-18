package core

import java.util.Date

case class Repository(id: Int, name: String, updated_at: Date, language: String, html_url: String, clone_url: String, description: String, open_issues: Int)
