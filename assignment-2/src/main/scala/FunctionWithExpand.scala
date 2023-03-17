class FunctionWithExpand {

  //Implemeted the Function with it's Expanded form
  // 1--> Function for adding two number which takes two parameter of integer type and return output of integer type(SIMPLE FUNCTION)
  val addFunction: (Int, Int) => Int = (num1: Int, num2: Int) => num1 + num2

  //Expanded function of adding two number
  val addExpandedFunction: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    def apply(num1: Int, num2: Int): Int = num2 + num1
  }

  // 2--> Function for adding list of element of type list and  return output of integer type(SIMPLE FUNCTION)
  val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum

  // EXPANDED FORM of above function
  val sumOfList1: Function1[List[Int], Int] = new Function1[List[Int], Int] {
    def apply(list: List[Int]): Int = list.sum
  }

  // 3-->Higher order Function for adding  which takes function and integerb as a type and  return output of integer type(SIMPLE FUNCTION)
  val higherOrderFunction: (Int => Int, Int) => Int = (fu: (Int => Int), num: Int) => parameterFunction(num)
  val parameterFunction: Int => Int = _ + 10

  //EXPANDED FORM
  val higherOrderFun: Function2[Int => Int, Int, Int] = new Function2[Int => Int, Int, Int] {
    def apply(f: Int => Int, num: Int): Int = f(num)
  }
  val parameterFunction1: Function1[Int, Int] = new Function1[Int, Int] {
    def apply(num: Int): Int = num + 1
  }

}
object Main extends App{

}
