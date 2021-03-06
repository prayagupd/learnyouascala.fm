name := "algebric-data-types"

scalaVersion := "2.12.7"

scalacOptions ++= Seq("-deprecation", "-Ypartial-unification")

libraryDependencies += "org.typelevel" %% "cats-core" % "1.4.0"
libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.26"
libraryDependencies += "org.scalaz" %% "scalaz-effect" % "7.2.26"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"

libraryDependencies += "junit" % "junit" % "4.10" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4"
libraryDependencies += "org.scalamock" %% "scalamock" % "4.1.0" % Test
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.0" % "test"

resolvers += "Local Maven Repository" at "file://" + Path.userHome.absolutePath + "/.m2/repository"
