package JavaScalaInteroperability

/*
@author kmodelewski.com
*/

object ScalaJavaInteroperability extends App {

  /*
  Data type
   */
  //JAVA: LocalDate localDate = LocalDate.now();
  import java.time.LocalDate
   val localDate: LocalDate = LocalDate.now


}
