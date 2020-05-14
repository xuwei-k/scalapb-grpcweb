resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.0.1")

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.29")

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.17.0")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.0")

libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.10.3"

// publish locally and update the version for test
libraryDependencies += "com.thesamet.scalapb.grpcweb" %% "scalapb-grpcweb-code-gen" % "0.2.0+15-52f7fd47-SNAPSHOT"
