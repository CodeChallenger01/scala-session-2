import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec

class AddFunctionTest extends AnyFlatSpec {

  val check = new FunctionWithExpand
  //1.1--> Expanded Function of adding two number give TRUE
  "it" should "match with value with Expanded function of add" in{
    val result = check.addExpandedFunction(2,3)
    assert(result==5)
  }

  //1.2--> Expanded Function of adding two number give FALSE
  "it" should "not match with value with Expanded function of add" in {
    val result = check.addExpandedFunction(10, 3)
    assert(result != 5)
  }

  //2.1--> Expanded Function of Adding list of element give TRUE
  "it" should "match with value with Expanded function of sum of list" in {
    val result = check.sumOfList1(List(1,2,3,4))
    assert(result == 10)
  }

  //2.2--> Expanded Function of Adding list of element give FALSE
  "it" should "not match with value with Expanded function of sum of list" in {
    val result = check.sumOfList1(List(1, 2, 3, 4))
    assert(result != 30)
  }

  // 3.1-->Expanded Function of Adding list of element give TRUE
  "it" should "match with value with Expanded function of higher order Function" in {
    val result = check.higherOrderFun((num:Int)=>num+1, 8)
    assert(result == 9)
  }

  // 3.1-->Expanded Function of Adding list of element give FALSE
  "it" should "not match with value with Expanded function of higher order Function" in {
    val result = check.higherOrderFun((num: Int) => num + 1, 8)
    assert(result != 19)
  }
}
