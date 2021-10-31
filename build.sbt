enablePlugins(JavaAppPackaging)

organization := "org.renci"

name := "relation-graph"

version := "1.2.1"

licenses := Seq("MIT license" -> url("https://opensource.org/licenses/MIT"))

scalaVersion := "2.13.6"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

javaOptions += "-Xmx8G"

testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")

val zioVersion = "1.0.12"

libraryDependencies ++= {
  Seq(
    "dev.zio"                    %% "zio"               % zioVersion,
    "dev.zio"                    %% "zio-streams"       % zioVersion,
    "org.geneontology"           %% "whelk-owlapi"      % "1.1",
    "com.outr"                   %% "scribe-slf4j"      % "3.5.5",
    "com.github.alexarchambault" %% "case-app"          % "2.0.6",
    "org.apache.jena"             % "apache-jena-libs"  % "3.17.0" exclude ("org.slf4j", "slf4j-log4j12"),
    "dev.zio"                    %% "zio-test"          % zioVersion % Test,
    "dev.zio"                    %% "zio-test-sbt"      % zioVersion % Test
  )
}
