package JavaScalaInteroperability

/*
@author kmodelewski.com
*/
// https://docs.scala-lang.org/scala3/book/scala-for-java-devs.html

object ScalaJavaInteroperability extends App {

  /*
  Data type
   */
  //JAVA: LocalDate localDate = LocalDate.now();
  import java.time.LocalDate
   val localDate: LocalDate = LocalDate.now


}
