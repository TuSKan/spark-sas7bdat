addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

resolvers += "Spark Package Main Repo" at "https://dl.bintray.com/spark-packages/maven"
addSbtPlugin("org.spark-packages" % "sbt-spark-package" % "0.2.4")
