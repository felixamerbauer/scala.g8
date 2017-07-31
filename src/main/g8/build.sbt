name := "$name$"
organization := "$organization$"
version := "$version$"
scalaVersion := "$scalaVersion$"

scalacOptions ++= Seq(
  "-encoding", "UTF-8",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:existentials",
  "-language:experimental.macros",
  "-target:jvm-1.8")

javacOptions ++= Seq(
  "-source", "1.8",
  "-target", "1.8")

crossPaths := false

// avoids the java folders src/test
unmanagedSourceDirectories in Compile := (scalaSource in Compile).value :: Nil
unmanagedSourceDirectories in Test := (scalaSource in Test).value :: Nil

libraryDependencies ++= Seq(
  // logging
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
  "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.8.2",
  "org.apache.logging.log4j" % "log4j" % "2.8.2",
  "org.apache.logging.log4j" % "log4j-api" % "2.8.2",
  "org.apache.logging.log4j" % "log4j-core" % "2.8.2",
  // config
  "com.typesafe" % "config" % "1.3.1",
  // tests
  "org.scalatest" %% "scalatest" % "3.0.3" % "test"
)
