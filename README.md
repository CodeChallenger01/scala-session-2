# scala-session-2
## Assignment-1
### Steps 

**Step 1:** In Intellij move to **assignment-1/src/main/scala** and create a **ElementsSquare.scala**.       
**Step 2:** Create object and extend the App and inside it create a method that calculate the squareListByPattern.    
**Step 3:** In this method call the try catch method and after that use pattern matching. If list is Nil than pass Nil else head*head and call the method by passing tail means rest of the left element of list.   
**Step 4:** Create another method that calculate the squareListByMap and in this method call the try catch method and after that use map to traverse element with squaring.  
**Step 5:** Create method of checkException and take list as parameter and check list is empty if yes then throw error and handle error in catch.   
**Step 6:** After that add the **scalatest dependencies** in build.sbt file.       
**Step 7:** Create a **Test Class in src/test/scala.** Inside the test class extend the **AnyFlatSpec** Class and import the scalatest package in that test class.     
**Step 8:** Inside the test class create instance of object and declare and initialize list.        
**Step 9:** After that call the **checkSquareByPattern method and in assert compare the actual value with output** return by checkSquareByPattern method with both == or != and perform same for checkSquareListByMap.     
**Step 10:** In terminal run the command **sbt test it show the result that test case** is passed or fail.      
**OUTPUT**
![Screenshot from 2023-03-17 10-39-19](https://user-images.githubusercontent.com/124979629/225817894-83997bad-0e43-49dc-988a-abe3bc0f17f4.png)

## Assignment-2
### Steps 
**Step 1:** In Intellij move to **assignment-2/src/main/scala** and create a **FunctionWithExpand.scala**.       
**Step 2:** Create object and extend the App and create a class and inside it create method addFunction with Expanded Form, sumOfList with Expanded form, higherOrderFunction with Expanded Form. 
EXAMPLE:
1. val addFunction: (Int, Int) => Int = (num1: Int, num2: Int) => num1 + num2
  //Expanded function of adding two number
2. val addExpandedFunction: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    def apply(num1: Int, num2: Int): Int = num2 + num1
  } 
Step 3: Similarly perform for all the methods.
**Step 6:** After that add the **scalatest dependencies** in build.sbt file.       
**Step 7:** Create a **Test Class in src/test/scala.** Inside the test class extend the **AnyFlatSpec** Class and import the scalatest package in that test class.     
**Step 8:** Inside the test class create instance of object and declare and initialize list.        
**Step 9:** After that call the **all method and in assert compare the actual value with output**  with both == or != and perform same. 
**Step 10:** In terminal run the command **sbt test it show the result that test case** is passed or fail.      
**OUTPUT**

![Screenshot from 2023-03-17 11-34-01](https://user-images.githubusercontent.com/124979629/225825451-eaf7929e-5b24-4b04-a640-0be84cb3edb7.png)
