package Gists

import javax.swing.text
import javax.swing.text.Caret

object Generics extends App{

class MyList[A]{
  //use the type A inside the class definition
}

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfString = new MyList[Int]

  //generic methods

  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  class Animal
  class Cat extends Animal //1. Animal List[Cat] extends List[Animal] = COVARIANCE
  class Dog extends Animal


  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  //animalList.add(new Dog)??

  // 2.List of Cats and Dogs are different things = INVARIANCE

  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal] //Gdyby było new InvariantList[Cat] to by był bład

  //CONTRAVIANCE, counterintuitive

  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]


  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal] //trener zwierząt może być trenerem kotów

  //bounded types
  class Cage[A<: Animal] (animal: A)
  val cage = new Cage(new Dog)

  class Car
  val newCage = new Cage(new Car) //błąd kompilatora


}
