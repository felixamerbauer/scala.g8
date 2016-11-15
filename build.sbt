lazy val root = (project in file(".")).
  aggregate(app).
  settings(inThisBuild(List(
    organization := "$organization$",
    scalaVersion := "2.11.8"
  )),
    name := "$name$-root"
  )
lazy val app = (project in file("src")).
  settings(
    name := "$name$",
    organization := "$organization$",
    version := "0.1.0-SNAPHSHOT",
    scalaVersion := "2.11.8",

    scalacOptions ++= Seq(
      "-encoding", "UTF-8",
      "-deprecation",
      "-unchecked",
      "-feature",
      "-language:implicitConversions",
      "-language:postfixOps",
      "-language:existentials",
      "-language:experimental.macros",
      "-target:jvm-1.8"),

    javacOptions ++= Seq(
      "-source", "1.8",
      "-target", "1.8"),

    crossPaths := false,

    // avoids the java folders src/test
    unmanagedSourceDirectories in Compile := (scalaSource in Compile).value :: Nil,
    unmanagedSourceDirectories in Test := (scalaSource in Test).value :: Nil,

    libraryDependencies ++= Seq(
      // logging
      "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
      "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.7",
      "org.apache.logging.log4j" % "log4j" % "2.7",
      "org.apache.logging.log4j" % "log4j-api" % "2.7",
      "org.apache.logging.log4j" % "log4j-core" % "2.7",
      // config
      "com.typesafe" % "config" % "1.3.1",
      // tests
      "org.scalatest" %% "scalatest" % "3.0.0" % "test"
    )
  )