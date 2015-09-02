import _root_.sbt.Keys._

name := "Magpie"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.5"

val akkaVersion           = "2.3.11"
val sprayVersion          = "1.3.3"

libraryDependencies ++=
  Seq(
    // Configuration
    "com.typesafe"                  % "config"                          % "1.2.1",
    // Logging
    // Spray
    "io.spray"                      %% "spray-client"                   % sprayVersion,
    "io.spray"                      %% "spray-routing"                  % sprayVersion,
    //    "io.spray"                      %% "spray-json"                     % sprayVersion,
    "io.spray"                      %% "spray-testkit"                  % sprayVersion    % "test",
    "io.spray"                      %% "spray-can"                      % sprayVersion,
    // Akka
    "com.typesafe.akka"             %% "akka-actor"                     % akkaVersion,
    "com.typesafe.akka"             %% "akka-slf4j"                     % akkaVersion,
    "com.typesafe.akka"             %% "akka-persistence-experimental"  % akkaVersion     % "compile",
    // Testing
    "org.scalatest"                 %% "scalatest"                      % "2.2.1"         % "test"
  )

