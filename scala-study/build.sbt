
name := "scala-study"

// common Settings
lazy val commonSettings = Seq(
  organization := "com.bussorenre",
  version := "0.1",
  scalaVersion := "2.12.7",
  libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.0",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
)

// root
lazy val root = (project in file("."))
  .settings(commonSettings)
  .aggregate(s99)

// 99 scala problems - http://aperiodic.net/phil/scala/s-99/
lazy val s99 = (project in file("modules/99-scala-problems"))
  .settings(commonSettings)
