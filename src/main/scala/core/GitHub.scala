package core

/**
 * reference: https://developer.github.com/v3/
 *            https://api.github.com/
 *
 * <pre>
 * "current_user_url": "https://api.github.com/user",
 * "authorizations_url": "https://api.github.com/authorizations",
 * "code_search_url": "https://api.github.com/search/code?q={query}{&page,per_page,sort,order}",
 * "emails_url": "https://api.github.com/user/emails",
 * "emojis_url": "https://api.github.com/emojis",
 * "events_url": "https://api.github.com/events",
 * "feeds_url": "https://api.github.com/feeds",
 * "following_url": "https://api.github.com/user/following{/target}",
 * "gists_url": "https://api.github.com/gists{/gist_id}",
 * "hub_url": "https://api.github.com/hub",
 * "issue_search_url": "https://api.github.com/search/issues?q={query}{&page,per_page,sort,order}",
 * "issues_url": "https://api.github.com/issues",
 * "keys_url": "https://api.github.com/user/keys",
 * "notifications_url": "https://api.github.com/notifications",
 * "organization_repositories_url": "https://api.github.com/orgs/{org}/repos{?type,page,per_page,sort}",
 * "organization_url": "https://api.github.com/orgs/{org}",
 * "public_gists_url": "https://api.github.com/gists/public",
 * "rate_limit_url": "https://api.github.com/rate_limit",
 * "repository_url": "https://api.github.com/repos/{owner}/{repo}",
 * "repository_search_url": "https://api.github.com/search/repositories?q={query}{&page,per_page,sort,order}",
 * "current_user_repositories_url": "https://api.github.com/user/repos{?type,page,per_page,sort}",
 * "starred_url": "https://api.github.com/user/starred{/owner}{/repo}",
 * "starred_gists_url": "https://api.github.com/gists/starred",
 * "team_url": "https://api.github.com/teams",
 * "user_url": "https://api.github.com/users/{user}",
 * "user_organizations_url": "https://api.github.com/user/orgs",
 * "user_repositories_url": "https://api.github.com/users/{user}/repos{?type,page,per_page,sort}",
 * "user_search_url": "https://api.github.com/search/users?q={query}{&page,per_page,sort,order}"
 * </pre>
 */
object GitHub {

  val base_url = "https://api.github.com"

  def current_user_url(): String = {
    s"${base_url}/user"
  }

  def authorizations_url(): String = {
    s"${base_url}/authorizations"
  }
  // TODO code_search_url
  def emails_url(): String = {
    s"${base_url}/user/emails"
  }

  def emojis_url(): String = {
    s"${base_url}/emojis"
  }

  def events_url(): String = {
    s"${base_url}/events"
  }

  def feeds_url(): String = {
    s"${base_url}/feeds"
  }

  // TODO following_url
  // TODO gists_url

  def hub_url(): String = {
    s"${base_url}/hub"
  }

  // TODO issue_search_url

  def issues_url(): String = {
    s"${base_url}/issues"
  }

  def keys_url(): String = {
    s"${base_url}/user/keys"
  }

  def notifications_url(): String = {
    s"${base_url}/notifications"
  }

  // TODO organization_repositories_url
  // TODO organization_url

  def public_gists_url(): String = {
    s"${base_url}/gists/public"
  }

  def rate_limit_url(): String = {
    s"${base_url}/rate_limit"
  }
  // TODO repository_url
  // TODO repository_search_url
  // TODO current_user_repositories_url
  // TODO starred_url

  def starred_gists_url(): String = {
    s"${base_url}/gists/starred"
  }

  def team_url(): String = {
    s"${base_url}/teams"
  }

  // TODO user_url

  def user_organizations_url(): String = {
    s"${base_url}/user/orgs"
  }

  // TODO user_repositories_url
  // TODO user_search_url

}
