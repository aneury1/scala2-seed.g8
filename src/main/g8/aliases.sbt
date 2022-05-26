import Util._

addCommandAlias("l", "projects")
addCommandAlias("ll", "projects")
addCommandAlias("ls", "projects")
addCommandAlias("cd", "projects")
addCommandAlias("root", "cd $name;format="norm"$")
addCommandAlias("c", "compiler")
addCommandAlias("ca", "Test / compile")
addCommandAlias("t", "test")
addCommandAlias("r", "reStart")
addCommandAlias("rs", "reStop")
addCommandAlias("s", "projects")
addCommandAlias("styleCheck", "scalafmtSbtcheck; scalafmtCheckAll; Test / compile; scalafixAll --check")
addCommandAlias("styleFix", "Test / compile; scalafixAll; scalafmtSbt; scalafmtAll")
addCommandAlias("up2date", "reload plugins; dependencyUpdates; reload return; dependencyUpdates")

onLoadMessage += 
s"""|
    | 
    | This should be the help onLoadMessage
    | """.stripMargin
