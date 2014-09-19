package core

/**
 * reference: https://developer.github.com/v3/
 *            https://api.github.com/
 */
object GitHub {

  val base_url = "https://api.github.com"

  /**
   * Requires authentication
   */
  def current_user_url() = s"${base_url}/user" // https://api.github.com/user
  def authorizations_url() = s"${base_url}/authorizations" // https://api.github.com/authorizations
  def emails_url() = s"${base_url}/user/emails" // https://api.github.com/user/emails
  def following_url(target: String) = s"${base_url}/user/following/${target}" // https://api.github.com/user/following{/target}
  def keys_url() = s"${base_url}/user/keys" // https://api.github.com/user/keys
  def notifications_url() = s"${base_url}/notifications" // https://api.github.com/notifications
  def current_user_repositories_url() = s"${base_url}/user/repos" // TODO https://api.github.com/user/repos{?type,page,per_page,sort}
  def starred_url(owner: String, repo: String) = s"${base_url}/user/starred/${owner}/${repo}" // https://api.github.com/user/starred{/owner}{/repo}
  def starred_gists_url() = s"${base_url}/gists/starred" // https://api.github.com/gists/starred
  def issues_url() = s"${base_url}/issues" // https://api.github.com/issues
  def organization_repositories_url(org: String) = s"${base_url}/orgs/${org}/repos" // TODO https://api.github.com/orgs/{org}/repos{?type,page,per_page,sort}
  def organization_url(org: String) = s"${base_url}/orgs/${org}" // https://api.github.com/orgs/{org}
  def team_url() = s"${base_url}/teams" // https://api.github.com/teams
  def user_organizations_url() = s"${base_url}/user/orgs" // https://api.github.com/user/orgs

  /**
   * Not Requires authentication
   */
  def emojis_url() = s"${base_url}/emojis" // https://api.github.com/emojis
  def events_url() = s"${base_url}/events" // https://api.github.com/events
  def gists_url(gist_id: String) = s"${base_url}/gists/${gist_id}" // https://api.github.com/gists{/gist_id}
  def issue_search_url(query: String) = s"${base_url}/search/issues?q=${query}" // TODO https://api.github.com/search/issues?q={query}{&page,per_page,sort,order}
  def public_gists_url() = s"${base_url}/gists/public" // https://api.github.com/gists/public
  def rate_limit_url() = s"${base_url}/rate_limit" // https://api.github.com/rate_limit
  def repository_url(owner: String, repo: String) = s"${base_url}/repos/${owner}/${repo}" // https://api.github.com/repos/{owner}/{repo}
  def repository_search_url(query: String) = s"${base_url}/search/repositories?q=${query}" // TODO https://api.github.com/search/repositories?q={query}{&page,per_page,sort,order}
  def user_url(user: String) = s"${base_url}/users/${user}" // https://api.github.com/users/{user}
  def user_repositories_url(user: String) = s"${base_url}/users/${user}/repos" // TODO https://api.github.com/users/{user}/repos{?type,page,per_page,sort}
  def user_search_url(query: String) = s"${base_url}/search/users?q=${query}" // TODO https://api.github.com/search/users?q={query}{&page,per_page,sort,order}

  /**
   * Validation Failed
   */
  def code_search_url(query: String) = s"${base_url}/search/code?q=${query}" // TODO https://api.github.com/search/code?q={query}{&page,per_page,sort,order}

  /**
   * Not Understand
   */
  def feeds_url() = s"${base_url}/feeds" // https://api.github.com/feeds
  def hub_url() = s"${base_url}/hub" // https://api.github.com/hub

}
