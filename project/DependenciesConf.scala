import sbt.Keys._
import sbt._


object DependenciesConf {

  lazy val scala: Seq[Setting[_]] = Seq(
    scalaVersion := "2.12.2",
    resolvers ++= Seq(
      Resolver.jcenterRepo,
      Resolver.sonatypeRepo("releases")
    )
  )

  lazy val common: Seq[Setting[_]] = scala ++ Seq(
    libraryDependencies ++= commonDeps
  )

  def commonDeps = Seq(
    // logging
    "ch.qos.logback" % "logback-classic" % "1.2.3",

    // scala
    "org.log4s" %% "log4s" % "1.4.0",
    "com.github.pathikrit" %% "better-files" % "3.2.0",
    "com.beachape" %% "enumeratum" % "1.5.12",
    "com.github.nscala-time" %% "nscala-time" % "2.16.0",

    // typelevel
    "com.chuusai" %% "shapeless" % "2.3.2",
    "com.github.pureconfig" %% "pureconfig" % "0.8.0",
    "com.github.pureconfig" %% "pureconfig-enumeratum" % "0.8.0",
    "eu.timepit" %% "refined" % "0.8.4",
    "eu.timepit" %% "refined-pureconfig" % "0.8.4",
    "org.typelevel" %% "cats" % "0.9.0",
    "org.typelevel" %% "cats-effect" % "0.4-09e64a7",

    // test
    "org.scalatest" %% "scalatest" % "3.2.0-SNAP9" % Test,
    "org.scalacheck" %% "scalacheck" % "1.13.5" % Test,
    "eu.timepit" %% "refined-scalacheck" % "0.8.4" % Test,
    "org.scalamock" %% "scalamock-scalatest-support" % "3.6.0" % Test,
    "com.waioeka.sbt" %% "cucumber-runner" % "0.1.5"
  )
}