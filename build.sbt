ThisBuild / organization := "fish.genius"
ThisBuild / organizationName := "Genius Fish"
ThisBuild / organizationHomepage := Some(url("https://genius.fish"))
ThisBuild / scalaVersion := "2.13.10"
ThisBuild / resolvers += Resolver.mavenLocal
ThisBuild / versionScheme := Some("early-semver")
ThisBuild / developers := List(
  Developer(
    id = "jlust",
    name = "Jurgen Lust",
    email = "jurgen@genius.fish",
    url = url("https://genius.fish")
  )
)

lazy val root = project
  .in(file("."))
  .settings(
    name := "config",
    libraryDependencies ++= Dependencies.Testing.*,
    libraryDependencies ++= Dependencies.Config.*
  )
