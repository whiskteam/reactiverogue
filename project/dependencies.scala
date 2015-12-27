import sbt._

object dependencies {

  object V {
    val Reactivemongo = "0.11.9"
  }

  val playJson = "com.typesafe.play" %% "play-json" % "2.4.6"
  val reactivemongoBson = "org.reactivemongo" %% "reactivemongo-bson" % V.Reactivemongo
  val reactivemongoJson = "org.reactivemongo" %% "reactivemongo-play-json" % "0.11.9-1"
  val reactivemongo = "org.reactivemongo" %% "reactivemongo" % V.Reactivemongo

  val junit = "junit" % "junit" % "4.12"
  val scalatest = "org.scalatest" %% "scalatest" % "2.2.5"
  val dockerIt = "com.whisk" %% "docker-it-scala" % "0.2.0"

  val bsonDependencies =
    Seq(reactivemongoBson)

  val coreDependencies =
    Seq(reactivemongo, reactivemongoJson, playJson)

  val recordDslDependencies =
    Seq(junit % "test", scalatest % "test", dockerIt % "test")
}
