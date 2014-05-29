import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "tutorial unit 3"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "org.json" % "json" % "20080701",
      "com.restfb" % "restfb" % "1.6.9",
      "org.apache.cxf" % "cxf-bundle" % "2.6.0",
      "org.apache.cxf.xjc-utils" % "cxf-xjc-runtime" % "2.6.0" 
     )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}
