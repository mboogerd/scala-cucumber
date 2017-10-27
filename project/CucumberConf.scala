import sbt.{Def, _}
import Keys._

/**
  *
  */
object CucumberConf {

  val framework = new TestFramework("com.waioeka.sbt.runner.CucumberFramework")

  val settings: Seq[Def.Setting[_ >: Seq[TestFramework] with Task[Seq[TestOption]] with Boolean]] = Seq(
    testFrameworks += framework,

    // Configure the arguments.
    testOptions in Test += Tests.Argument(framework,"--glue",""),
    testOptions in Test += Tests.Argument(framework,"--plugin","html:/tmp/html"),
    testOptions in Test += Tests.Argument(framework,"--plugin","json:/tmp/json"),

    /** can remove pretty printing if running in parallel. */
    parallelExecution in Test := true
  )

}
