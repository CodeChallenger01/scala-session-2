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
