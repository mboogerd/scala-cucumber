lazy val root = project.in(file("."))
  .settings(
    inThisBuild(List(
      organization := "com.github.mboogerd",
      scalaVersion := "2.12.2",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "scala-cucumber")
  .settings(GenericConf.settings())
  .settings(DependenciesConf.common)
  .settings(LicenseConf.settings)
  .settings(CucumberConf.settings)
  .enablePlugins(AutomateHeaderPlugin)
  .settings(TutConf.settings)
  .enablePlugins(TutPlugin)