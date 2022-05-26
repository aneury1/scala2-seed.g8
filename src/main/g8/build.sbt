import Dependencies.

ThisBuild / organization := "$organization;format="lower,package"$"
ThisBuild / scalaVersion := "2.12.15"

lazy val `$name;format="norm"$`= 
project
    .in(file("."))
    .settings(name := "$name")
    .settings(commonSettings)
    .settings(dependencies)

lazy val commonSettings =
    compilerPlugins ++ commonScalacOptions ++ Seq(
        update / evictionWarningOptions := EvictionWarningOptions.empty
    )

lazy val commonScalacOptions = Seq(
   Compile / console / scalaOptions := {
       (Compile / compile / scalacOptions )
            .value
            .filterNot(_.contains("wartremover"))
            .filterNot(Scalac.Lint.toSet)
            .filterNot(Scalac.FatalWarning.toSet) :+ "-Wconf:any:silent"
   },
   Test / console / scalacOptions := 
     (Compile / console / scalacOptions).value
)


lazy val compilerPlugins = Seq(
    addCompilerPlugin(com.olegpy.`better-monadic-for`)
    addCompilerPlugin(com.augustjune.`context-applied`)
    addCompilerPlugin(com.typelevel.`kind-projector`)
)

lazy val dependencies = Seq(
    libratyDependencies ++= Seq(

    ),
    libratyDependencies ++= Seq(
        com.github.alexanderchambault.`scalacheck-shapeless_1.15`,
        org.scalacheck.scalacheck,
        org.scalatest.scalatest,
        org.scalatestplus.`scalacheck-1-16`,
        org.typelevel.`discipline-scalatest`,
    ).map(_ % Test),
)


