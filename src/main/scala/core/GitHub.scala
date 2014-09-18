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

  def current_user_url() = s"${base_url}/user"
  def authorizations_url() = s"${base_url}/authorizations"
  // TODO "code_search_url": "https://api.github.com/search/code?q={query}{&page,per_page,sort,order}"
  def code_search_url(query: String) = s"${base_url}/search/code?q=${query}"
  def emails_url() = s"${base_url}/user/emails"
  def emojis_url() = s"${base_url}/emojis"
  def events_url() = s"${base_url}/events"
  def feeds_url() = s"${base_url}/feeds"
  // TODO "following_url": "https://api.github.com/user/following{/target}"
  def following_url(target: String) = s"${base_url}/user/following/${target}"
  // TODO "gists_url": "https://api.github.com/gists{/gist_id}"
  def gists_url(gist_id: String) = s"${base_url}/gists/${gist_id}"
  def hub_url() = s"${base_url}/hub"
  // TODO "issue_search_url": "https://api.github.com/search/issues?q={query}{&page,per_page,sort,order}"
  def issue_search_url(query: String) = s"${base_url}/search/issues?q=${query}"
  def issues_url() = s"${base_url}/issues"
  def keys_url() = s"${base_url}/user/keys"
  def notifications_url() = s"${base_url}/notifications"
  // TODO "organization_repositories_url": "https://api.github.com/orgs/{org}/repos{?type,page,per_page,sort}"
  def organization_repositories_url(org: String) = s"${base_url}/orgs/${org}/repos"
  // TODO "organization_url": "https://api.github.com/orgs/{org}"
  def organization_url(org: String) = s"${base_url}/orgs/${org}"
  def public_gists_url() = s"${base_url}/gists/public"
  def rate_limit_url() = s"${base_url}/rate_limit"
  // TODO "repository_url": "https://api.github.com/repos/{owner}/{repo}"
  def repository_url(owner: String, repo: String) = s"${base_url}/repos/${owner}/${repo}"
  // TODO "repository_search_url": "https://api.github.com/search/repositories?q={query}{&page,per_page,sort,order}"
  def repository_search_url(query: String) = s"${base_url}/search/repositories?q=${query}"
  // TODO "current_user_repositories_url": "https://api.github.com/user/repos{?type,page,per_page,sort}"
  def current_user_repositories_url() = s"${base_url}/user/repos"
  // TODO "starred_url": "https://api.github.com/user/starred{/owner}{/repo}"
  def starred_url(owner: String, repo: String) = s"${base_url}/user/starred/${owner}/${repo}"
  def starred_gists_url() = s"${base_url}/gists/starred"
  def team_url() = s"${base_url}/teams"
  // TODO "user_url": "https://api.github.com/users/{user}"
  def user_url(user: String) = s"${base_url}/users/${user}"
  def user_organizations_url() = s"${base_url}/user/orgs"
  // TODO "user_repositories_url": "https://api.github.com/users/{user}/repos{?type,page,per_page,sort}"
  def user_repositories_url(user: String) = s"${base_url}/users/${user}/repos"
  // TODO "user_search_url": "https://api.github.com/search/users?q={query}{&page,per_page,sort,order}
  def user_search_url(query: String) = s"${base_url}/search/users?q=${query}"

}
