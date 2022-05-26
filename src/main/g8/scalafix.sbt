import Dependencies._

ThisBuild / scalafixScalaBinaryVersion := scalafixScalaBinaryVersion.value
ThisBuild / scalafixDependencies ++= Seq(
    com.github.liancheng.`organize-imports`
)

ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision