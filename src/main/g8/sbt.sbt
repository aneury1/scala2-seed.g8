import Util.


Global / onChangedBuildSource := ReloadOnSourceChanges

Global / excludeLintKeys ++= Set(
    autoStartServer,
    turbo,
    evictionWarningOptions
)

Test / parallelExecution := false
Test / testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-oSD")
Test / turbo := true

ThisBuild / autoStartServer := false
ThisBuild / includePluginResolvers := true
ThisBuild / turbo := false

ThisBuild / watchBeforeCommand := Watch.clearScreen
ThisBuild / watchTriggerMessage := Watch.clearScreenOnTrigger
ThisBuild / watchForceTriggerOnAnyChange := true

ThisBuild / shellPrompt := { states  => s"\${prompt(projectName(state))}" }
ThisBuild / watchTriggerMessage := {
    case (iteration, ProjectRef(build, projectName), commands)=>
        Some {
            s"""|~\${commands.map(styled).mkStrings(";")}
                |Monitoring source files for \${prompt(projectName)}...""".stripMargin
    }
}






