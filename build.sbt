ThisBuild / organization := "fish.genius"
ThisBuild / organizationName := "Genius Fish"
ThisBuild / organizationHomepage := Some(url("https://genius.fish"))
ThisBuild / scalaVersion := "2.13.10"
ThisBuild / resolvers += Resolver.mavenLocal
ThisBuild / resolvers += "GitHub Genius Fish Apache Maven Packages" at "https://maven.pkg.github.com/genius-fish/packages"
ThisBuild / versionScheme := Some("early-semver")
ThisBuild / developers := List(
  Developer(
    id = "jlust",
    name = "Jurgen Lust",
    email = "jurgen@genius.fish",
    url = url("https://genius.fish")
  )
)
ThisBuild / publishTo := Some(
  "GitHub Genius Fish Apache Maven Packages" at "https://maven.pkg.github.com/genius-fish/packages"
)
ThisBuild / publishMavenStyle := true
ThisBuild / credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  sys.env.getOrElse("GITHUB_PACKAGES_OWNER", "none"),
  sys.env.getOrElse("GITHUB_PACKAGES_TOKEN", "none")
)

lazy val root = project
  .in(file("."))
  .settings(
    name := "config",
    libraryDependencies ++= Dependencies.Testing.*,
    libraryDependencies ++= Dependencies.Config.*
  )
