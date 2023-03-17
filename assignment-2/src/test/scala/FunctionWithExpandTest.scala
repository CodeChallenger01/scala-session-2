import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class AddFunctionTest extends AnyFlatSpec with Matchers {

  val addFunction: (Int, Int) => Int = (num1: Int, num2: Int) => num1 + num2
  val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum
  val higherOrderFunction: (Int => Int, Int) => Int = (fu: (Int => Int), num: Int) => fu(num)

  "addFunction" should "return correct sum when passed positive integers" in {
    val result = addFunction(2, 3)
    result shouldEqual 5
  }

  it should "return correct " in {
    val result = addFunction(-2, -3)
    result shouldEqual -5
  }

  it should "return correct sum when passed a list of number" in {
    val result = sumOfList(List(1,2,3,4))
    result shouldEqual 10
  }
  it should "return correct sum " in {
    val result = sumOfList(List(11, 20, 3, 4))
    result shouldEqual 38
  }

  it should "return true when passed parameter as a function and integer" in {
    val result = higherOrderFunction((x:Int)=>x+1,9)
    result shouldEqual 10
  }
  it should "return true" in {
    val result = higherOrderFunction((x: Int) => x + 10, 9)
    result shouldEqual 19
  }
}
