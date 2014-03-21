name                := "scalamd"

description         := "ScalaMD: A Scala Markdown Processor"

organization        := "org.fusesource.scalamd"

licenses            := Seq("Apache 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage            := Some(url("http://website.fusesource.org/"))

version             := "1.6"

scalaVersion        := "2.11.0-RC3"

crossScalaVersions  := Seq("2.11.0-RC3", "2.10.4")

scalacOptions       := Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= {
  val sv = scalaVersion.value
  val specsVersion = if (sv startsWith "2.10") "1.13" else "2.3.10"
  Seq(
    "commons-io"   %  "commons-io"   % "1.4"        % "test",
    "commons-lang" %  "commons-lang" % "2.5"        % "test",
    "org.specs2"   %% "specs2"       % specsVersion % "test"
  )
}
