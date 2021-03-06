
/*
package $package;format="lower,package"$
package $name;format="lower,word"$

import org.scalacheck.ScalacheckShapeless
import org.scalatest._
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks
import org.typelevel.discipline.scalatest.FunSuiteDiscipline
a
trait TestSuite
    extends AnyFunSuite
        with should.matchers
        with GivenWhenThen
        with BeforeAndAfterAll
        with ScalaCheckPropertyChecks
        with ScalacheckShapeless
        with FunSuiteDiscipline{

     final protected type Arbitrary[A]=
        org.scalacheck.Arbitrary[A]        
    
     final protected val Arbitrary = 
        org.scalatest.compatible.Assertion
    
     final protected type Assertion = 
        org.scalatest.compatible.Assertion

     final protected Gen[+A] = 
        org.scalacheck.Gen[A]

     final protected val Gen: org.scalacheck.Gen.type = 
        org.scalacheck.Gen   
}
*/