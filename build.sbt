ThisBuild / scalaVersion     := "2.13.16"

name := "Scala School JSON workshop"

libraryDependencies ++= Seq(
  "org.playframework" %% "play-json" % "3.0.6",
  "org.scalatest" %% "scalatest" % "3.2.20" % Test
)