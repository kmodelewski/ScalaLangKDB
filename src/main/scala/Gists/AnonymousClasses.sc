abstract class Animal {
  def eat: Unit
}

//anonymous class -> class $anon$1
val funnyAnimal: Animal =  new Animal{
  override def eat: Unit = println(("ahahahahhaah"))
}

funnyAnimal.getClass