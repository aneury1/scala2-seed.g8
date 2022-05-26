
/* sbt.sbt
   definition of my project root fiel
*/

Global / onChangedBuildSource := ReloadOnSourceChange

Global / excludeLintKeys ++= Set(
    autoStartServer
)