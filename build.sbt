name := "Scala introkurs"

version := "1.0"

organization := "no.bekk"

scalaVersion := "2.9.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1" % "test"

resolvers += "less is" at "http://repo.lessis.me"

addSbtPlugin("me.lessis" % "sbt-growl-plugin" % "0.1.3")