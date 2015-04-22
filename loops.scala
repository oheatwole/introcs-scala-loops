import scala.math.min

object loops {
  
  // Return a string containing n copies of s, end to end.
  // For example StringOfReps("Ok", 9) returns: "OkOkOkOkOkOkOkOkOk"
  def stringOfReps(s: String, n: Int): String = {
    s*n
  }

  // Return n! (n factorial: 1*2*3 *...* n if n >=1; 0! is 1.).  
  //For example Factorial(4) returns 1*2*3*4 = 24.
  def factorial(n: BigInt): BigInt = {
        if (n <= 1)
           1  
        else    
           n * factorial(n - 1)
  }


   // Return a string containing a filled rectange, where the filling is 
   // the specified number of columns and rows of the character inChar,
   // surrounded by a border made of the character edgeChar.
   // For example printRectangle(3, 2, 'i', 'e') prints
   //    eeeee
   //    eiiie
   //    eiiie
   //    eeeee
   def printRectangle(columns:Integer, rows:Integer, inChar:String, edgeChar:String): String = {
       {edgeChar*(columns+2)
        (edgeChar+(inChar*columns)+edgeChar)*rows
        (edgeChar+(inChar*columns)+edgeChar)*rows
        edgeChar*(columns+2)}
   }

}
