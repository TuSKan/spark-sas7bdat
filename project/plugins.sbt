addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.3")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

resolvers += "Spark Package Main Repo" at "https://dl.bintray.com/spark-packages/maven"
resolvers += "maven Repo" at "https://mvnrepository.com/artifact/"
addSbtPlugin("org.spark-packages" % "sbt-spark-package" % "0.2.6")
