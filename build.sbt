name := """github4s"""

version := "1.0"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "2.1.6" % "test",
	"net.databinder.dispatch" %% "dispatch-core" % "0.11.0",
	"net.databinder.dispatch" %% "dispatch-lift-json" % "0.11.0"
)
