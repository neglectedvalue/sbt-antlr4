sbtPlugin := true

name := "sbt-antlr4"

organization := "com.github.neglectedvalue"

version := "0.7.1"

scalaVersion := "2.9.2"

publishTo <<= (version) { (version) =>
  val target = if (version contains "SNAPSHOT") "snapshots" else "releases"
  Some {
    Resolver.file("neglectedvalue.github.io", new File("/Users/negval/Code/me/neglectedvalue.github.io/mvn", target))
  }
}
