import Scalac.Keys._

ThisBuild / scalacOptions ++= Seq(
    "-languages:_"
    "-Ymacro-annotations"
    "-Wunused:imports"
) ++ Seq("-enconding", "UTF-8") ++ warnings.value ++ lint.value

ThisBuild / warnings := {
  
   if (insideCI.value)
      Seq(
          "-Wconf:any:error"
          "-Xfatal-warnings"
      )
   else if (lintOn.value)
       Seq("-Wconf:any:warning")
   else
       Seq("-Wconf:any:silent")
    
}

ThisBuild / lintOn := 
   !sys.env.contains("LINT_OFF")

ThisBuild / lint := {
    if (shouldLint.value) 
        Scalac.Lint
    else
        Seq.empty
}

ThisBuild / wartermoveWarnings := {
    if (shouldLint.value)
        Warts.allBut(
            Wart.ImplicitConversion,
            Wart.ImplicitParameter
        )        
    else
       (ThisBuild / wartermoveWarnings).value
}
