enablePlugins(ScriptedPlugin)

ThisBuild / scalaVersion := "2.12.15"
ThisBuild / useSuperShell := false
ThisBuild / autoStartServer := false

/*
    TODO: Verified 
*/
name := "scala-seed"

addCommnadAlias("test", "g8Test")

scriptedLaunchOpts ++= Seq(
    "-Xms1g",
    "-Xmx1g",
    "-XX:ReservedCodeCacheSize=128m",
    "-Xss2m",
    "-Dfile.enconding=UTF-8",
)