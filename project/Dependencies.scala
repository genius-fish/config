import sbt._

object Dependencies {
  object Testing {
    private val _version = "3.2.14"
    final val * = Seq(
      "org.scalactic" %% "scalactic" % _version,
      "org.scalatest" %% "scalatest" % _version % Test
    )
  }
  object Lorem {
    private val _version = "2.1"
    final val * = Seq("com.thedeanda" % "lorem" % _version)
  }
  object Config {
    final val * = Seq("com.typesafe" % "config" % "1.4.2")
  }
}
