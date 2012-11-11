import sbtappengine.Plugin.{AppengineKeys => gae}

name := "sbt-appengine-no-sdk-jar"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  // adding this makes the app work: "com.google.appengine" %  "appengine-api-1.0-sdk" % "1.7.3",
  "javax.servlet"        %  "servlet-api"           % "2.3"    % "provided",
  "org.mortbay.jetty"    %  "jetty"                 % "6.1.22" % "container"
)

seq(appengineSettings: _*)
