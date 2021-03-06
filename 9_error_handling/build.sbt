name := "9_error_handling"

scalaVersion := "2.12.6"

scalacOptions ++= Seq("-deprecation")

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "1.1.0",
  //"org.typelevel" %% "cats-free" % "1.1.0",
  //"org.typelevel" %% "cats-kernel" % "1.2.0",

//"org.typelevel" %% "cats-effect" % "0.10",
  "org.typelevel" %% "alleycats-core" % "1.1.0",
  "org.scalacheck" %% "scalacheck" % "1.13.5",
  "org.scalatest" %% "scalatest" % "3.0.4" % Test,
  "org.scalaz" %% "scalaz-core" % "7.2.23"
)
