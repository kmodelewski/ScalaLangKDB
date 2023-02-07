val x: String = null
// 1.hrowing exceptions by using throw new ....np. NullPointerException
//val wierdValue = throw new NullPointerException
/*exceptions are instances of classes that's why we use keyword new
throwable classes extend Throwable class. Exceptions and Errors (caused by system, eg. memory) are the major Throwable subtypes
 */

// catch exceptions
def getInt(withExceptions: Boolean): Int =
  if (withExceptions) throw new RuntimeException("No int for you")
  else 42


val potentialFail = try{
  getInt(true)
} catch {
  case e: RuntimeException => println("caught a runtime exception") //musi być to samo co glownej metodzie
} finally {
  //code that will get executed no matter what, is optional, does not influence the return type of this expression - use for side effects, e.g. logging
  println("finally")
}


/*3. Definition of my own exceptions

class MyException extends Exception
val exception = new MyException
throw exception

 */

/* EXCERSISES

1. Crash your program with OutOfMemoryError
2. Crash with SOError
3. Pocket calculator
  -add(x,y)
  -subract(x,y)
  -multiply(x,y)
  -divide(x,y)

  Throw
    - OverlowExpetions if add(x,y) exceeds Int.MAX_VALUE
    - UnderflowException if subtract(x,y) exceeds Int. MIN_VALUE
    - MathCalculationException for division by 0
 */