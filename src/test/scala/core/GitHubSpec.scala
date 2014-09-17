package core

import org.scalatest._
import org.scalatest.matchers.ShouldMatchers
import core.GitHub._

class GitHubSpec extends FlatSpec with ShouldMatchers {

  "GitHub" should "base" in {
    base_url should be === "https://api.github.com"
  }
}
