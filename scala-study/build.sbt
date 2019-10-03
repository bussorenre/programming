
name := "scala-study"

// common Settings
lazy val commonSettings = Seq(
  organization := "com.bussorenre",
  version := "0.1",
  scalaVersion := "2.12.7",
  libraryDependencies ++= Seq(
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.0",
    "org.scalatest" %% "scalatest" % "3.0.5",
    "com.google.inject" % "guice" % "4.2.2",

  ),
  scalafmtOnCompile := true
)

// root
lazy val root = (project in file("."))
  .settings(commonSettings)
  .aggregate(s99)
  .aggregate(guice)

// 99 scala problems - http://aperiodic.net/phil/scala/s-99/
lazy val s99 = (project in file("modules/99-scala-problems"))
  .settings(commonSettings)

lazy val guice = (project in file("modules/guice"))
  .settings(commonSettings)
