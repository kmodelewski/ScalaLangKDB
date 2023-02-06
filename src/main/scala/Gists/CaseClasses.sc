case class Person(name: String, age: Int)
  //1. class parameters are fields
  val jim = new Person("Jim",34)
  jim.name //działa, w zwykłej klasie musilibyśmy podać w nagłówku (val name: String.....
  //2. sensible toString for ease of debugging
 // println(instance) = println(instance.toString) - syntactic sugar
  jim.toString
//3. equals
val jim2 = new Person("Jim", 34)
jim == jim2


//4. Copy methods
val jim3 = jim.copy(age=35)

//Case classes have companion objects
val thePerson = Person
val mary = Person("Mary",33)

//Case classes are serilizable, useful with distributed system (between network and other jvms), Akka

//Case class have extractor pattern = can be used in PATTERN MATCHING

case Object UnitedKingdom{
  def name: STring = "The UK or GB"
}






